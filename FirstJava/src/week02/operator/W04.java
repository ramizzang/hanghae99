package week02.operator;

public class W04 {
    public static void main(String[] args) {
        //논리 연산자( &&(and), ||(or), !(not))
        //비교 연산의 결과값으로 받을 수 있는 boolean 값을 연결하는 연산자
        //조건을 연결 하였을 때 boolean 값들을 조합하여 참 또는 거짓인 값인 boolean 값을 출력
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println("====================");


        // 피 연산자 중 하나라도 true 이면 true -> or 조건
        System.out.println(flag1 || flag2); // true || true -> true
        System.out.println(flag1 || flag2 || flag3); // true || true || false -> true
        System.out.println("====================");

        // 피 연산자 모두 true 이면 true -> and 조건
        System.out.println(flag1 && flag2); // true || true -> true
        System.out.println(flag1 && flag2 && flag3); // true || true || false -> false
        System.out.println("====================");

        // and
        System.out.println((5 > 3) && (3 > 1)); // true && true -> true
        System.out.println((5 > 3) && (3 < 1)); // true && false -> false
        System.out.println("====================");


        // or
        System.out.println((5 > 3) || (3 > 1)); // true || true -> true
        System.out.println((5 > 3) || (3 < 1)); // true || false -> true
        System.out.println((5 < 3) || (3 < 1)); // false || false -> false
        System.out.println("====================");

        // 논리 부정 연산자(! : not)
        System.out.println(!flag1); //!ture -> false
        System.out.println(!flag3); //!false -> true
        System.out.println(!(5 == 5)); //!true -> false
        System.out.println(!(5 == 3)); //!false -> true
    }
}
