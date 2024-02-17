import java.util.ArrayList;
import java.util.List;

public class StringSubSets {

    public static void main(String[] args) {
        String s = "s";
        List<String> l = new ArrayList<>();
        subset(s, "", 0, l);
        System.out.println(l.size()); 
    }

    private static void subset(String s, String ans, int idx, List<String> l) {
        if (idx == s.length()) {
            l.add(ans);
            return;
        }

        char curr = s.charAt(idx);
        subset(s, ans + curr, idx + 1, l);
        subset(s, ans, idx + 1, l);
    }
}
