package cn.cc.org;

public class leetcode_29 {
	public int divide(int dividend, int divisor) {
        return (int)divideL(dividend, divisor); //如果不用去long里面做，-2147483648/1很难解决

    }
    /*例如计算：87/4
     * 87=4*2^4+4*2^2+4*2^1
     * 87=4*(2^4+2^2+2^1) ,而括号里的数就是我们要求的结果
     * 可以每次将除数4左移1位（乘以2），到了接近被除数87时就停止，
     * result先加上2^4，被除数减去，再下一次执行while体语句
     */
    public static long divideL(long dividend,long divisor){
        int flag = 0;
        if(divisor == 0 )
            return Integer.MAX_VALUE;

        if(Math.abs(dividend) <Math.abs(divisor) || dividend==0 )
            return 0;
        if(dividend < 0 && divisor<0) {
            long a = divideL(Math.abs(dividend),Math.abs(divisor));
            if(a==2147483648L)      //特殊情况：-2147483648/-1，要返回Integer.MAX_VALUE
                return Integer.MAX_VALUE;
            else
                return a;
        }
        if(dividend < 0 && divisor>0) 
            return -divideL(Math.abs(dividend),Math.abs(divisor));
        if(dividend > 0 && divisor<0) 
            return -divideL(Math.abs(dividend),Math.abs(divisor));

        long tmp = 0L;    //不加L的话，默认存储格式为int(为了省空间)，会溢出
        long tmp_divisor = divisor;
        long result = 0L;


        while(dividend>0) {
            long count = 0;
            tmp_divisor = divisor;  //被除数每次要减，除数不能变，增个副本
            while(tmp_divisor<=dividend) {
                tmp_divisor <<= 1;
                count++;   //记下左移次数
            }
            if(count==0)
                return result;
            tmp = divisor <<(count-1);


            //不光result定义时强调是L，1后面一定要加L，不分配那样长的内存，怎么左移那么多位
            result += 1L << (count-1); //result += (long)Math.pow(2, (count-1));

            dividend -= tmp;

        }
            return result;
    }
}
