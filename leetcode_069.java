package cn.cc.org;

public class leetcode_069 {
	public static int sqrt(int x) {
        double diff = 0.01;     // ���
        int low = 0;
        int high = x;
         
        while(low <= high){
            // ע��Խ�磡������double����
            double mid = low + (high-low)/2;
            if(Math.abs(mid*mid-x) <= diff){
                return (int)mid;
            }else if(x > mid*mid+diff){
                low = (int)mid+1;
            }else if(x < mid*mid-diff){
                high = (int)mid-1;
            }
        }
         
        // ���Ҳ���ʱ������low,highָ���Ѿ����棬ȡ��С�ģ���high
        return high;
    }
}
