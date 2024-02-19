package algorithm;

import java.util.Arrays;

public class KthNumber {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        // 배열 array i번째 숫자부터 j번째 숫자까지 자르고 정렬했을때 k번째에 있는수
        // 2차원배열
        // ijk -> 이차원 배열

        for(int i=0; i < commands.length; i++){
            int[] subArray = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);

            Arrays.sort(subArray);

            answer[i] = subArray[commands[i][2]-1];
        }

        System.out.println("======향상향상향상===========");


        return answer;
    }
    public static void main(String[] args) {
        int[] arr= {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution(arr, commands)));
    }
}
