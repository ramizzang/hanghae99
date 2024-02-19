package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬
// 나누어 떨어지는게 없다며 -1 담아서 return
public class DivisibleArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 6};
        int divisor = 10;

        List<Integer> result = new ArrayList<>();

        //arr length 만큼 반복
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                result.add(arr[i]);
            }
        }
        /* 향상된 for 문으로 변경
        for (int num : arr) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }
        */
        if (result.isEmpty()) { // list가 비어있다면
            int[] answer = {-1};
//            return answer;
        } else {
            //리스트의 요소를 배열로 복사
            int[] resultArr = new int[result.size()];
            for(int i = 0; i < result.size(); i++){
                resultArr[i] = result.get(i);
            }
            Arrays.sort(resultArr);
        }
        System.out.println(result);
    }
}
