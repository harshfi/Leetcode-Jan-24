class Solution {
    public boolean halvesAreAlike(String s) {
        char[] arr=s.toCharArray();
        int count1=0,count2=0;
        for(int i=0;i<arr.length/2;++i){
            if("aeiouAEIOU".indexOf(arr[i])!=-1){
                count1++;
            }
             if("aeiouAEIOU".indexOf(arr[(arr.length/2)+i])!=-1){
                count2++;
            }
        }
        return count1==count2;
    }
}