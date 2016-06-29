package cn.cc.org;

public class leetcode_29 {
	public int divide(int dividend, int divisor) {
        return (int)divideL(dividend, divisor); //�������ȥlong��������-2147483648/1���ѽ��

    }
    /*������㣺87/4
     * 87=4*2^4+4*2^2+4*2^1
     * 87=4*(2^4+2^2+2^1) ,�������������������Ҫ��Ľ��
     * ����ÿ�ν�����4����1λ������2�������˽ӽ�������87ʱ��ֹͣ��
     * result�ȼ���2^4����������ȥ������һ��ִ��while�����
     */
    public static long divideL(long dividend,long divisor){
        int flag = 0;
        if(divisor == 0 )
            return Integer.MAX_VALUE;

        if(Math.abs(dividend) <Math.abs(divisor) || dividend==0 )
            return 0;
        if(dividend < 0 && divisor<0) {
            long a = divideL(Math.abs(dividend),Math.abs(divisor));
            if(a==2147483648L)      //���������-2147483648/-1��Ҫ����Integer.MAX_VALUE
                return Integer.MAX_VALUE;
            else
                return a;
        }
        if(dividend < 0 && divisor>0) 
            return -divideL(Math.abs(dividend),Math.abs(divisor));
        if(dividend > 0 && divisor<0) 
            return -divideL(Math.abs(dividend),Math.abs(divisor));

        long tmp = 0L;    //����L�Ļ���Ĭ�ϴ洢��ʽΪint(Ϊ��ʡ�ռ�)�������
        long tmp_divisor = divisor;
        long result = 0L;


        while(dividend>0) {
            long count = 0;
            tmp_divisor = divisor;  //������ÿ��Ҫ�����������ܱ䣬��������
            while(tmp_divisor<=dividend) {
                tmp_divisor <<= 1;
                count++;   //�������ƴ���
            }
            if(count==0)
                return result;
            tmp = divisor <<(count-1);


            //����result����ʱǿ����L��1����һ��Ҫ��L�����������������ڴ棬��ô������ô��λ
            result += 1L << (count-1); //result += (long)Math.pow(2, (count-1));

            dividend -= tmp;

        }
            return result;
    }
}
