package cn.cc.org;

public class leetcode_11 {
	public int maxArea(int[] height) {

        // ����У��
        if (height == null || height.length < 2) {
            return 0;
        }


        // ��¼���Ľ��
        int result = 0;

        // ��ߵ�����
        int left = 0;
        // �ұߵ�����
        int right = height.length - 1;

        while (left < right) {
            // ���㵱ǰ�����ֵ
            result = Math.max(result, Math.min(height[left], height[right]) * (right - left));
            // ����ұ��߸�
            if (height[left] < height[right]) {
                int k = left;
                // ��[left, right - 1]�У����������ң��ҵ�һ���߶ȱ�height[left]�ߵ�λ��
                while (k < right && height[k] <= height[left]) {
                    k++;
                }

                // ��[left, right - 1]�У���¼��һ����ԭ��height[left]�ߵ�λ��
                left = k;
            }
            // ��ߵ��߸�
            else {
                int k = right;
                // ��[left + 1, right]�У����������ң��ҵ�һ���߶ȱ�height[right]�ߵ�λ��
                while (k > left && height[k] <= height[right]) {
                    k--;
                }

                // ��[left, right - 1]�У���¼��һ����ԭ��height[right]�ߵ�λ��
                right = k;
            }
        }

        return result;
    }
}
