import java.util.ArrayList;
import java.util.List;

public class PermutationOfStringTwo {

    public static void main(String[] args) {
        String s = "abc";
        List<String> l = new ArrayList<>();
        permute(s, "", l);
        System.out.println(l);
    }

    private static void permute(String s, String temp, List<String> l) {
        if (s.equals("")) {
            l.add(temp);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i + 1);
            String rem = left + right;
            permute(rem, temp + ch, l);
        }
    }
}
