package algorithm;

public class CaesarCipher {
    public static String solution(String s, int n) {
        String answer = "";
        char[] chArr = s.toCharArray();
        // AB 1만큼 밀면 BC
        // Z 1 밀면 A
        // 대문자,소문자, 공백
        for(char ch : chArr){
         if('a'<=ch && ch<='z'){ //ch가 소문자일때
             ch = (char)(ch + n) > 'z' ? (char)(ch - 26 + n) : (char)(ch + n);
             // ch + n > z ? ch - z + n : ch + n
         }
         else if ('A'<=ch && ch<='Z') { //ch가 대문자일때
             ch = (char)(ch + n) > 'Z' ? (char)(ch - 26 + n) : (char)(ch + n);
         }
         answer += ch;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("a B z",4));
    }
}
