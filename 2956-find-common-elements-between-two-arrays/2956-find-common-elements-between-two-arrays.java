class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        
        int firstCount = 0;
        int secondCount = 0;

        for(int i=0;i<nums1.length;i++)
        { 
             for(int j = 0 ;j<nums2.length;j++)
             {
                if(nums1[i]==nums2[j])
                {
                    firstCount++;
                    break;
                }
             }
        }

         for(int i=0;i<nums2.length;i++)
        { 
             for(int j = 0 ;j<nums1.length;j++)
             {
                if(nums2[i]==nums1[j])
                {
                    secondCount++;
                    break;
                }
             }
        }

        return new int[]{firstCount,secondCount};

    }
}