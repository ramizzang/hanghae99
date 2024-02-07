package week02.operator;

public class W08 {
    public static void main(String[] args) {
        // 연산자 우선수위 [산술 > 비교 > 논리 > 대입]
        // 괄호로 감싸주면 괄호의 연산이 최우선으로 계산된다
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z; // 비교 > 논리 -> true && true -> true
        System.out.println(result);//true

        result = x + 10 < y && y < z; // 산술 > 비교 > 논리 -> 12 < 9(false) && 9 < 10 (true) ->false
        System.out.println(result);//false

        result = x + 2 * 3 > y; //8>9 ->false
        System.out.println(result);
        System.out.println("========================");

        result = (x + 2) * 3 > y; //12>9 ->true 괄호 우선
        System.out.println(result);
    }
}
