package strings.easy;

import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String p[] = path.split("/");
        for (String a : p) {
            if (a.equals(".") || a.isEmpty()) {
                continue;
            } else if (a.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else {
                s.push(a);
            }
        }
        return "/" + String.join("/", s);
    }
}
