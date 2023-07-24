package strings.easy;

import java.util.*;
// import java.io.*;

class Solution {
    public boolean isValid(String s) {
        char[] carr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char c : carr) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else if (c == ')' && st.peek() == '(' || c == '}' && st.peek() == '{'
                        || c == ']' && st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}