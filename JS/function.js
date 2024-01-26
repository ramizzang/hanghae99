// 또, 특정 문자로 문자열을 나누고 싶은 경우
let myemail = 'sparta@gmail.com'

let result = myemail.split('@') // ['sparta','gmail.com']

//split('') -> ''특정 문자를 기준으로 문자열을 나눠준다.
console.log(result)
console.log(result[0]) // 'sparta'을 출력
console.log(result[1]) // 'gmail.com'을 출력

let result2 = result[1].split('.') // ['gmail','com']

console.log(result2[0]) // gmail -> 우리가 알고 싶었던 것!
console.log(result2[1]) // com

console.log(myemail.split('@')[1].split('.')[0]) 
// gmail -> 간단하게 쓸 수도 있다!


function sum(num1, num2) {// function 함수명(매개변수){수행식}
    return num1 + num2
}

console.log(sum(4,5))