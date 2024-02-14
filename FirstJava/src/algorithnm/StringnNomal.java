package algorithnm;

public class StringnNomal {
    //문자열 s 의 길이가 4 or 6
    // 숫자로만 구성됐는지 확인해주는 함수

    public static boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4 || s.length()==6){
            String[] strArr = s.split("");
            for(String str : strArr){
                if(!(str.compareTo("1") >= 0 && str.compareTo("9") <= 0)){
                    // "1" 이상 "9" 이하의 문자열일 때의 처리
                    return false;
                }
            }
        }else{
            return false;
        }

        return answer;
    }

    public static boolean otherSolution(String s) {
        boolean answer2 = true;
        if(s.length()==4 || s.length()==6){
            for(int i = 0; i < s.length(); i++){
                if(!('0'<=s.charAt(i) && s.charAt(i)<='9')){
                    return false;
                }
            }
        }else {
            return false;
        }

        return answer2;
    }
    public static void main(String[] args) {
        System.out.println(solution("a234"));
    }
}
