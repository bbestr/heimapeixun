package sort;
import java.util.Comparator;
public class NameCompator implements Comparator<Cat>{
    public NameCompator() {
    }

    public int compare(Cat o1, Cat o2) {
        String name1 = o1.getName();
        String name2 = o2.getName();
        int n = name1.compareTo(name2);
        return n;
    }
}
