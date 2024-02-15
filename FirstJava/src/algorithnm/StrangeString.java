package algorithnm;

public class StrangeString {

    public static String solution(String s) {
        // 하나 이상의 공백 문자로 구분
        // 각 단어의 짝수번째 알파벳은대문자
        // 홀수번째 알파벳은 소문자
        // 공백을 기준으로 짝,홀 인덱스를 판단
        // 공백을 기준으로 나누고 문자를 다시 더할때 공백 더해주기 length 가 기존 length랑 다르면 공백 더해주기

        String[] words = s.split(" ");
        String answer = "";

        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                //짝수이면서 소문자면 대문자로 변환
                if((i+1) % 2 == 0 && ('a' <= word.charAt(i) && word.charAt(i) <= 'z')){
                    answer += word.charAt(i);
                }else{ // 짝수이면서 대문자면 소문자로 변환
                    answer += (char)(word.charAt(i)-32);
                }
            }
            answer += " ";
        }
        if(answer.length() > s.length()){
            answer = answer.substring(0,answer.length()-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("try hello world "));

    }
}
