package algorithm;

public class HarshadNumber {
    public static boolean solution(int x) {
        //x의 자릿수의 합으로 x가 나누어져야 한다
        // x : 18 -> x의 합 9  x/x의합 나누어떨어짐
        // x : 하샤드 수
        // 이걸 검사하는 solution을 작성
        // x 1<= 10000 이하인 정수
        int originNum = x;
        int sum = 0;
        while ( x > 0 ) {
            sum += x % 10; // sum에 나머지 저장 x가 998 이라면 8 저장
            x = x / 10; // x / 10 함 x가 998 이었다면 x = 99
        }
        return originNum % sum == 0 ? true : false;

    }
    public static void main(String[] args) {
        System.out.println(solution(20));

    }
}
