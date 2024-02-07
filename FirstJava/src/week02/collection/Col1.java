package week02.collection;

import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {
        // List
        // 순서가 있는 데이터의 집합
        // 처음에 길이를 몰라도 만들 수 있다 (<-> array 최초의 길이를 알아야 한다)
        // array : 정적 배열
        // List(ArrayList) -> 동적배열(크기가 가변적으로 늘어난다)
        // - 생성 시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담아놓는다.
        // - 값이 추가될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장하기때문에 상관 x

        // List 선언과 생성 동시에
        ArrayList<Integer> intList = new ArrayList<Integer>();

        // List에 값 추가 list.add(value); -> 추가한 순서대로 index에 저장된다
        intList.add(99);
        intList.add(15);
        intList.add(3);

        // List 값 가져오기 list.get(index);
        System.out.println(intList.get(0));

        // 2번째 있는 값을 변경, list.set(변경할index, 변경할value);
        System.out.println(intList.get(1));
        intList.set(1,50);
        System.out.println(intList.get(1));

        // list의 값 삭제, list.remove(index) -> index번째 값 삭제
        System.out.println(intList); //[99, 50, 3]
        intList.remove(1); // 50 삭제
        System.out.println(intList.get(1)); // 3 -> 50이 삭제 되어 3이 앞으로 당겨져서 index 1이 된 것 알 수 있음

        // 리스트 전체 값 삭제 : list.clear();
        System.out.println(intList);
        intList.clear();
        // ArrayList  클래스가 AbstractCollection 클래스를 상속하였기 때문에 toString() 메서드를 기본적으로 구현한다.
        System.out.println(intList.toString());



    }
}
