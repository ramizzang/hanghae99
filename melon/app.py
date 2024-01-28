from flask import Flask, render_template
from bs4 import BeautifulSoup
import requests

app = Flask(__name__)

@app.route('/')
def index():


    return render_template('index.html')

@app.route('/melon')
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
        song = chart.select_one('.rank01 > span > a').text #노래 제목
        artist = chart.select_one('.rank02 > a').text #가수
        rank = chart.select_one('.rank').text #순위
        img_src = chart.select_one('img')['src']
        # print(melon_chart)
        
        melon_chart.append({'song': song,'artist': artist, 'rank': rank, 'img_src': img_src}) 
    



    return render_template('index.html', data = melon_chart)

if __name__ == '__main__':
    app.run()