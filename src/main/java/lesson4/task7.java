package lesson4;
//задание с leetcode  https://leetcode.com/problems/simplify-path/
import java.util.Deque;
import java.util.LinkedList;

public class task7 {
    public static String simplifyPath(String path) {
        Deque<String> deq = new LinkedList<>();
        String[] subPath = path.split("/");
        for (String s : subPath) {
            if ("..".equals(s)) {
                if (!deq.isEmpty()) {
                    deq.pollLast();
                }
            } else if (!".".equals(s) && !"".equals(s)) {
                deq.add(s);
            }
        }
        if (deq.isEmpty()) return "/";
        StringBuilder res = new StringBuilder();
        while (!deq.isEmpty()) {
            res.append("/").append(deq.pop());
        }
        return res.toString();
    }
}
