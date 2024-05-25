class Solution {
    public String decodeString(String s) {
        // char c='1';
        // System.out.println(c-'0');
        //return "";
        Stack<Integer> st = new Stack<>();
        Stack<String> st1 = new Stack<>();
        String sb = new String();
        int n = 0;

        for (char c : s.toCharArray()) {
            System.out.println(sb);
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                st.push(n);
                n = 0;
                st1.push(sb);
                //System.out.println(sb);
                sb = new String();
                //System.out.println("new"+sb);
            } else if (c == ']') {
                int k = st.pop();
                String temp = sb;
                //System.out.println("temp="+sb);
                sb = st1.pop();
                while (k-- > 0) {
                    sb+=temp;
                }
            } else {
                //System.out.println("else="+sb);
                sb+=c;
            }
        }

        return sb;
        
    }
}