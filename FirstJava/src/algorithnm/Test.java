package algorithnm;

public class Test {
    public static void main(String[] args) {
        int answer = 0;
        int left = 24;
        int right = 27;
        //짝수는 더하고 13~17 까지 모든 수
        //홀수는 뺀수 return
        for(int i = left; i<=right; i++){ //13~17 돈다
            //약수를 구해야
            answer += measure(i)%2 == 0 ? i : -i;
        }
        System.out.println(answer);
    }

    public static int measure(int number){ // 약수의 개수를 구하는 메서드
        int result = 0;

            for(int i = 1; i <= number; i++){
                if(number % i == 0){
                    result++;
                }
            }
        return result;
    }
}
