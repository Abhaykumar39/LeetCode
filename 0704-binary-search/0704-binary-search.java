class Solution {

    public int searchBinary(int[] arr,int target,int i,int j)
    {
         if(i>j)
         {
            return -1;
         }

        int mid = (i+j)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        else if (arr[mid]>target)
        {
            return searchBinary(arr,target,i,mid-1);
        }
        else
        {
            return searchBinary(arr,target,mid+1,j);
        }
    }

    public int search(int[] arr, int target) {
        return searchBinary(arr, target, 0, arr.length - 1);
    }
}