package week02.collection;

import java.util.HashMap;
import java.util.Map;

public class Con6 {
    public static void main(String[] args) {
        //Map : key - value pair
        // key 라는 값으로 unique 하게 보장 돼야 한다.
        // Map -> HashMap, TreeMap 으로 사용 할 수 있따.

        Map<String, Integer> intMap = new HashMap<>();

        //키 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13); //중복 key
        intMap.put("삼", 14); //중복 key
        intMap.put("오", 15);

        // key 값 전체 출력(향상된 for 문)
        for (String key: intMap.keySet()){
            System.out.println(key);
        }
        // value 값 전체 출력(향상된 for 문)
        for (Integer value: intMap.values()){
            System.out.println(value);
        }
        
        // key 로 value 찾아오기
        System.out.println(intMap.get("삼"));
    }
}
