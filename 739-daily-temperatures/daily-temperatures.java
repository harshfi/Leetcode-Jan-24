class Solution {
    public int[] dailyTemperatures(int[] temp)
    {
        int ans[]=new int[temp.length];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<temp.length;i++)
        {
             while(!(st.isEmpty()) && temp[i]>temp[st.peek()])
             {
                 ans[st.peek()]=i-st.peek();
                 st.pop();
             }
             st.push(i);
        }
        while(!st.isEmpty())
        {
            ans[st.peek()]=0;
            st.pop();
        }
        return ans;
        
    }
    
}