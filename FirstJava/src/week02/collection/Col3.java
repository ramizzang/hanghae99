package week02.collection;

import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        //Stack
        //수직으로 값을 쌓아놓고 넣었다가뺀다 LIFO(LIST In First Out)
        // push, peek, pop
        // 최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을때 사용한다

        //선언 및 생성
        Stack<Integer> intStack = new Stack<>();

        //.push(); -> 값을 밀어 넣는다
        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        //다 지워질 때 까지 출력한다
        while(!intStack.isEmpty()){
            //.pop() -> 데이터를 하나씩 뺀다
            System.out.println(intStack.pop()); //1 , 15, 10 순으로 출력 ( 최신 데이터 부터 출력 됨)
        }

        //다시 추가
        //.push(); -> 값을 밀어 넣는다
        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        // .peek
        System.out.println(intStack.peek()); // 1 출력 -> 가장 위에 있는 데이터 출력(가장 나중에 넣은)
        System.out.println(intStack.size()); // 3 출력 stack 의 길이 출력
    }
}
