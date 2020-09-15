package leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
//    public static void main(String[] args) {
//        HappyNumber happyNumber = new HappyNumber();
//
//        boolean isHappyResult = happyNumber.isHappy(19);
//        System.out.println(isHappyResult);
//    }


    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();

        while (!set.contains(n)) {
            set.add(n);
            n = rotateSumN(n);

            if (n == 1) {
                return true;
            }
        }

        return false;
    }

    public int rotateSumN(int number) {
        String tmpStr = Integer.toString(number);
        String[] splittedNumArray = tmpStr.split("");
        int tmpNum = 0;

        for (int i = 0; i < splittedNumArray.length; i++) {
            int strToInt = Integer.parseInt(splittedNumArray[i]);
            tmpNum += strToInt * strToInt;
        }

        return tmpNum;
    }
}
