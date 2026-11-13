class Solution {
    public String reverseStr(String s, int k) {

        char[] arr = s.toCharArray();

        for (int start = 0; start < arr.length; start += 2 * k) {

            int left = start;
            int mid = Math.min(start + k - 1, arr.length - 1);

            while (left < mid) {

                char temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;

                left++;
                mid--;
            }
        }

        return new String(arr);
    }
}
