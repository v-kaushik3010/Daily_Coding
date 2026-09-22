// Last updated: 9/22/2026, 2:45:19 PM
class Solution {
        public int areaOfMaxDiagonal(int[][] dimensions) {
                int n = dimensions.length;
                        int maxArea = 0, maxDiag = 0;

                                for (int i = 0; i < n; i++) {
                                            int l = dimensions[i][0];
                                                        int w = dimensions[i][1];
                                                                    int currDiag = l * l + w * w;

                                                                                if (currDiag > maxDiag || (currDiag == maxDiag && l * w > maxArea)) {
                                                                                                maxDiag = currDiag;
                                                                                                                maxArea = l * w;
                                                                                                                            }
                                                                                                                                    }
                                                                                                                                            return maxArea;
                                                                                                                                                }
                                                                                                                                                }
