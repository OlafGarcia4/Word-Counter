import java.util.Comparator;
import java.util.Map;

public class DescendingCount implements Comparator<Map.Entry<String, Integer>> {
    public int compare(final Map.Entry<String, Integer> l, final Map.Entry<String, Integer> r) {
        if (l.getValue() > r.getValue()) {
            return -1;
        }
        if (l.getValue() < r.getValue()) {
            return 1;
        } else {
            return 0;
        }

    }
}


