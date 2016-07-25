package cn.cc.org;

public class leetcode_069 {
	public static int sqrt(int x) {
        double diff = 0.01;     // 误差
        int low = 0;
        int high = x;
         
        while(low <= high){
            // 注意越界！所以用double来存
            double mid = low + (high-low)/2;
            if(Math.abs(mid*mid-x) <= diff){
                return (int)mid;
            }else if(x > mid*mid+diff){
                low = (int)mid+1;
            }else if(x < mid*mid-diff){
                high = (int)mid-1;
            }
        }
         
        // 当找不到时候，这是low,high指针已经交叉，取较小的，即high
        return high;
    }
}
