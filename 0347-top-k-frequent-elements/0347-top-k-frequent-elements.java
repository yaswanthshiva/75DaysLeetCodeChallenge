class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int n : nums)
        {
            hs.put(n,hs.getOrDefault(n,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int key : hs.keySet())
        {
            int freq = hs.get(key);
            if(bucket[freq] == null)
            {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        List<Integer> res = new ArrayList<>();
        for(int i = bucket.length-1; i>=0 && res.size()<k ; i--)
        {
            if(bucket[i]!=null)
            {
                res.addAll(bucket[i]);
            }
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i] = res.get(i);
        }
        return ans;
    }
}