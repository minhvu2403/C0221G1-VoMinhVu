package week2.dsa_stack_queue.bai_tap;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        String strings =" toi la developer";
        strings=strings.toLowerCase();
        Map<Character,Integer> count =new java.util.TreeMap<>();
        for (int i = 0; i <strings.length() ; i++) {
            if (strings.charAt(i)!=' '){
                count.put(strings.charAt(i),0);
            }
        }
        System.out.println(count);
        for (Character key:count.keySet()) {
            for (int i = 0; i <strings.length(); i++) {
                if (key.equals(strings.charAt(i))){
                    count.replace(key,count.get(key)+1);
                }
            }

        }
        System.out.println(count);
    }

}
