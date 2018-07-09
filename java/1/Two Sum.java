class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] numsplus = new int[nums.length][2];
        for(int i=0;i<nums.length;i++)
        {
            numsplus[i][0]=nums[i];
            numsplus[i][1]=i;
        }
    	Arrays.sort(numsplus, new Comparator<int[]>() {
    		public int compare(int[] n1,int[] n2)
    		{
    			if(n1[0]>n2[0])
    			{
    			return 1;}
    			else if(n1[0]<n2[0])
    			{return -1;}
    			else return 0;
    		}
    	});

        int i,lo,hi,mid,key;
        for (i=0;i<numsplus.length;i++)
        {
            lo=i+1;
            hi=numsplus.length-1;
            key=target-numsplus[i][0];
            while(lo<=hi)
            {
                mid=lo+(hi-lo)/2;
                if (key<numsplus[mid][0]) hi=mid-1;
                else if (key>numsplus[mid][0]) lo=mid+1;
                else
                {
                    if(mid!=i)
                    {
                        int A[]={numsplus[i][1],numsplus[mid][1]};
                        return A;
                    }
                }
            }
        }
        int A[]={-1,-1};
        return A;
    }
}