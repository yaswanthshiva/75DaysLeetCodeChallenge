class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hs = new HashMap<>();
        for(String str : strs)
        {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!hs.containsKey(sorted))
            {
                hs.put(sorted,new ArrayList<>());
            }
            hs.get(sorted).add(str);
        }
        return new ArrayList<>(hs.values());
    }
}