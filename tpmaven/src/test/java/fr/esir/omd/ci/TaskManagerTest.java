package fr.esir.omd.ci;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TaskManagerTest {
    @Test
    public void testAddAndGetTasks() {
        TaskManager manager = new TaskManager();
        Task task = new Task("Test", "Description test", false);
        manager.addTask(task);
        assertEquals(1, manager.getTasks().size());
    }
}