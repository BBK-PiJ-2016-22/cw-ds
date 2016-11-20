import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit test for SampleableListImpl
 */
public class SampleableListImplTest {

    private SampleableList test;


    @Before
    public void setUp(){
        test = new SampleableListImpl();
        for (int i = 0; i < 50; i++){
            test.add('a');
        }
    }

    @Test
    public void sampleTest() throws Exception {
        int a = 0;
        for (int i = 0; i < 50; i++) {
            assertEquals(test.sample().get(i).getReturnValue(),test.get(i+a).getReturnValue());
            a++;
        }


    }

}
