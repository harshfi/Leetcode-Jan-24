class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int count=0;

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            // if(entry.getValue() %3!=0 && entry.getValue() %2 !=0) return -1;
             if(entry.getValue() % 3==0){
                count=count+(entry.getValue()/3);
            } 
            else {
                int num= entry.getValue();
                while(num>4){
                    num=num-3;
                    count++;
                }
                if(num%2==0)
                count=count+(num/2);
                else return -1;
            }

           
    } 
    return count;
        
    }
}