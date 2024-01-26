//if문
//if(condition){condition이 참일 시 실행}else{거짓일시 실행}
let age = 20
let ages = [12,15,20,25,16,40]

if(age>25){
    //age = 20 if문 거짓으로 if문의 식 수행 하지 않는다.
    console.log('성인')
}else{
    console.log('아가')
}

ages.forEach(element => {//for문을 돌면며 배열의 요소들을 하나씩 검사
    if(element >20){
        console.log(element+'성인')
    }else{
        console.log(element+'아가')
    }
})

