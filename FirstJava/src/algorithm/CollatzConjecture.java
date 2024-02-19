package algorithm;

public class CollatzConjecture {
    public static void main(String[] args) {
        //주어진 수가 1이 될때까지 반복
        // 입력된 수가 짝수라면 2로 나눈다
        // 입력된 수가 홀수라면 3을 곱하고 1을 더한다
        // 결과로 나온 수에 같은 작업을 1이 될때까지 반복한다.
        // 주어진 수가 1 -> 0 / 반복 500 이상한다면 -1 return

        long num = 626331;
        int result = 0;

        // 수의 홀, 짝 확인
        while (num != 1) {// 1이면 아예 돌아가지 않는다
            num = (num % 2 == 0 )? num / 2 : num * 3 + 1;
            result++;

            if (result == 500) {
                result = -1;
                break;
            }
        }
        System.out.println(result);
    }
}
