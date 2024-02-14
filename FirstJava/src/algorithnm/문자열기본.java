package algorithnm;

public class 문자열기본 {
    public static void main(String[] args) {
        String s = "a234";
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6){
            for(int i=0; i<s.length(); i++){
                if(!('0'<= s.charAt(i) && s.charAt(i) <= '9') ){
//                    return false;
                }
            }
        }else{
//            return false;
        }
    }
}
