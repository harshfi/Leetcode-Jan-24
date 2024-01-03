class Solution {
    public int numberOfBeams(String[] bank) {
         int sum=0;
         int prev=0;
        for(int i=0;i<bank.length;i++){
            int count=one(bank[i]);
             if(count!=0){
                 prev=i;
                 break;
             }
        }
        for(int i=prev+1;i<bank.length;i++){
             int count=one(bank[i]);
             if(count!=0){
                 sum=sum+one(bank[prev])*count;
                 prev=i;

             }
        }
        return sum;
        
    }
    public int one(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') count++;
        }
        return count;
    }
}