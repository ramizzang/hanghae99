package algorithnm;

import java.util.HashMap;
import java.util.Map;

public class StringNumAndWord {
    //제한시간 10초
    //234567 → "23four5six7"
    // s가 의미하는 원래 숫자를 return
    // zero or 0 으로 시작하는 경우는 없다

    public static int solution(String s) {
        String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0; i < number.length; i++){
            s = s.replaceAll(number[i], Integer.toString(i));
            System.out.println(s);
        }
        System.out.println(Integer.parseInt(s));

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("23four5six7"));
    }
}
