class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int remaining = target-nums[i];
            if(hs.containsKey(remaining))
            {
                return new int[]{hs.get(remaining),i};
            }
            hs.put(nums[i],i);
        }
        return new int[]{};
    }
}