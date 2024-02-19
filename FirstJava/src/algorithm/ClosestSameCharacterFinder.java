package algorithm;

import java.util.Arrays;
import java.util.HashMap;

public class ClosestSameCharacterFinder {
    //문자열 s가 주어진다. s의 각 위치마다 자신보다 앞에 나왔으면서 자신과 가장 가까운 곳에 있는 같은글자
    //s = banana
    // charAt(i) -> 문자열의 위치
    // s를 돌면서 검사
    // banana -> banana 검사
    // 0 ->
    // 1 -> 0
    // 2 -> 0,1
    // 3 -> 0,1,2
    // 4 -> 0,1,2,3
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> idxMap = new HashMap<>();

//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            Integer idx = idxMap.get(ch);
//
//            if(idx == null){
//                answer[i] = -1;
//            }else{
//                answer[i] = i-idx;
//            }
//            idxMap.put(ch,i);
//        }

        for(int i=0; i<s.length(); i++){
            char currentChar = s.charAt(i);

            int lastIdx = -1;
            for(int j = i-1; j>=0; j--){
                if(s.charAt(j) == currentChar){
                    lastIdx = j;
                    break;
                }
            }
            if (lastIdx == -1) {
                answer[i] = -1;
            } else {
                // 현재 문자의 최근 등장 위치와 현재 인덱스의 차이를 저장
                answer[i] = i - lastIdx;
            }

        }

        System.out.println();
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
//        System.out.println(Arrays.toString(solution("foobar")));
    }
}
