package algorithnm;

public class 문자열기본 {

    public static boolean solution(String str) {
        int len = str.length();
        if(!(len == 4 || len == 6)) {
            return false;
        }
//        s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다
        for(char ch : str.toCharArray()){
            System.out.println(ch);
            if('a'<=ch && ch<='z' || 'A'<=ch && ch<='Z'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //문자열 s의 길이가 4 or 6
        //숫자로만 구성됐는지 확인해주는 gkatn
        //s가 a234 이면
        System.out.println(solution("1234"));
        System.out.println(solution("a123"));
    }
}
