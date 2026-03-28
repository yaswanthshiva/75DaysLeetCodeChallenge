class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> freq = new HashMap<>();
        int res=0,left=0,maxFreq=0;
        for(int right =0;right<s.length();right++)
        {
            char c = s.charAt(right);
            freq.put(c,freq.getOrDefault(c,0)+1);
            maxFreq = Math.max(maxFreq,freq.get(c));
            while((right-left+1)-maxFreq>k)
            {
                char leftChar = s.charAt(left);
                freq.put(leftChar,freq.get(leftChar)-1);
                left++;
            }
            res = Math.max(res,right-left+1);
        }
        return res;
    }
}