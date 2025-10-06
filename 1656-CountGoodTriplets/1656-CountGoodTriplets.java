// Last updated: 10/6/2025, 3:09:15 PM
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int goodTriplets = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b &&
                            Math.abs(arr[i] - arr[k]) <= c) {
                            goodTriplets++;
                            // \U0001f94b Rock Lee: "Training pays off—one combo at a time!" \U0001f4a5
                        }
                    }
                }
            }
        }

        return goodTriplets;
    }
}