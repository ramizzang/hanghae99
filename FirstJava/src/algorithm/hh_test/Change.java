package algorithm.hh_test;

public class Change {
    //1000원 가지고 편의점에서 물건 사려고 했다
    // 500,100,50,10
    // 거스름돈 개수가 가장 적게 잔돈을 준다
    // 편의점에서 물건을 사고 1000원 지폐 한장을 냈을 때 받을 잔돈의 개수를 구해라
    // 10원 이상 1000원 미만
    // 잔돈의 개수
    public int solution(int num) {

        int change = 1000;
        int count = 0;

        //잔돈 계산
        change = change - num;

        //동전 개수 계산
        int[] coins = {500,100,50,10};
        for(int coin : coins){
            count += change / coin;
            System.out.println(change);

            //배열 돌면서 나머지 계산
            change %= coin;
        }

        return count;
    }

    public static void main(String[] args) {
        Change method = new Change();
        int num1 = 10;
        System.out.println(method.solution(num1));
    }

}
