# render_template -> flasnk 기능으로 요청이 들어오면 정적 페이지 반환
# request 서버에서 보낸 요청 받기
# from flask import Flask, render_template, request
from flask import Flask, render_template, request
import random
import requests
app = Flask(__name__)


@app.route('/')
def home():
    name = '라미'
    lotto = [16, 18, 22, 43, 32, 11]
    random_lotto = [13, 14, 15, 16, 25, 29]

    # 로또 랜덤 번호 생성
    def generate_lototo_numbers():
        numbers = random.sample(range(1, 46), 6)
        return sorted(numbers)
    random_lotto = generate_lototo_numbers()

    # 로또 번호 확인(lotto와 random_lotto 비교)
    def count_common_elements(list1, list2):
        common_elements = set(list1) & set(list2)
        return len(common_elements)

    common_count = count_common_elements(lotto, random_lotto)

    context = {
        "name": name,
        "lotto": lotto,
        "random_lotto": random_lotto,
        "common_count": common_count,
    }

    # app.route()에 요청이 들어오면 render_template()에 있는 내용 반환
    return render_template('index.html', data=context)


@app.route('/mypage')
def mypage():
    return 'This is mypage'


@app.route('/movie')
def movie():
    # movie.html 에서 query라는 이름으로 보낸 데이터
    query = request.args.get('query')

    # 영화진흥의원회 api에 query 데이
    res = requests.get(
        f"http://kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieList.json?key=f5eef3421c602c6cb7ea224104795888&movieNm={
            query}"
    )
    rjson = res.json()
    movie_list = rjson["movieListResult"]["movieList"]
    print(movie_list)
    return render_template('movie.html', data=movie_list)


@app.route("/answer")
def answer():

    # query = request.args.get('query')

    # if not query:
    #     query = '20230601'

    # if request.args.get('query'):
    #     query = request.args.get('query')
    # else:
    #     query = '20230601'
    
    # get 메서드에의 두번째 매개변수로 기본값 설정을 할 수도 있다.
    query = request.args.get('query','20230601')

    URL = f"http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt={
        query}"

    res = requests.get(URL)

    rjson = res.json()

    serch_list = rjson['boxOfficeResult']['weeklyBoxOfficeList']

    return render_template("answer.html", data=serch_list)


if __name__ == '__main__':
    app.run()
