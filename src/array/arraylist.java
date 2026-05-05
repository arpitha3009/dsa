package array;

import java.util.ArrayList;

public class arraylist {
    public static void main (String[] args){
        ArrayList<Integer> arrl = new ArrayList<>();
        arrl.add(10);
        arrl.add(20);
        arrl.add(30);
        arrl.add(40);
        arrl.add(50);
        arrl.add(60);
       System.out.println(arrl);
       arrl.remove(1);
        System.out.println(arrl);

        System.out.println(arrl.get(1));
        System.out.println(arrl.size());

    }
}
