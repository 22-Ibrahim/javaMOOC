


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author ebrah
 */
public class ExerciseManagementTest {
    private ExerciseManagement management;
    
    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }
    @Test
    public void exerciseListEmptyAtBeginning() {        
        assertEquals(0, management.exerciseList().size());
    }
    @Test
    public void addingExerciseGrowsListByOne() {        
        management.add("Write a test");        
        assertEquals(1, management.exerciseList().size());
    }
    @Test
    public void addedExerciseIsInList() {
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }
    @Test
    public void exerciseCanBeMarkedAsCompleted() {    
        management.add("New exercise");    
        management.markAsCompleted("New exercise");    
        assertTrue(management.isCompleted("New exercise"));
    }
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("New exercise");    
        management.markAsCompleted("New exercise");    
        assertFalse(management.isCompleted("some exercise"));
    }
}



