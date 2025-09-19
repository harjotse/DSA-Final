class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        Stack<Integer>st=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<>();
        int nums []= new int[arr.length];
         st.push(arr[arr.length-1]);
         nums[arr.length-1]=-1;
         for(int i=arr.length-2;i>=0;i--){
            if(st.peek()<arr[i]){
              nums[i]=st.peek();
            }
            else{
                while(!st.isEmpty() && st.peek()>=arr[i]){
                    st.pop();
                }
                if(!st.isEmpty())
                    nums[i]=st.peek();
                else
                   nums[i]=-1;
            }
            st.push(arr[i]);
         }
         for(int element : nums){
             ans.add(element);
         }
      return ans;  
    }
}