package week02.array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        // 초기화

        // 배열에 특정값 대입하여 선언
//        int[] intArr = {1, 2, 3, 4, 5};
//        String[] stringArray = {"a", "b", "c", "d", "e"};
//
//        // for문을 통해서 대입
//        for(int i=0; i<intArr.length; i++){
//            intArr[i] = i;
//        }
//        for(int i=0; i<intArr.length; i++){
//            System.out.println(intArr[i]);
//        }
//
//        //향상된 for문을 통하나 출력
//        for(int i: intArr){
//            System.out.println(i);
//        }

        int[] intArr = {10, 20, 30, 40, 50};

        // 배열의 주소를 모두 같은 값으로 초기화
        Arrays.fill(intArr, 1);

        for(int item: intArr){
            System.out.println(item);
        }

        System.out.println(Arrays.toString(intArr));
    }
}
