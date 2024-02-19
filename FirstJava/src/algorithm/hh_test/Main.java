package algorithm.hh_test;

public class Main {
    // 1. 문자 split 하여 int 배열로 저장
    // 2. 소수인 수의의 최대값, 소수가 아닌수의 최소값
    // 3. 최소값 최대값 -> 문자열로 반환
    public String solution(String s) {
        int[] numbers = new int[s.split(" ").length];

        int idx = 0;
        //문자열 int 배열로 변환
        for (String number : s.split(" ")) {
            numbers[idx] = Integer.parseInt(number);
            idx++;
        }

        // 최대,최소 초기 설정
        int minNum = Integer.MAX_VALUE;
        int maxPrime = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (isPrime(num)) {
                // 소수 판정, 소수들의 최대값 저장
                maxPrime = Math.max(maxPrime, num);
            } else {
                // 소수가 아닌 수 중 최소값 저장
                minNum = Math.min(minNum, num);
            }
        }
        //int + 문자열 더해줘서 변환
        return  minNum + " " + maxPrime;
    }

    //소수 확인
    private boolean isPrime(int num) {
        if (num < 2) {//num 은 2보다 커야함 소수는 2 이상의 수
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        Main method = new Main();
        String s = "97 75 88 99 95 92 73";

        System.out.println(method.solution(s));

    }
}
