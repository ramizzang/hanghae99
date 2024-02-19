package algorithm;

import java.util.Arrays;

public class DeleteMin {
    public static int[] solution(int[] arr) {
        //배열 생성
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int[] answer = Arrays.copyOf(arr, arr.length - 1);

        //가장 작은 수를 제거한 배열을 리턴, 빈 배열일 경우 -1 채워서 리턴

        int minIdx = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i] < arr[minIdx]){
                //minIdx에 i를 저장
                minIdx = i;
            }
        }

        for(int i = minIdx; i < answer.length; i++){
            answer[i] = arr[i +1];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1,0})));
    }
}
