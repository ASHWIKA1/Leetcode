class Solution {
    public boolean isValid(String s) {

        Stack <Character> st=new Stack<>();
        for(char s1:s.toCharArray()){
            if(s1=='{')
                   st.push('}') ;
            else if(s1=='(') 
                   st.push(')');
            else if(s1=='[') 
                     st.push(']');
            else if(st.isEmpty() || st.pop() !=s1){
                    return false;
                }
            
            
            }
            return st.isEmpty();
        }
        
    }
