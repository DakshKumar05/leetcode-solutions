class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long windowSum = 0;
        long maxSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Check first window
        if (map.size() == k) {
            maxSum = windowSum;
        }

        // Slide the window
        for (int right = k; right < nums.length; right++) {

            // Add new element
            windowSum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // Remove old element
            int old = nums[right - k];
            windowSum -= old;

            map.put(old, map.get(old) - 1);

            if (map.get(old) == 0) {
                map.remove(old);
            }

            // All k elements are distinct
            if (map.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}
        
    /*
    public long maximumSubarraySum(int[] nums, int k) {
        long windowSum = 0;
        long maxSum = 0;
        
        HashSet<Integer> set = new HashSet<>();

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
            set.add(nums[i]);
        }

        // Check first window
        if (set.size() == k) {
            maxSum = windowSum;
        }

        // Slide the window
        for (int right = k; right < nums.length; right++) {
            windowSum += nums[right];
            windowSum -= nums[right - k];

            set.remove(nums[right - k]);
            set.add(nums[right]);

            if (set.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}
*/
