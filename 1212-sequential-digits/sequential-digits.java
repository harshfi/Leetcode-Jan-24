class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int temp=low;
        int d=0;

        while(temp>0){
            d++;
            temp/=10;
        }
        
        List<Integer> l= new ArrayList<>();
        int number=low;
        int i= low/(int)Math.pow(10,d);
        int count=0;
         while(10>count++){
             number=0;
             
             for(int j=i;number<=high;j++){
                 
                

                 if(j-(number%10)==1||number==0)
                 number=number*10+j;
                 else break;

                 if(number>=low && number<=high){
                     d=number%100;
                     d=d/10;
                     if(!l.contains(number) && number%10-d==1)
                          l.add(number);
                 }
             }
             i++;
         }
         Collections.sort(l);
         return l;
        
    }
}