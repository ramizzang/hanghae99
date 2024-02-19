package algorithm;

public class RideCostManager {

    public static long solution(int price, int money, int count) {
        //놀이기구의 원래 이용료 pric원
        // n번째 이용하면 원래 이용료의 n배
        // 놀이기구 count번 타게되면 가지고 있는 금액에서 얼마가 모자라는지 return
        // 금액이 부족하지 않으면 0
        // 1<=price<=2500
        // 돈 1<= money <= 1,000,000,000 (십억)
        // 1<= count <= 2,500
        long answer = -1;

        // 놀이기구 이용요금
        for(int i = 1; i <= count; i++ ){
            // 1 번탈때마다 돈에서 빼기
            money -= i*price;
        }
        return (long)(money < 0 ? -money : 0);
    }

    public static void main(String[] args) {
        System.out.println(solution(3,20,4));
    }
}
