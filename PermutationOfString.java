public class PermutationOfString {

    public static void main(String[] args) {
        String s = "abc";
        permute(s, "");
    }

    private static void permute(String s, String temp) {
        if (s.equals("")) {
            System.out.println(temp);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i + 1);
            String rem = left + right;
            permute(rem, temp + ch);
        }
    }
}
