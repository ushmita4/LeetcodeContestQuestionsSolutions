https://leetcode.com/contest/weekly-contest-254/problems/array-with-elements-not-equal-to-average-of-neighbors/
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i,l,s,bi,k=0,f=0;
        l=nums.length;
        Arrays.sort(nums);
        s=l/2;
        bi=l-(l/2);
        int a[]=new int[s];
        int b[]=new int[bi];
        int nums1[]=new int[l];
        for(i=0;i<l;i++)
        {
            if(i<s)
            {
            a[i]=nums[i];
            }
            else
            {
                b[i-s]=nums[i];
            }
        }
        for(i=0;i<l;i++)
        {
            if(i%2==0)
            {
                nums1[i]=b[k];
                k++;
            }
            else
            {
                nums1[i]=a[f];
                f++;
            }
        }
        return nums1;
    }
}
