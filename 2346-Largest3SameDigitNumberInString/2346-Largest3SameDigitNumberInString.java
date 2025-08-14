// Last updated: 8/14/2025, 10:43:12 AM
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