package algorithnm;

import com.sun.source.tree.Tree;

import java.util.*;

public class addTwo {

    public static int[] solution(int[] numbers) {

        Set<Integer> set = new TreeSet<>();

        for(int i=0; i< numbers.length; i++){
            for(int j=i+1; j < numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
//            System.out.println(sum);
        }

//        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();

        int[] answer = new int[set.size()];
        int idx =0;
        for(Integer val: set){
            answer[idx++] = val;
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] numbers={2,1,3,4,1};
        System.out.println(Arrays.toString(solution(numbers)));

    }
}
