package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        MinimumIndexSumOfTwoLists minimumIndexSumOfTwoLists = new MinimumIndexSumOfTwoLists();

        String[] findRestaurant = minimumIndexSumOfTwoLists.findRestaurant(new String[] {"Shogun", "Tapioca Expess", "Burger King", "KFC"}, new String[] {"KFC", "Shogun", "Burger King"});
        System.out.println(findRestaurant);
    }

    public String[] result = new String[1];
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        int sumIdx = list1.length + list2.length;


        for(int i = 0; i < list1.length; i++) {
            map1.put(list1[i],i);
        }
        for(int i = 0; i < list2.length; i++) {
            map2.put(list2[i],i);
        }

        if(map1.size() > map2.size()) {
            for (Map.Entry<String, Integer> entry : map1.entrySet()) {
                String curKey = entry.getKey();
                int curValue = entry.getValue();

                if(map2.containsKey(curKey)) {
                    int otherVal = map2.get(curKey);
                    if(sumIdx > curValue + otherVal) {
                        sumIdx = curValue + otherVal;
                        result[0] = curKey;
                    }
                }
            }
        } else {
            for (Map.Entry<String, Integer> entry : map2.entrySet()) {
                String curKey = entry.getKey();
                int curValue = entry.getValue();

                if(map2.containsKey(curKey)) {
                    int otherVal = map1.get(curKey);
                    if(sumIdx > curValue + otherVal) {
                        sumIdx = curValue + otherVal;
                        result[0] = curKey;
                    }
                }
            }
        }
        return result;
    }
}