package algorithnm;

import java.util.ArrayList;
import java.util.List;

public class 삼진법뒤집기 {
    public static int solution(int n) {
        int answer = 0;
        List<Integer> threeNum = new ArrayList<>();
        // 10진수를 3진수로 거꾸로 저장 된다
        while (n > 0){
            threeNum.add(n % 3) ;
            n = n / 3;
        }

        //3진수를 10진수로
        for(int i=threeNum.size()-1; i>=0; i--){ //4,3,2,1,0 get(i) = 0,1,2,3,4
            answer += (int)Math.pow(3,i)*threeNum.get(threeNum.size()-i-1);

        }
        //
        System.out.println(threeNum);

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(125));
    }
}
