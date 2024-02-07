package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        //Queue : FIFO
        // add(추가), peek(조회), poll(꺼내기)
        //Queue : 생성자가 없는 인터페이스

        //Queue 선언, 생성
        Queue<Integer> intQueue = new LinkedList<>();

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while(!intQueue.isEmpty()){
            System.out.println(intQueue.poll()); //FIFO -> 1,5,9 순으로 출력 (처음 추가한 것 먼저 출력)
        }

        //다시 추가
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);
        intQueue.add(10);

        System.out.println(intQueue.peek()); // 1 출력 , -> 가장먼저 추가된 것 조회
        System.out.println(intQueue.size()); // 4 출력, -> queue의 길이 출력
    }
}
