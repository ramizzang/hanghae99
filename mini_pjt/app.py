import os
from flask import Flask, url_for, render_template
from flask import request, redirect, session
from flask_sqlalchemy import SQLAlchemy
import hashlib


basedir = os.path.abspath(os.path.dirname(__file__))
app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] =\
        'sqlite:///' + os.path.join(basedir, 'database.db')

db = SQLAlchemy(app)

app.secret_key = 'your_secret_key'

@app.errorhandler(404)
def page_not_found(error):
    return render_template('page_not_found.html'), 404


class User(db.Model):
    """ Create user table"""
    id = db.Column(db.Integer, primary_key=True)
    username = db.Column(db.String(80), unique=True)
    password = db.Column(db.String(80))
    email = db.Column(db.String(80), unique=True)

    def __init__(self, username, password, email):
        self.username = username
        self.password = password
        self.email = email
with app.app_context():
    db.create_all()


# 회원가입 라우트
@app.route('/signup', methods=['GET', 'POST'])
def signup():
    if request.method == 'POST':
        username = request.form['username']
        password = hashlib.sha256(request.form['password'].encode()).hexdigest()
        
        new_user = User(username=username, password=password)
        db.session.add(new_user)
        db.session.commit()
        
        return redirect(url_for('login'))
    
    return render_template('signup.html')

# 로그인 라우트
@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        username = request.form['username']
        password = hashlib.sha256(request.form['password'].encode()).hexdigest()

        user = User.query.filter_by(username=username, password=password).first()

        if user:
            session['user_id'] = user.id
            return redirect(url_for('dashboard'))
    
    return render_template('login.html')

# 탈퇴 라우트
@app.route('/withdraw')
def withdraw():
    if 'user_id' in session:
        user_id = session['user_id']
        user = User.query.get(user_id)

        if user:
            db.session.delete(user)
            db.session.commit()
            session.pop('user_id', None)

    return redirect(url_for('home'))

# 정보 수정 라우트
@app.route('/update', methods=['GET', 'POST'])
def update():
    if 'user_id' in session:
        user_id = session['user_id']
        user = User.query.get(user_id)

        if user:
            if request.method == 'POST':
                user.username = request.form['new_username']
                user.password = hashlib.sha256(request.form['new_password'].encode()).hexdigest()
                db.session.commit()
                return redirect(url_for('dashboard'))
                
            return render_template('update.html', user=user)

    return redirect(url_for('home'))

# 계정 삭제 라우트
@app.route('/delete')
def delete():
    if 'user_id' in session:
        user_id = session['user_id']
        user = User.query.get(user_id)

        if user:
            db.session.delete(user)
            db.session.commit()
            session.pop('user_id', None)

    return redirect(url_for('home'))

@app.route('/')
def home():

    return render_template('index.html')



# 로그아웃 라우트
@app.route('/logout')
def logout():
    session.pop('user_id', None)
    return redirect(url_for('home'))


if __name__ == '__main__':
    app.secret_key = "123123123"
    app.run(debug=True)
