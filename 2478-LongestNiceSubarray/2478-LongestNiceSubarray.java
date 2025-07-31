// Last updated: 7/31/2025, 6:03:33 PM
class Solution {
        public int longestNiceSubarray(int[] nums) {
                int n = nums.length;
                        int maxLength = 1;
                                int left = 0;
                                        int usedBits = 0;
                                                
                                                        for (int right = 0; right < n; right++) {
                                                                    while ((usedBits & nums[right]) != 0) {
                                                                                    usedBits ^= nums[left];
                                                                                                    left++;
                                                                                                                }
                                                                                                                            
                                                                                                                                        usedBits |= nums[right];
                                                                                                                                                    maxLength = Math.max(maxLength, right - left + 1);
                                                                                                                                                            }
                                                                                                                                                                    
                                                                                                                                                                            return maxLength;
                                                                                                                                                                                }
                                                                                                                                                                                }
