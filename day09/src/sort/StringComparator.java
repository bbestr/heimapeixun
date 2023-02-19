package sort;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {

        int i = o2.compareTo(o1);
        return i;
    }
}
