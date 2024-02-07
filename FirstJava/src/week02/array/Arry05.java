package week02.array;

public class Arry05 {
    public static void main(String[] args) {
        // 문자(char), 문자여(String)
        //String = char[]

        // 기본형 변수 vs 참조형 변수
        // 기본형 변수 : 소문자로 시작, 참조형변수 : 대문자로 시작
        // - Wrapper class에서 기본형 변수 각ㅁ싸줄 때(boxing) int -> Integer
        // 기본형 변수는 값 자체를 저장, 참조형ㅎ 변수는 별도의 공간에 값을 저장 후 그 주소를 저장

        //String 기능 활용 예시
        String str = "ABCD";

        //length
        int strLength = str.length();
        System.out.println(strLength);

        //charAt(int index)
        char strChar = str.charAt(1);
        System.out.println(strChar);

        //subString(int fromIdx, int toIdx)
        String strSub = str.substring(0,3);
        System.out.println(strSub);

        //equals(String str) -> true, false 반환
        String newStr = "ABCD";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        // toCharArray(0 : String -> char[]
        char[] strCharArray = str.toCharArray();

        // char[] -> String
        char[] charArray = {'a', 'b','c'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);

    }
}
