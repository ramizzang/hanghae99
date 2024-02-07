package week02.array;

import java.util.Arrays;

public class Arr04 {
    public static void main(String[] args) {
        // Arrays.copyOf() 메서드를 통한 배열 복사
        int[] a = {1,2,3,4};
        int[] b = Arrays.copyOf(a, a.length); //배열과 함께 length값도 같이 넣어준다

        a[3] = 0;
        // 복사한 b 배열에 영향이 없는 것 확인, 깊은 복사가 되었다. 서로의 주소가 다르다.
        System.out.println(a[3]); //0
        System.out.println(b[3]); //4
    }
}
