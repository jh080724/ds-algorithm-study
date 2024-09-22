package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;

public class Hash1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<Object, Integer> countMap = new HashMap<Object, Integer>();
        String str = br.readLine();
        char[] ch = str.toCharArray();

        for (char c : ch) {
            System.out.println(c + ", " +countMap.put(c, countMap.getOrDefault(c, 0) + 1));
        }


        System.out.println(countMap.size());
        System.out.println(ch[0] + ", " +countMap.get(ch[0]));

        for (char c : ch) {
            System.out.println(c + ", " +countMap.get(c));
        }

        for (Object o : countMap.keySet()) {
            System.out.println("o = " + o);
        }

        for (Integer value : countMap.values()) {
            System.out.println("value = " + value);
        }


        char maxKey = '\0';
        int maxVal = Integer.MIN_VALUE;

        for (Map.Entry<Object, Integer> objectIntegerEntry : countMap.entrySet()) {
            System.out.println("objectIntegerEntry = " + objectIntegerEntry);
            if(objectIntegerEntry.getValue() > maxVal){
                maxVal = objectIntegerEntry.getValue();
                maxKey = (char) objectIntegerEntry.getKey();
            }
        }

        System.out.println("maxKey = " + maxKey + ", maxVal = "+maxVal);

        br.close();

    }
}
