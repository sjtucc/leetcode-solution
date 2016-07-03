package cn.cc.org;

public class leetcode_35 {
    public int searchInsert(int[] A, int target) {

        if (A == null) {
            return -1;
        }

        int i;
        for (i = 0; i < A.length; i++) {
            if (A[i] >= target) {
                return i;
            }
        }

        return i;
    }
}
