package basic;

import java.util.ArrayList;
import java.util.List;

public class longestSubString {
    //Given a string s, find the length of the longest substring without duplicate characters.
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int max = 0;
        int lastIndex=0;
        List<String> seen = new ArrayList<>();
        for(int i = 0;i<s.length();i++ ){    
            char c = s.charAt(i);
            if(seen.contains(c+"")){
                seen = new ArrayList<>();
                if(max<res) max= res;
                res=0;
                i=lastIndex;
                lastIndex++;
            }else {
                res++;
                seen.add(c+"");
            }

        }
        
        return Math.max(res,max);
    }

}
