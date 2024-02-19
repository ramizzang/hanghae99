package algorithm;

public class FoodFight {
    //선수들 1:1
    //중앙에 물, 물 먼저먹으면 승리
    // 두선수가 먹는 음식 종류와 양 같다
    // 음식 먹는 순서도 같다
    // 칼로리가 낮은 음식을 먼저 ㅁ거는다
    //1-3 2-4 3-6 물:0
    // -> 1:1 2:2 3:3
    public static String solution(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};
        System.out.println(solution(food));
    }
}
