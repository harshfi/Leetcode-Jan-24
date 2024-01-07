class Solution {
    
    public int numberOfArithmeticSlices(int[] nums) {
        int count=0;
        Map<Integer,Integer> [] map= new Map[nums.length];
        for(int i=0;i<nums.length;i++){
            map[i]=new HashMap<>(i);
            for(int j=0;j<i;j++){
                 
                if((((long)(nums[j])-nums[i]))> Integer.MAX_VALUE ||( ( (long)(nums[j])-nums[i]))<=Integer.MIN_VALUE) continue;

                int dif= nums[j]-nums[i];
                int n1= map[i].getOrDefault(dif,0);
                int n2= map[j].getOrDefault(dif,0);
                 
                 count+=n2;
                 map[i].put(dif,n1+n2+1);

                

            }
        }
        
        return count;
        
    }
   
  
}