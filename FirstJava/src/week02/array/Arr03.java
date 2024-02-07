package week02.array;

import java.util.Objects;

public class Arr03 {
    public static void main(String[] args) {
        int[] a= {1,2,3,4};
        int[] b = a; //얕은 복사

        b[0] = 3; // 배열 b의 0번째 순번값을 3으로 수정(1->3)

        System.out.println("a주소 : "+ a+" / b주소 : "+ b); //a주소 : [I@16b98e56 / b주소 : [I@16b98e56 주소값 동일한 것 알 수 있음
        System.out.println(a[0]);// 출력 3 -> 배열 a의 0번째 순번값도 3으로 변경됨
    }


}
