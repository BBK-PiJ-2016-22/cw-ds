import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit test of StackImpl
 */
public class StackImplTest {

    private Stack testOne;
    private Stack testTwo;
    private Stack testThree;
    private Stack testFour;
    private Stack testFive;

    @Before
    public void setUp() {
        testTwo = new StackImpl();
        testOne = new StackImpl();
        testThree = new StackImpl();
        testFour = new StackImpl();
        testFive = new StackImpl();

        for (int i = 0; i < 50; i++) {
            testOne.push(i);
            testTwo.push(i);
            testThree.push(i);
            testFour.push(i);
            testFive.push(i);
        }
    }

    @Test
    public void isEmptyTest() {
        Stack testEmpty = new StackImpl();
        assertEquals(testEmpty.isEmpty(), true);
        assertEquals(testOne.isEmpty(), false);

    }

    @Test
    public void sizeTest() throws Exception {
        Stack testSize = new StackImpl();

        for (int i = 0; i < 2000; i++){
            assertEquals(testSize.size(), i);
            testSize.push(2);

        }
    }

    @Test
    public void push() throws Exception {
        Stack testOnePush = new StackImpl();
        Stack testTwoPush = new StackImpl();


        for (int i = 0; i < 2000; i++) {

            assertEquals(testOnePush.size(), i);
            assertEquals(testTwoPush.size(), i);
            testOnePush.push('a');
            testTwoPush.push('b');

        }

    }

    @Test
    public void top() throws Exception {
        assertEquals(testOne.top().getReturnValue(), testOne.pop().getReturnValue());
        assertEquals(testTwo.top().getReturnValue(), testTwo.pop().getReturnValue());
        assertEquals(testThree.top().getReturnValue(), testThree.pop().getReturnValue());
        assertEquals(testFour.top().getReturnValue(), testFour.pop().getReturnValue());
        assertEquals(testFive.top().getReturnValue(), testFive.pop().getReturnValue());


    }

    @Test
    public void pop() throws Exception {

        for (int i = 50; i >= 0; i--) {

            assertEquals(testOne.size(), i);
            testOne.pop();

            assertEquals(testTwo.size(), i);
            testTwo.pop();

            assertEquals(testThree.size(), i);
            testThree.pop();

            assertEquals(testFour.size(), i);
            testFour.pop();

            assertEquals(testFive.size(), i);
            testFive.pop();

            assertEquals(testOne.top().getReturnValue(), testTwo.top().getReturnValue());
        }

    }

}