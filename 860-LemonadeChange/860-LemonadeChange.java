// Last updated: 9/22/2026, 2:55:55 PM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for(int i: bills ){
            if( i ==5){
                five++;
            }else if(i == 10){
                if(five > 0){
                    five--;
                    ten++;
                }else return false;
            }else{
                if(five > 0 && ten > 0){
                    five--; 
                    ten--;
                }
                else if(ten ==0 && five >=3){
                    five-=3;
                }else return false;
            }
        }return true;
    }
}