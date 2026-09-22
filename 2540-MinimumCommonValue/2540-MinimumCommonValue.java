// Last updated: 9/22/2026, 2:46:59 PM
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int left = 0, right = 0, n = nums1.length, m = nums2.length;

        if(nums1[n-1] < nums2[0] || nums2[m-1] < nums1[0]) return -1;

        while(left < n && right < m){
            if(nums1[left] == nums2[right]) return nums1[left];
            else if(nums1[left] < nums2[right]) left++;
            else right++;
        }

        return -1;
    }
}