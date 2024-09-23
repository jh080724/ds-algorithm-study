package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hash2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        Map<Character, Integer> map = new HashMap<>();

        boolean isNo = false;

        for (Character c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if(!map.containsKey(c) || map.get(c) == 0){  // str2의 길이가 더 길 경우, 0
                isNo = true;
                break;
            }

            map.put(c, map.get(c) - 1);
          /*  if(map.get(c) == 0){
                map.remove(c);
            }*/
        }

//        if(map.isEmpty()) isNo = true;

        if(isNo) System.out.println("NO");
        else System.out.println("YES");

        br.close();

/*  by jhjeong

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ana1 = br.readLine().toCharArray();
        char[] ana2 = br.readLine().toCharArray();

//        Arrays.sort(ana1);
//        System.out.println("ana1 = " + Arrays.toString(ana1));
//        Arrays.sort(ana2);
//        System.out.println("ana2 = " + Arrays.toString(ana2));
//        System.out.println(Arrays.equals(ana1, ana2));

        HashMap<Object, Integer> map1 = new HashMap<Object, Integer>();

        for (char c : ana1) {

            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : ana2) {
            if (!map1.containsKey(c)) {
                System.out.println("아나그램 아님!");
                break;
            }

            map1.put(c, map1.get(c) - 1);
            if(map1.get(c) == 0){
                map1.remove(c);
            }

        }

        if(map1.isEmpty()){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
*/

    }
}
