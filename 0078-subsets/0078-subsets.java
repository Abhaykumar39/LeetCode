class Solution {

    public void subset(List<Integer> list,int[] arr,int index,List<List<Integer>> ans)
    {
        if(index==arr.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        //pick;
        list.add(arr[index]);
        subset(list,arr,index+1,ans);

        //baktrack
        list.remove(list.size()-1);
        subset(list,arr,index+1,ans);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subset(list, nums, 0, ans);
        return ans;
    }
}