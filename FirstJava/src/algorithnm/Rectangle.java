package algorithnm;

import java.util.Arrays;

public class Rectangle {
    public static int solution(int[][] sizes) {
        int answer = 0;

        int maxWidth = 0;
        int maxHeight = 0;

        // 행 내에서 정렬
        for(int[] size : sizes){
            int width = size[0];
            int height = size[1];

            // 가로, 세로 중 더 큰 값을 가로에 저장 -> maxWidth와 비교하여 가로 길이중 가장 긴 값을 반환
            maxWidth = Math.max(maxWidth, Math.max(width, height));
            // 가로, 세로 중 더 작은 값을 세로에 저장 -> maxHeight 와 비교하여 세로 길이중 가장 긴 값을 반환
            maxHeight = Math.max(maxHeight, Math.min(width, height));
        }

        // 만들 수 있는 가장 작은 크기의 지갑
        return  maxWidth * maxHeight;

    }
    public static void main(String[] args) {
        int[][] sizes = {
                {60,50},
                {30,70},
                {60,30},
                {80,40}
        };
        System.out.println(solution(sizes));

    }
}
