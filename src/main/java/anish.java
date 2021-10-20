import java.util.Stack;

public class anish {

    public static String getStr(String str){
        Stack<Character> st = new Stack<Character>();

        String ans = "";

        if(str.length() > 1){
            st.push(str.charAt(0));

            int n = str.length();
            int i = 1;
            while(i < n){
                if(!st.empty()){
                    if(st.peek() == str.charAt(i)){
                        while (i < n && str.charAt(i) == st.peek()){
                            i++;
                        }
                        i--;
                        if(st.size() > 0){
                            st.pop();
                        }
                    }else {
                        st.push(str.charAt(i));
                    }
                }else {
                    st.push(str.charAt(i));
                }
                i++;
            }
            while (!st.empty()){
                ans = ans + st.pop();
            }
        }else{
            return str;
        }

        String result="";
        for(int i=ans.length() - 1; i>=0; i--){
            result = result + ans.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String query = "abbbacddrtyy";
        System.out.println(getStr(query));
    }
}
