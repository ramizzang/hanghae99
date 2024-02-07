package week02.operator;

public class W06 {
    public static void main(String[] args) {
        //대입연산자 주의점
        // ++, --
        int a = 10;
        int b = 10;
//        int val = ++a + b--; // a:11, b : 9 = 20 -> 기대값
//        System.out.println(val); // val : 21
        // 증가연산자(++), 감소연산자(--)가 전위에 있을때 : 증감 or 증가 후 식에 대입하여 계산
        int val = ++a + b--; // a:11(증가 후 대입), b : 10(대입 후 감소) = 21

        System.out.println("a :"+ a + ", b: "+b+", val: "+val); //a :11, b: 9, val: 21

        // 증가연산자(++), 감소연산자(--)가 후위에 있을때 : 식 먼저 계산후, 증감 or 증가 수행


    }
}
