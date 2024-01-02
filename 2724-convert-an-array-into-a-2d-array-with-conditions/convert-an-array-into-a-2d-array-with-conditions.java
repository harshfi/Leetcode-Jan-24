class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> findMatrix(int[] nums) {
        list=new ArrayList<>();
        boolean[] check= new boolean[nums.length];
        int count=0;
        while(count<nums.length){
          List<Integer> l =  make(nums,new ArrayList<>(), check );
          list.add(new ArrayList<>(l));
          count=count+l.size();
        }
        return list;
       
        
    }
    public List<Integer> make(int []nums ,List<Integer> l,boolean []check ){
       
       for(int i=0;i<nums.length;i++){
           if(check[i]==false && ! l.contains(nums[i]) ){
               l.add(nums[i]);
               check[i]=true;
           }
       }
       return l;

    }
}