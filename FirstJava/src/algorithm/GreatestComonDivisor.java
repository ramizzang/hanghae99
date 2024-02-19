package algorithm;

public class GreatestComonDivisor {

    //for 문을 사용하여 최대 공약수 구하기
    public static int gcdFor(int a, int b) {
        int answer = 0; // 최대 공약수


        //두 수 중 큰 값과 작은값을 구하기
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        // 두 수를 각각 i로 나눠서 두수의 나머지가 0일때 -> 두수의 최대 공약수
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                answer = i;
            }
        }
        return answer;
    }

    // 최대 공약수 재귀
    public static int gcdRec(int a, int b) {
        // 나머지가 0일 경우 최대 공약수는 b이다.
        if (a % b == 0) {
            return b;
        }
        // 재귀 호출을 통하여 해결.
        return gcdRec(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcdFor(3, 10));
        System.out.println(gcdRec(2, 10));
    }
}
