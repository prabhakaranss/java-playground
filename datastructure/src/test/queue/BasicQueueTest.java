package queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicQueueTest {

    @Test
    public void basicQueueTest() throws Exception {
        BasicQueue<String> basicQueue = new BasicQueue<>();
        basicQueue.enQueue("Rohit Sharma");
        basicQueue.enQueue("KL Rahul");

        assertEquals(basicQueue.size(), 2);

        assertEquals(basicQueue.deQueue(), "Rohit Sharma");

        assertEquals(basicQueue.size(), 1);

        basicQueue.enQueue("Kholi");
        basicQueue.enQueue("dhoni");

        assertEquals(basicQueue.size(), 3);
        assertEquals(basicQueue.search("KL Rahul"), "KL Rahul");

        assertEquals(basicQueue.deQueue(), "KL Rahul");
        assertEquals(basicQueue.deQueue(), "Kholi");
        assertEquals(basicQueue.deQueue(), "dhoni");

        assertEquals(basicQueue.size(), 0);
        //assertEquals(basicQueue.deQueue(), "dhoni");
        //assertEquals(basicQueue.search("KL Rahul"), "KL Rahul");

    }
}
