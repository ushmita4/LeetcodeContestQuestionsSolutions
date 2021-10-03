class Solution {
    public int minimumMoves(String s) {
        int i=0;
        int k=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='X')
            {
                i=i+3;
                k++;
            }
            else
            {
                i=i+1;
            }
        }
        return k;
    }
}
