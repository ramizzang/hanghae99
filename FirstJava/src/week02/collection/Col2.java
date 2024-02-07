package week02.collection;

import java.util.LinkedList;

public class Col2 {
    public static void main(String[] args) {
        // linked list
        // 메모리에 남는 공간을 요청해서 여기저기 나누어서 실제 값을 담아둔다
        // 실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조.

        // 기본 기능은 ArrayList와 동일
        // LinkedList 값을 여기저기 나누어서 조회하는 속도 느리다 but 값을 추가하거나, 삭제할때는 빠르다

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(3);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

        System.out.println(linkedList); // 조회속도는 현저히 느리다 -> 퍼저있는걸 가져와야 해서

        linkedList.add(200);
        System.out.println(linkedList);

        linkedList.add(2, 4);
        System.out.println(linkedList);

        linkedList.set(1,30);
        System.out.println(linkedList);

        linkedList.remove(1);
        System.out.println(linkedList);

        linkedList.clear();
        System.out.println(linkedList);
    }
}
