class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        Arrays.sort(arr2);

        for (int element : arr1) {
            int index = binarySearch(arr2, element);

            int minDiff = Integer.MAX_VALUE;

            if (index < arr2.length) {
                minDiff = Math.min(minDiff,
                        Math.abs(arr2[index] - element));
            }

            if (index > 0) {
                minDiff = Math.min(minDiff,
                        Math.abs(arr2[index - 1] - element));
            }

            if (minDiff > d) {
                ans++;
            }
        }

        return ans;
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}