// Last updated: 7/31/2025, 6:05:02 PM
class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            boolean b = true;
            String s = words[i].toLowerCase();
            int ch = 0;
            if(row1.contains(String.valueOf(s.charAt(0)))){
                ch = 1;
            }
            if(row2.contains(String.valueOf(s.charAt(0)))){
                ch = 2;
            }
            if(row3.contains(String.valueOf(s.charAt(0)))){
                ch = 3;
            }
            switch(ch){
                case 1 :
                    for(int j=0; j<words[i].length(); j++){
                        if(!row1.contains(String.valueOf(s.charAt(j)))){
                            b = false;
                            break;
                        }
                    }
                    break;
                case 2 :
                    for(int j=0; j<s.length(); j++){
                        if(!row2.contains(String.valueOf(s.charAt(j)))){
                            b = false;
                            break;
                        }
                    }
                    break;
                case 3 :
                    for(int j=0; j<s.length(); j++){
                        if(!row3.contains(String.valueOf(s.charAt(j)))){
                            b = false;
                            break;
                        }
                    }
                    break;
                default :
                    continue;
            }
            if(b == true){
                list.add(words[i]);
            }
        }
        String[] ans = new String[list.size()];
        for(int i=0; i<ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}