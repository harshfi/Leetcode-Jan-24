class RandomizedSet {
    Set <Integer> set = new HashSet<>();
  


    public RandomizedSet() {
       set = new HashSet<>(); 
       
    }
    
    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }
        else{
            set.add(val);
            return true;
        }
        
    }
    
    public boolean remove(int val) {
         if(set.contains(val)){
             set.remove(val);
             return true;
        }
        else{
            return false;
        }
        
    }
    
    public int getRandom() {
         Iterator<Integer>  iterator = set.iterator();
          int r= (int)(set.size()*Math.random());
          for( int i=0;i< r ;i++){
                 iterator.next();
          }
     return iterator.next();
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */