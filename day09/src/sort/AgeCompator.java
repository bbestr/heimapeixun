package sort;

import java.util.Comparator;

public class AgeCompator implements Comparator<Cat> {
    public AgeCompator() {
    }

    public int compare(Cat o1, Cat o2) {
        int age1 = o1.getMonth();
        int age2 = o2.getMonth();
        return age2 - age1;
    }
}
