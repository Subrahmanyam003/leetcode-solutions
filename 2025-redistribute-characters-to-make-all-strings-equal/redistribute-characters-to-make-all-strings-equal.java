class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for(int j = 0; j < words.length; j++)
        {
            String word = words[j];
            for(int i = 0; i < word.length(); i++)   
            {
                map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0)+1);
            }
        }
        int totalWords = words.length;
        for(Character s : map.keySet())
        {
            if(map.get(s) % totalWords != 0) return false;
        }
        return true;
    }
}