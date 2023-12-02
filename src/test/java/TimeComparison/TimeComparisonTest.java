package TimeComparison;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeComparisonTest {

    @Test
    public void testTableArray() {
        TimeComparison temp = new TimeComparison("ArrayList", 3);
        temp.Add();
        assertEquals(3, temp.getList().size());
        temp.RemoveEnd();
        assertEquals(0, temp.getList().size());
    }

    @Test
    public void testTableLinked() {
        TimeComparison temp = new TimeComparison("LinkedList", 3);
        temp.Add();
        assertEquals(3, temp.getList().size());
        temp.RemoveEnd();
        assertEquals(0, temp.getList().size());
    }
}