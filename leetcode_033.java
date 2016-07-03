package cn.cc.org;

public class leetcode_33 {
	public int search(int[] nums, int target) {

        if (nums != null && nums.length > 0) {

            // ����СԪ�ض�Ӧ���±�
            int minIndex = searchMinIndex(nums, 0, nums.length - 1);

            // ��������ȫ������
            if (minIndex == 0) {
                return binarySearch(nums, 0, nums.length - 1, target);
            } 
            // �������ֲ���������,  �� 4 5 6 7 8 9 0 1 2 3 
            else {
                // ��úͺ�һ��������������һ��Ԫ����ȣ����ض�Ӧ���±�
                if (nums[nums.length - 1] == target) {
                    return nums.length -1;
                } 
                // target�����ں�һ������������
                else if (nums[nums.length - 1] > target) {
                    return binarySearch(nums, minIndex, nums.length - 1, target);
                } 
                // target������ǰһ������������
                else {
                    return binarySearch(nums, 0, minIndex -1, target);
                }
            }
        }

        return -1;
    }

    /**
     * ��������
     */
    public int binarySearch(int[] nums, int start, int end, int target) {

        int mid;
        while (start <= end) {
            mid = start + ((end - start) >> 1);

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    /**
     * ����СԪ�ص��±�
     */
    public int searchMinIndex(int[] nums, int start, int end) {

        int mid;
        while (start < end) {
            mid = start + ((end - start) >> 1);
            // ��һ������ǰ����С���ҵ���
            if (nums[mid] > nums[mid + 1]) {
                return mid + 1;
            }
            // ˵���м�ֵ�ڵ�һ�������������
            else if (nums[mid] > nums[start]) {
                start = mid;
            }
            // ˵���м�ֵ�ڵڶ��������������
            else {
                end = mid;
            }
        }

        // ˵�����������������
        return 0;
    }
}
