https://leetcode.com/contest/weekly-contest-254/problems/number-of-strings-that-appear-as-substrings-in-word/
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int i,f=0;
        for(i=0;i<patterns.length;i++)
        {
            if(word.contains(patterns[i]))
                f++;
        }
        if(f>0)
           return f;
        else
           return 0;  
    }
}
