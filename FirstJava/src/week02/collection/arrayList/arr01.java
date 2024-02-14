package week02.collection.arrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class arr01 {
    public static void main(String[] args) {
        //기본 길이가 10인 ArrayList 생성
        ArrayList list1 = new ArrayList(10);

        //ArrayList에는 객체만 저장 가능
        list1.add(5); // autoboxing에 의해 기본형이 참조형의로 자동 변환 된다
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        //ArrayList(Collection c)
        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        //Collection은 인터페이스, Collections은 유틸클래스
        Collections.sort(list1);	// list1과 list2를 정렬한다.
        Collections.sort(list2);	// Collections.sort(List l)
        print(list1, list2);

        System.out.println(list1.containsAll(list2)); // true -> list1 이 list2의 모든 요소를 포함하고 있냐? 라고 물어보거

        list2.add("B"); // 위치 지정하지 않고 추가시 가장 뒤에 추가된다.
        list2.add("C");
        list2.add(3, "A"); // 추가할 위치를 지정하여 추가
        print(list1, list2);

        list2.set(3, "AA"); //list2의 인덱스3 의 요소를 "AA"로 변경한다
        print(list1, list2);

        list1.add(0,"1");
        //indexOf() : 지정된 객체의 위치(인덱스)를 알려준다.
        print(list1, list2);
        System.out.println(list1.indexOf("1"));

        list1.remove(0);
        list1.remove(new Integer(1)); // 해당 value 를 삭제할 수 있다.
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기고 나머지 삭제(교집합)
        // retainAll()
        System.out.println(list1.retainAll(list2));
        print(list1, list2);

        // list2에서 list1에 포함된 객체들 삭제
        for(int i = list2.size()-1; i >= 0; i--){ //감소하면서 포함되는지 확인
            if(list1.contains(list2.get(i))){ // list2(i) 값이 list1 에 포함된 값이면 해당 값을 삭제해 준다.
            list2.remove(i);
            }
        }
        print(list1, list2);

    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
}
