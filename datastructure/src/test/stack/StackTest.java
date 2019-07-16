package stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StackTest {

    @Test
    public void BasicStackTest() {
        BasicStack<String> basicStack = new BasicStack<>();
        basicStack.push("one");
        basicStack.push("two");
        basicStack.push("three");

        assertEquals(basicStack.pop(), "three");
        assertEquals(basicStack.pop(), "two");
    }

}
