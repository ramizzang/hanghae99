package algorithm;

public class intNumber{
    public int getStrToInt(String str) {
        boolean sign = true;
        int result = 0;




        char chSign = str.charAt(0);
        if(chSign == '-'){
            sign = false;
        } else if (chSign != '+') {
            result = chSign - '0';
        }

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            result = result * 10 + (ch - '0');
        }

        return sign ? result : -result;
    }
    //아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String args[]) {
        double number = 25.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("제곱근: " + squareRoot);


        double result = Math.pow(5, 3);
        System.out.println("제곱: " + result);
    }

}

