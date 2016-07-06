package cn.cc.org;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetcode_46 {
	private List<List<Integer>> result;
    public List<List<Integer>> permute(int[] num) {

        result = new LinkedList<>();
        if (num != null) {
            permute(0, num);
        }

        return result;
    }

    private void permute(int i, int[] num) {

        if (i == num.length) {
            List<Integer> l = new ArrayList<>();
            for (int n: num) {
                l.add(n);
            }

            result.add(l);
        }else {

            for (int j = i; j < num.length; j++) {
                swap(num, j, i);
                permute(i + 1, num);
                swap(num, j, i);
            }
        }
    }

    private void swap(int[] A, int x, int y) {
        int tmp = A[x];
        A[x] = A[y];
        A[y] = tmp;
    }
}
