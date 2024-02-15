package algorithnm;

public class RangeSumCalculator {
    public static void main(String[] args) {
        int a = 5; // 5
        int b = 5; // 3
        long sum = 0;
        //대소관계 정해지지 않았다.
//        sum += a+i; // a < b
//        sum += a-i; // a > b

        for(int i =0; i<= (a < b ? b-a : a-b); i++){
            sum += a < b ? a+i : a-i;
        }


    }
}
