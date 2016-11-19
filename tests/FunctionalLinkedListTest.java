import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Unit test form FunctionalArrayList
 */
public class FunctionalLinkedListTest {


        private FunctionalLinkedList test;

        @Before
        public void setUp(){
            test = new FunctionalLinkedList();
            for (int i = 0; i < 50; i++){
                test.add('a');
            }
        }

        @Test
        public void headTest() throws Exception {
            assertEquals(test.head().getReturnValue(), test.get(0).getReturnValue());

        }

        @Test
        public void restTest() throws Exception {
            for (int i = 0; i < 50; i++) {
                assertEquals(test.rest().get(i).getReturnValue(), test.get(i+1).getReturnValue());

            }
        }


}