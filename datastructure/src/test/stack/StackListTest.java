package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StackListTest {

    @Test
    public void BasicStackTest() {
        BasicStackList<String> basicStackList = new BasicStackList<>();
        basicStackList.push("one");
        basicStackList.push("two");
        basicStackList.push("three");

        assertEquals(basicStackList.pop(), "three");
        assertEquals(basicStackList.pop(), "two");
        assertEquals(basicStackList.size(), 1);
    }

}
