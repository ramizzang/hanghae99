package week02.array;

import java.util.Arrays;

public class Arr01 {
    public static void main(String[] args) {
        //배열 생성
        int[] intArray = new int[3]; //{0,0,0}
        boolean[] boolArray = new boolean[3]; // {false, false, false}
        String[] stringArray = new String[3]; // {"","",""}

        //배열 선언 먼저 -> 초기화 나중
        int[] intArray2; //선언 먼저
        intArray2 = new int[3]; // 초기화 나중

        // 생성한 배열을 순회 -> 배열을 값을 하나씩 꺼내서 조회
        // 하나씩 조회
        System.out.println(intArray[1]); // 접근하고자 하는 배열의 index 위치로 조회

        // 다건 조회
        // lenghtl : 길이를 구하는 메서드
        for (int i = 0; i < intArray2.length; i++) {
            System.out.println(intArray2[i]);
        }

    }
}
