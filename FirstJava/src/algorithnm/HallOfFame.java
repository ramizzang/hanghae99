package algorithnm;

import java.util.*;

public class HallOfFame {
    // 1명의 가수가 노래를 부른다
    // 지금까지 출연 가수들의 점수 중 상위 k번째 이내이면 명예의 전당
    // k = 명예의 전당에 오르는 상위 점수의 개수
    // score = 지금까지의 점수
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> rank = new ArrayList<>();

        for(int i=0; i<score.length; i++){
            rank.add(score[i]);
            if(rank.size()>k){ //가장 낮은 점수 제거
                rank.remove(Collections.min(rank));
            }
            answer[i] = Collections.min(rank);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] score = {10,100,20,150,1,100,200};
        System.out.println(Arrays.toString(solution(3,score)));
    }
}
