package hackerrankalgorithms;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

    static List combination = new ArrayList();
    static int aliceInt, bobInt;

    static List<Integer> compareTriplets(List<Integer> alice, List<Integer> bob) {
        for (int i = 0; i < alice.size(); i++) {
            if (alice.get(i) > bob.get(i)) {
                aliceInt++;
            } else if (alice.get(i) < bob.get(i)) {
                bobInt++;
            }


        }
        combination.add(aliceInt);
        combination.add(bobInt);
        return combination;

    }

    public static void main(String[] args) {
        List a = new ArrayList();
        List b = new ArrayList();
        a.add(11);
        a.add(22);
        a.add(33);
        b.add(9);
        b.add(23);
        b.add(10);
        List results = CompareTriplets.compareTriplets(a, b);
        System.out.println(results);

    }
}
