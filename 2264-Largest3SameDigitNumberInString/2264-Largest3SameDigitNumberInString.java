// Last updated: 9/22/2026, 2:48:30 PM
class Solution {
    public String largestGoodInteger(String num) {
     String[] numbers={"999","888","777","666","555","444","333","222","111","000"};
     for(String i:numbers){
        if(num.contains(i)){
            return i;
        }
     }
     return "";

    }
}