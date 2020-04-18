package learningobjects;

import java.util.ArrayList;
import java.util.List;

public class Check implements Number {

    int k;

    public static void main(String args[]) {

        new Check().numberOne();
       
    }

    @Override
    public void numberOne() {
        List l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        numberTwo(l);
    }

    @Override
    public List numberTwo(List k) {
        return k;
    }
}
