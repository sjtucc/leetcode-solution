package cn.cc.org;

public class leetcode_51 {
	/**  
	 * ���ݷ���� N �ʺ�����  
	 */ 
	public class N_Queens {  
	      
	    // �ʺ�ĸ���  
	    private int queensNum = 4;  
	 
	    // column[i] = j ��ʾ�� i �еĵ� j �з���һ���ʺ�  
	    private int[] queens = new int[queensNum + 1];  
	 
	    // rowExists[i] = true ��ʾ�� i ���лʺ�  
	    private boolean[] rowExists = new boolean[queensNum + 1];  
	 
	    // a[i] = true ��ʾ�Ҹ���͵ĵ� i ��б���лʺ�  
	    private boolean[] a = new boolean[queensNum * 2];  
	 
	    // b[i] = true ��ʾ����ҵ͵ĵ� i ��б���лʺ�  
	    private boolean[] b = new boolean[queensNum * 2];  
	      
	    // ��ʼ������  
	    private void init() {  
	        for (int i = 0; i < queensNum + 1; i++) {  
	            rowExists[i] = false;  
	        }  
	          
	        for(int i = 0; i < queensNum * 2; i++) {  
	            a[i] = b[i] = false;  
	        }  
	    }  
	 
	    // �жϸ�λ���Ƿ��Ѿ�����һ���ʺ�,�����򷵻� true  
	    private boolean isExists(int row, int col) {  
	        return (rowExists[row] || a[row + col - 1] || b[queensNum + col - row]);  
	    }  
	 
	    // �����������Է��ûʺ�  
	    public void testing(int column) {  
	 
	        // ����ÿһ��  
	        for (int row = 1; row < queensNum + 1; row++) {  
	            // ����� row �е� column �п��Է��ûʺ�  
	            if (!isExists(row, column)) {  
	                // ���õ� row �е� column ���лʺ�   
	                queens[column] = row;  
	                // �����Ե� row �е� column ��Ϊ������б�߲��ɷ��ûʺ�  
	                rowExists[row] = a[row + column - 1] = b[queensNum + column - row] = true;  
	                  
	                // ȫ�����Թ�����ӡ  
	                if(column == queensNum) {  
	                    for(int col = 1; col <= queensNum; col++) {  
	                        System.out.print("("+col + "," + queens[col] + ")  ");  
	                    }  
	                    System.out.println();  
	                }else {  
	                    // ������һ�еĻʺ�  
	                    testing(column + 1);  
	                }  
	                // ������һ�������õĻʺ󣬼�����  
	                rowExists[row] = a[row + column - 1] = b[queensNum + column - row] = false;  
	            }  
	        }  
	    }  
	      
	} 
}
