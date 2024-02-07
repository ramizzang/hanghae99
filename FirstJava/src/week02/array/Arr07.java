package week02.array;

public class Arr07 {
    public static void main(String[] args) {
        //가변배열
        // 배열 초기화
        int[][] array = new int[3][]; //길이를 생략하면 배열 길이를 가변적으로 지정 할 수 있다

        //배열 원소바다 각기 다른 크기로 지정
        array[0] = new int[2];
        array[1] = new int[4];
        array[2] = new int[1];

        // 중괄호로 초기화 할 때도 가능
        int[][] array2 = {
                {10,20},
                {10,20,30,40},
                {10},
        };
    }
}
