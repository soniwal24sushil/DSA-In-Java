package DSA_03_Recursion.Pack_05_Recursion_Subset_Subsequences;

import java.util.ArrayList;

public class T_01_All_Possible_Subsequences {

    // * Method-01:- By passing an "ans" string in parameters.
    public static void subSeq1(String str, String ans) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        char ch = str.charAt(0);
        subSeq1(str.substring(1), ans + ch);
        subSeq1(str.substring(1), ans);
    }

    // * Method-02:- By creating a "res" ArrayList in function body.
    public static ArrayList<String> subSeq2(String str, String ans) {
        if (str.isEmpty()) {
            ArrayList<String> res = new ArrayList<>();
            res.add(ans);
            return res;
        }
        char ch = str.charAt(0);
        ArrayList<String> taken = subSeq2(str.substring(1), ans + ch);
        ArrayList<String> notTaken = subSeq2(str.substring(1), ans);
        taken.addAll(notTaken);
        return taken;
    }

    // * Method-03:- By creating a "res" ArrayList in parameter.
    public static void subSeq3(String str, String ans, ArrayList<String> res) {
        if (str.isEmpty()) {
            res.add(ans);
            return;
        }
        char ch = str.charAt(0);
        subSeq3(str.substring(1), ans + ch, res);
        subSeq3(str.substring(1), ans, res);
    }

    public static void main(String[] args) {
        subSeq1("ABC", "");
        System.out.println();

        System.out.println(subSeq2("ABC", ""));

        ArrayList<String> res = new ArrayList<>();
        subSeq3("ABC", "", res);
        System.out.println(res);
    }
}
