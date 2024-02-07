package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
    public static void main(String[] args) {
        //set : 집합과 닮아있다. 순서가 없고, 중복이 없다.
        // 순서가 보장되지 않는 대신 중복을 허용하지 않도록 하는 프로그램에서 사용할 수 있는 자료구조
        // Set -> HashSet, TreeSet 등으로 응용해서 같이 사용 가능
        // Set 생성자가 없는 껌데기, 바로 생성할 수 없다.
        // HashSet -> 생성자가 존재 얘로 실습해본다

        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        for (Integer value: intSet){
            // 출력 : 1,5,9,12 -> set은 중복을 허용하지 않기 때문에 중복값이 존재하지 않는다.
            System.out.println(value);
        }

        // contains(value) -> return true or false (set 이 가지고 있는 요소들 중 () 안의 값이 있는지 확인하여 true or false 반환)
        System.out.println(intSet.contains(2)); // false
        System.out.println(intSet.contains(5)); // true


    }
}
