public class Solution{
public static String say(String s) {
        String res = "";
        
        int p1 = 0;
        int p2 = 0;
        
        while (p2 < s.length()) {
            if (s.charAt(p1) != s.charAt(p2)) {
                res += (p2 - p1) + "" + s.charAt(p1);
                p1 = p2;
            }
            p2++;
        }
        res += (p2 - p1) + "" + s.charAt(p1);
        return res;
    }
public String countAndSay(int n) {
        String res = "1";
        
        for (int i=1; i<n; i++) {
            res = say(res);
        } 
        return res;
    
    }
}