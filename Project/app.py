# 필수 라이브러리
'''
0. Flask : 웹서버를 시작할 수 있는 기능. app이라는 이름으로 플라스크를 시작한다
1. render_template : html파일을 가져와서 보여준다
'''
from bs4 import BeautifulSoup
from flask import Flask, render_template, request, redirect, url_for
import requests
app = Flask(__name__)

# db 기본 코드
import os
from flask_sqlalchemy import SQLAlchemy

basedir = os.path.abspath(os.path.dirname(__file__))
app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] =\
        'sqlite:///' + os.path.join(basedir, 'database.db')

db = SQLAlchemy(app)

class Song(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    username = db.Column(db.String(100), nullable=False)
    artist = db.Column(db.String(100), nullable=False)
    title = db.Column(db.String(100), nullable=False)
    image_url = db.Column(db.String(10000), nullable=False)

    def __repr__(self):
        return f'{self.username} {self.title} 추천 by {self.username}'

with app.app_context():
    db.create_all()


@app.route("/")
def home():
    name = '라미'
    motto = '히히 사는게 왜이래'

    context = {
        "name" : name,
        "motto": motto,
    }
    return render_template('motto.html', data = context)

@app.route("/music/")
def music():
    # db에 있는 모든 데이터 song_list에 저장
    song_list = Song.query.all()

    return render_template('music.html', data = song_list)

@app.route("/music/<username>/")
def render_music_filter(username):

    # username 서치하여 list 가져오기
    filter_list = Song.query.filter_by(username=username).all()

    return render_template('music.html', data = filter_list)

# 클라이언트에서 받은 요청 변수로 사용하기 <name> -> 매개변수로 전달 됨
@app.route("/iloveyou/<name>/")
def iloveyou(name):
    motto = f"{ name } 짱이야"

    context = {
        'name': name,
        'motto' : motto,
    }
    return render_template('motto.html', data=context)

@app.route("/music/create/")
def music_create():
    # form에서 보낸 데이터 받아오기(사용자 입력 데이터)
    username = request.args.get("username")
    title = request.args.get("title")
    artist = request.args.get("artist")
    image = request.args.get("image")
    

    # 데이터 db에 저장하기
    # db에 저장하기 위해 객체로 저장
    song = Song(username = username, title = title, artist = artist, image_url = image)
    # db 세션에 저장
    db.session.add(song)
    # db에 완전 commit
    db.session.commit()

    # return render_template('music.html')
    # 데이터 추가 후 redirect 해준다 render_music_filter로 username을 가지고
    return redirect(url_for('render_music_filter', username = username))


@app.route('/delete_song', methods=['POST'])
def delete_song():

    # song_id 가져오기
    song_id = request.form.get("song_id")

    # db에서 삭제할 노래 조회
    delete_song = Song.query.filter_by(id=song_id).first()
    
    # db에서 노래 삭제
    db.session.delete(delete_song)
    db.session.commit()


    return redirect(url_for('music'))



@app.route('/auto_add')
def melon():
    # # 스크랩할 url(melon)
    url = "https://www.melon.com/chart/"

    # 웹 브라우저처럼 보이도록 User-Agent 설정 (안하면 안될 수도 있음;;)   
    headers = {'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
    data = requests.get(url, headers=headers)
    soup = BeautifulSoup(data.text, 'html.parser')

    melon_chart = []
    chart_rows = soup.select('table > tbody > tr')
    for chart in chart_rows:
        title = chart.select_one('.rank01 > span > a').text #노래 제목
        artist = chart.select_one('.rank02 > a').text #가수
        rank = int(chart.select_one('.rank').text) #순위
        image = chart.select_one('img')['src']
        # print(melon_chart)

        if rank < 30:
            username = '가라미'
        elif rank < 60:
            username = '라미'
        else:
            username = '가람짱'

        song = Song(username = username, title = title, artist = artist, image_url = image)
        db.session.add(song)
        # db에 완전 commit
        db.session.commit()

    return redirect(url_for('music'))

if __name__ == "__main__":
    app.run(debug=True)