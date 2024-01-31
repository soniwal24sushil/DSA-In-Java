package DSA_03_Recursion.Pack_06_Recursion_Permutations;

public class T_01_Print_All_Permutations {

    public static void permutations(String ans, String str) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        char ch = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0, i);
            String second = ans.substring(i);
            permutations(first + ch + second, str.substring(1));
        }
    }

    public static void main(String[] args) {
        permutations("", "ABC");
    }
}
