class Solution {
    public List<List<Integer>> findMatrix(int[] num) {
        List <Integer> nums = new ArrayList<>();
        for(int i=0;i<num.length;i++){
            nums.add(num[i]);
        }

        List <List<Integer>> list = new ArrayList<>();
        while(nums.size() > 0){
            List <Integer> l2 = new ArrayList<>();
            int i = 0;
            while(i < nums.size()){
                if(!l2.contains(nums.get(i))){
                    l2.add(nums.get(i));
                    nums.remove(i);
                }
                else{i++;}
            }
            list.add(l2);
        }
        return list;
    }
}