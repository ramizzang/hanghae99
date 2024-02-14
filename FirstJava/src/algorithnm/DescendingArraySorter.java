package algorithnm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendingArraySorter {
    // n의 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴
    // n -> 118372 -> 873211 이 될 수 있도록
    //n은 1이상 8000000000
    public static long solution(long n){
        // 각 자릿수를 배열 or list에 저장
        // 방법 1. Strtin 으로 변환 후 정렬 한 뒤 더하기
        // 방법 2. list or 배열에 저장 한뒤 collections를 사용 or for문을 사용하여 뒤에서부터 저장해주기
        long answer = 0;
        String result="";
        //1. long 을 스트링으로 변환 하여 배열로 저장
        String[] strNum = String.valueOf(n).split("");
        Arrays.sort(strNum);
        for(int i=strNum.length-1; i>=0; i--){
            result += strNum[i];
        }


        return Long.parseLong(result);
    }

    public static long solution2(long n) {
        // 속도측면에서 훨씬 빠름
        // 1. while % -> 각 자리수를
        // 2. LongStream 으로 .char
        // 3. String -> int -> Arr -> sort
        List<Long> arr = new ArrayList<Long>();

        while (n > 0) {
            Long digit = n % 10;
            n /= 10;
            arr.add(digit);
        }
//            Collections.reverse(arr);
        Collections.sort(arr, Collections.reverseOrder());

        long answer = 0;
        for(int i =0; i<arr.size(); i++){
            answer = (answer * 10) + arr.get(i) ; // 인덱스 값 하나씩 가져옴
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(54897));
    }
}
