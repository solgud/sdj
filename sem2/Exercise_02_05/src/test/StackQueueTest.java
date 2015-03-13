package test;

import static org.junit.Assert.*;
import org.junit.*;

import main.StackQueue;
import utility.collection.QueueADT;

public class StackQueueTest {

  private QueueADT<String> stackQueue;

  @Before
  public void setUp() throws Exception {
    stackQueue = new StackQueue<String>();
  }

  @Test
  public void shouldDequeueElementsInOrder() {
    stackQueue.enqueue("first");
    stackQueue.enqueue("second");
    stackQueue.enqueue("third");

    assertEquals("first", stackQueue.dequeue());
    assertEquals("second", stackQueue.dequeue());
    assertEquals("third", stackQueue.dequeue());
  }
  
  @Test
  public void shouldReportEmptyState() {
    assertTrue(stackQueue.isEmpty());
    stackQueue.enqueue("first");
    assertFalse(stackQueue.isEmpty());
  }
  
  @Test
  public void shouldReportSize() {
    assertEquals(0, stackQueue.size());
    stackQueue.enqueue("first");
    assertEquals(1, stackQueue.size());
    stackQueue.enqueue("second");
    assertEquals(2, stackQueue.size());
    stackQueue.dequeue();
    assertEquals(1, stackQueue.size());
  }

}
