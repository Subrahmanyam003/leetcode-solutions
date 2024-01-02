class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            temp.add(nums[i]);
        }
        List<List<Integer>> result = new ArrayList<>();
        while(temp.size() > 0)
        {
            List<Integer> row = new ArrayList<>();
            int i = 0;
            while(i < temp.size())
            {
                int a = temp.get(i);
                if(!row.contains(a))
                {
                    row.add(a);
                    temp.remove(i);
                }
                else{
                    i++;
                }
            }
            result.add(row);
        }
        return result;
    }
}