# 필수 라이브러리
'''
0. Flask : 웹서버를 시작할 수 있는 기능. app이라는 이름으로 플라스크를 시작한다
1. render_template : html파일을 가져와서 보여준다
'''
from flask import Flask, render_template
app = Flask(__name__)

@app.route("/")
def home():
    name = '라미'
    motto = '히히 사는게 왜이래'

    context = {
        "name" : name,
        "motto": motto,
    }
    return render_template('motto.html', data = context)

@app.route("/music")
def music():
    return render_template('music.html')

# 클라이언트에서 받은 요청 변수로 사용하기 <name> -> 매개변수로 전달 됨
@app.route("/iloveyou/<name>/")
def iloveyou(name):
    motto = f"{ name } 짱이야"

    context = {
        'name': name,
        'motto' : motto,
    }
    return render_template('motto.html', data=context)


if __name__ == "__main__":
    app.run(debug=True)