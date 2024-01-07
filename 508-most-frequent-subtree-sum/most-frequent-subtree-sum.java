/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     HashMap<Integer,Integer> map = new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
         map = new HashMap<>();
        makeSum(root, 0);
        List<Integer> list = new ArrayList<>();
        int count=Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            // System.out.println(entry.getKey()+" "+entry.getKey());
          if(entry.getValue()==count){
              list.add(entry.getKey());
          }
         else if(entry.getValue()>count){
            list.clear();
            list.add(entry.getKey());
            count= entry.getValue();
          }

        }
        int ans[]= new int[list.size()];
        int j=0;
        for(int i : list){
          ans[j++]=i;
        }
        return ans;
            
    } 
    public int makeSum(TreeNode root, int sum){
        if(root==null) return 0;

        int left=makeSum(root.left,sum);
        int right=makeSum(root.right,sum);

        sum=sum+left+right+root.val;
        if(map.containsKey(sum)){
            map.put(sum,map.get(sum)+1);
        }
        else{
            map.put(sum,1);
        }
        return sum;
    }



        
    }
    
