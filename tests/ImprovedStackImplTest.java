import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit test of ImprovedStackImpl
 */
public class ImprovedStackImplTest {

    private ImprovedStack testOne;
    private ImprovedStack testTwo;
    private ImprovedStack testThree;
    private ImprovedStack testFour;
    private ImprovedStack testFive;

    @Before
    public void setUp() {
        testTwo = new ImprovedStackImpl();
        testOne = new ImprovedStackImpl();
        testThree = new ImprovedStackImpl();
        testFour = new ImprovedStackImpl();
        testFive = new ImprovedStackImpl();

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
        ImprovedStack testEmpty = new ImprovedStackImpl();
        assertEquals(testEmpty.isEmpty(), true);
        assertEquals(testOne.isEmpty(), false);

    }

    @Test
    public void sizeTest() throws Exception {
        ImprovedStack testSize = new ImprovedStackImpl();

        for (int i = 0; i < 2000; i++){
            assertEquals(testSize.size(), i);
            testSize.push(2);

        }
    }

    @Test
    public void pushTest() throws Exception {
        ImprovedStack testOnePush = new ImprovedStackImpl();
        ImprovedStack testTwoPush = new ImprovedStackImpl();


        for (int i = 0; i < 2000; i++) {

            assertEquals(testOnePush.size(), i);
            assertEquals(testTwoPush.size(), i);
            testOnePush.push('a');
            testTwoPush.push('b');

        }

    }

    @Test
    public void topTest() throws Exception {
        assertEquals(testOne.top().getReturnValue(), testOne.pop().getReturnValue());
        assertEquals(testTwo.top().getReturnValue(), testTwo.pop().getReturnValue());
        assertEquals(testThree.top().getReturnValue(), testThree.pop().getReturnValue());
        assertEquals(testFour.top().getReturnValue(), testFour.pop().getReturnValue());
        assertEquals(testFive.top().getReturnValue(), testFive.pop().getReturnValue());


    }

    @Test
    public void popTest() throws Exception {

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

    @Test
    public void reverseTest() throws Exception {


        for (int i = 49; i > 0; i--) {
            testOne.pop();
        }
        for (int i = 49; i > 0; i--) {
            testThree.pop();
        }

        assertEquals(testTwo.reverse().top().getReturnValue(), testOne.top().getReturnValue());
        assertEquals(testTwo.reverse().top().getReturnValue(), testThree.top().getReturnValue());
    }

    @Test
    public void removeTest() throws Exception {

        ImprovedStack testRemove = new ImprovedStackImpl();

        for (int i = 0; i < 50; i++) {
            testRemove.push('a');
        }

        assertEquals(testRemove.size(), 50);
        testRemove.remove('a');
        assertEquals(testRemove.size(), 0);

        for (int i = 0; i < 50; i++) {
            testRemove.push('a');
        }

        assertEquals(testRemove.size(), 50);
        testRemove.remove("X");
        assertNotEquals(testRemove.size(), 0);


    }

}