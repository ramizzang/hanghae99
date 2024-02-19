package algorithm;

public class ChangeCoke {

    public static int solution(int a, int b, int n) {
        int answer = 0;

        //마트에 주는 병 a
        //마트가 주는 병 b
        //가지고 있는 병 n
        System.out.println(n%a+n/a*b); // 병 주고 남는거
        System.out.println(n/a*b); // 5개 주면 3개 받을 수 있음


        while(n >= a){
            System.out.println(n%a+n/a*b);
            answer += n/a*b;
            n = (n%a+n/a*b);

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5,3,21));
    }
}
