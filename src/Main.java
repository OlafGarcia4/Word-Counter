import java.util.*;

public class Main {
    public static void main(final String[] args) throws InterruptedException {
        final Scanner input = new Scanner(System.in);
        Map<String, Integer> theMap = new HashMap<>();
        WordCount wrdC = new WordCount(theMap);
        ArrayList<String> list = new ArrayList<>();
        //scanner
        while (input.hasNext()) {
            list.add(input.next());
        }
        Iterator<String> iList = list.iterator();
        wrdC.countWords(iList);

        ArrayList<Map.Entry<String, Integer>> orglist = new ArrayList<Map.Entry<String, Integer>>(wrdC.getCounts().size());

        Iterator<Map.Entry<String, Integer>> Imap = wrdC.getCounts().entrySet().iterator();

        //ordering

        while (Imap.hasNext()) {
            orglist.add(Imap.next());
        }
        Collections.sort(orglist, new DescendingCount());

        //printing
        for(int i =0; i< orglist.size(); i++){
            System.out.print(orglist.get(i)+" ");
        }
    }
}

