package week02.operator;

public class W15 {
    public static void main(String[] args) {
        //for
        for (int i = 0; i < 4; i++) {
            System.out.println(i + " 번째 출력");
        }
        //향상된 for 문
        int[] numbers = {3, 6, 9, 12, 15};
        for (int number : numbers) { // number 가 numbers 만큼을 돌면서 for문을 짆애
            System.out.print(number + " ");
        }
        // for문으로 변경하면 동일한 값 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
