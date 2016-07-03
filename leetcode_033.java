package cn.cc.org;

public class leetcode_33 {
	public int search(int[] nums, int target) {

        if (nums != null && nums.length > 0) {

            // 找最小元素对应的下标
            int minIndex = searchMinIndex(nums, 0, nums.length - 1);

            // 整个数组全局有序
            if (minIndex == 0) {
                return binarySearch(nums, 0, nums.length - 1, target);
            } 
            // 有两个局部有序区间,  如 4 5 6 7 8 9 0 1 2 3 
            else {
                // 恬好和后一个有序区间的最后一个元素相等，返回对应的下标
                if (nums[nums.length - 1] == target) {
                    return nums.length -1;
                } 
                // target可能在后一个有序区间中
                else if (nums[nums.length - 1] > target) {
                    return binarySearch(nums, minIndex, nums.length - 1, target);
                } 
                // target可能是前一个有序区间中
                else {
                    return binarySearch(nums, 0, minIndex -1, target);
                }
            }
        }

        return -1;
    }

    /**
     * 二分搜索
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
     * 找最小元素的下标
     */
    public int searchMinIndex(int[] nums, int start, int end) {

        int mid;
        while (start < end) {
            mid = start + ((end - start) >> 1);
            // 后一个数比前个数小就找到了
            if (nums[mid] > nums[mid + 1]) {
                return mid + 1;
            }
            // 说明中间值在第一个有序的数组中
            else if (nums[mid] > nums[start]) {
                start = mid;
            }
            // 说明中间值在第二个有序的数组中
            else {
                end = mid;
            }
        }

        // 说明整个数组是有序的
        return 0;
    }
}
