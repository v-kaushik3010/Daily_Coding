// Last updated: 8/3/2025, 9:22:23 AM
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n =  landStartTime.length;
        int m = waterStartTime.length;
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i <n; i++){
            for(int j = 0; j<m; j++){
                int startland = landStartTime[i];
                int finishland = startland + landDuration[i];
                int startwaterafterl = Math.max(finishland, waterStartTime[j]);
                int finishwaterafterl = startwaterafterl + waterDuration[j];
                answer = Math.min(answer, finishwaterafterl);

                int startwater = waterStartTime[j];
                int finishwater = startwater + waterDuration[j];
                int startlandafterw = Math.max(finishwater, landStartTime[i]);
                int finishlandafterw = startlandafterw + landDuration[i];
                answer = Math.min(answer, finishlandafterw);
                
            }
        }return answer;
    }
}