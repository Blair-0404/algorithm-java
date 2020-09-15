package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAStringSolution {
    public static void main(String[] args) {
        FirstUniqueCharacterInAStringSolution firstUniqueCharacterInAStringSolution = new FirstUniqueCharacterInAStringSolution();

        int firstUniqChar = firstUniqueCharacterInAStringSolution.firstUniqChar("leetcode");
        System.out.println(firstUniqChar);
    }

    public int firstUniqChar(String s) {
        String[] sArray = s.split("");
        Map<String, Integer> sMap = new HashMap<String, Integer>();
        int resultIdx  = 1;

        for (String value : sArray) {
            if (!sMap.containsKey(value)) {
                sMap.put(value, 1);
            } else {
                int tmpVal = sMap.get(value);
                sMap.put(value, tmpVal + 1);
            }
        }

        for(int i = 0; i < sArray.length; i++) {
            if(sMap.get(sArray[i]) == 1) {
                return i;
            }
        }
        return resultIdx;
    }
}
