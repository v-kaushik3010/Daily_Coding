// Last updated: 7/31/2025, 6:06:36 PM
class Solution {
    public int romanToInt(String s) {
        int num=0;
        int length=s.length();
        for(int i=0;i < length;i++){
            if(s.charAt(i)=='I'){
                if ((i < length-1) && (s.charAt(i+1)=='V')){
                    num=num+4;
                    i++;
                }
                else if((i < length-1) && s.charAt(i+1)=='X'){
                     num=num+9;
                    i++;
                }
                else{
                   num++;
                }
            }
            else if(s.charAt(i)=='X'){
                if ((i < length-1) && (s.charAt(i+1)=='L')){
                    num=num+40;
                    i++;
                }
                else if((i < length-1) && s.charAt(i+1)=='C'){
                     num=num+90;
                    i++;
                }
                else{
                   num=num+10;
                }
            }
             else if(s.charAt(i)=='C'){
                if ((i < length-1) && (s.charAt(i+1)=='D')){
                    num=num+400;
                    i++;
                }
                else if((i < length-1) && s.charAt(i+1)=='M'){
                     num=num+900;
                    i++;
                }
                else{
                   num=num+100;
                }
             }
                else if(s.charAt(i)=='V'){
                    num=num+5;
                }
                 else if(s.charAt(i)=='L'){
                    num=num+50;
                }
                else if(s.charAt(i)=='D'){
                    num=num+500;
                }
                else if(s.charAt(i)=='M'){
                    num=num+1000;
                }
            }
            return num;
    }
}