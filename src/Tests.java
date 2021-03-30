import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Tests {

    public WordCount testing;

    @Before
    public void setUp() {
        testing = new WordCount(new HashMap<>());
    }

    @After
    public void tearDown() {
        testing=null;
    }

    @Test
    public void testGetCountEmpty() {
        if(!testing.getCounts().isEmpty()) {
            fail("InterruptedException");
        }
    }

    @Test
    public void testGetCountNonEmpty() {
        ArrayList<String> list= new ArrayList<>();
        Iterator itrtr= Arrays.asList("one","one","one", "two","two","three").iterator();
        testing.countWords(itrtr);

        assertEquals(3,testing.getCount("one"));
        assertEquals(2,testing.getCount("two"));
        assertEquals(1,testing.getCount("three"));

        if(testing.getCount("one")!=3 || testing.getCount("two")!=2 || testing.getCount("three")!=1 ) {
            fail("test failed, expected value is incorrect");
        }
    }

    @Test
    public void testGetCountNonEmpty1() {

        ArrayList<String> list= new ArrayList<>();
        Iterator itrtr= Arrays.asList("find","misery","science","packet","brain","science","find","packet","find").iterator();
        testing.countWords(itrtr);

        assertEquals(3,testing.getCount("find"));
        assertEquals(2,testing.getCount("science"));
        assertEquals(2,testing.getCount("packet"));
        assertEquals(1,testing.getCount("misery"));
        assertEquals(1,testing.getCount("brain"));

        if(testing.getCount("find")!=3 || testing.getCount("science")!=2 || testing.getCount("packet")!=2 || testing.getCount("misery")!=1 || testing.getCount("brain")!=1) {
            fail("test failed, expected value is incorrect");

        }
    }
}