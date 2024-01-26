// //list, dic(객체) 자료형
// //list = [] 로 초기화 및 선언
// let a_list = []
// let b_list = [1, 2, 'ee', 3]

// console.log(b_list) // list 전체 출력
// console.log(b_list[0]) //b_list 의 0번째 요소를 출력(index)로 접근

// //list.push() -> list에 내용 추가, 리스트의 가장 끝부분에 추가된다.
// b_list.push('하이')
// console.log(b_list) //출력 결과 : [1, 2, 'ee', 3, '하이']
// console.log(b_list.length) //list.lenth d-> list의 길이(요소의 개수)를 반환해준다.

// //Object : 키(key), 벨류(value) 한 쌍으로 이루어 진 객체, ket 는 중복 될 수 x, 문자열 이어야 한다.
// let a_dict = {}
// let b_dict = {
//     'name': 'bob',
//     'age': 21
// }

// console.log(b_dict['name']) //key 에 접근하여 value 값 출력
// console.log(b_dict['age'])

// //object에 key,value 추가 : obj[key] = value 하면 추가 
// b_dict['height'] = 180
// console.log(b_dict)

//object로 이루어진 list
names = [
    { 'name': 'bob', 'age': 20 },
    { 'name': 'carry', 'age': 19 }
]

console.log(names[0]['name'])
console.log(names[1]['name'])

//객체로 이루어진 list에 요소 추가
newObject = { 'name': 'rami', 'age': 32 } //1.객체추가(list의 요소가 객체임)
names.push(newObject)//list에 요소 추가 list.push()

console.log(names)//출력결과 정상 추가 확인