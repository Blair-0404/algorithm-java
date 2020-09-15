package leetcode;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        // 아래 인자를 넣을때 에러가 왜 나는걸까?
        int[] result = twoSum.makeTwoSum(new int[]{3, 2, 4},6);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }


    public int[] makeTwoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

}
