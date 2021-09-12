class Solution {
    public String reversePrefix(String word, char ch) {
        int i,j,f=0;
        String s="",s1="",s2="";
        for(i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                s=word.substring(0,i);
                f++;
                break;
                }
        }
        if(f>0)
        {
        for(j=i-1;j>=0;j--)
            s2=s2+word.charAt(j);
        s1=ch+s2+word.substring(i+1,word.length());
        }
        if(f==0)
        {
            s1=word;
        }
        return s1;
    }
}
