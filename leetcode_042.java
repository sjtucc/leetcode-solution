package cn.cc.org;
/*
 * 首先找到有效的两边，如 [0, 1, 2, 3, 0, 3, 2, 1, 0]，递增的左边和递减的右边是不能盛水的。
 * 然后选择较短的边，如果是左边就开始右移，直到找到一个比左边高的边，更新左边；
 * 如果是右边较短，就左移，直到找到一个更高的边，更新右边。
 */
public class leetcode_42 {
    public int trap(int[] A) {  
        if (A.length < 3) return 0;  
          
        int ans = 0;  
        int l = 0, r = A.length - 1;  
          
        // find the left and right edge which can hold water  
        while (l < r && A[l] <= A[l + 1]) l++;  
        while (l < r && A[r] <= A[r - 1]) r--;  
          
        while (l < r) {  
            int left = A[l];  
            int right = A[r];  
            if (left <= right) {  
                // add volum until an edge larger than the left edge  
                while (l < r && left >= A[++l]) {  
                    ans += left - A[l];  
                }  
            } else {  
                // add volum until an edge larger than the right volum  
                while (l < r && A[--r] <= right) {  
                    ans += right - A[r];  
                }  
            }  
        }  
        return ans;  
    }
}
