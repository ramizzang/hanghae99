package week02.operator;

public class W12 {
    public static void main(String[] args) {
        // 중첩 if 문
        boolean flag = true;
        int number = 2;
        if (flag) {
            if (number == 1) {
                System.out.println("flag가 true고, number 값은 1입니다");
            } else if (number == 2) {
                System.out.println("flag가 true고, number 값은 2입니다");
            } else {
                System.out.println("flag가 true고, number 값은 모르겠습니다");
            }// 중첩 if end
        } else {
            if (number == 1) {
                System.out.println("flag가 false, number 값은 1입니다");
            } else if (number == 2) {
                System.out.println("flag가 false, number 값은 2입니다");
            } else {
                System.out.println("flag가 false, number 값은 모르겠습니다");
            }
        }
    }
}
