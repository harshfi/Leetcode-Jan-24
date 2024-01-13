class Solution {
    public int minSteps(String s, String t) {
        Map<Character,Integer> mapA = new HashMap<>();
        Map<Character,Integer> mapB = new HashMap<>();
        for(int i=0;i<s.length();i++){
           
           char ch1= s.charAt(i);
           char ch2=t.charAt(i);
           mapA.put(ch1,mapA.getOrDefault(ch1,0)+1);
           mapB.put(ch2,mapB.getOrDefault(ch2,0)+1);

        }
           int sum=0;
        for(Map.Entry<Character,Integer> entry : mapA.entrySet()){

            if(mapB.containsKey(entry.getKey())&& mapB.get(entry.getKey())<=entry.getValue() ){
               sum=sum+(entry.getValue() - mapB.get(entry.getKey()));

            }
            else if(!mapB.containsKey(entry.getKey())) {
                sum=sum+entry.getValue();
            }
        }
        return sum;
        
    }
}