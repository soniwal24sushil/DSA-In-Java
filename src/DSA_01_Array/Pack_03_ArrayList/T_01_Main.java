package DSA_01_Array.Pack_03_ArrayList;

import java.util.ArrayList;

public class T_01_Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        System.out.println(list);
        list.add(0, 7);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
    }
}
