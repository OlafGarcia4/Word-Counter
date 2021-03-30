import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public class WordCount {

    private final Map<String, Integer> theMap;

    public WordCount(final Map<String, Integer> theMap) {
        // TODO
        this.theMap = theMap;
    }
    public void countWords(final Iterator<String> words) {
        String s;
        while(words.hasNext()){
            s = words.next();
            theMap.put(s, theMap.getOrDefault(s, 0) + 1);
        }
    }
    public int getCount(final String word) {
        return theMap.getOrDefault(word,0);
    }
    public Map<String, Integer> getCounts() {
        return Collections.unmodifiableMap(theMap);
    }
}
