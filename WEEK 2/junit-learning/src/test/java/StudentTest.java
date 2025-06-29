import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    
    private Student student;
    private final String TEST_NAME = "John Doe";
    private final int TEST_AGE = 20;
    
    @Before
    public void setUp() {
        // Arrange - Setup test fixture before each test
        System.out.println("Setting up test fixture...");
        student = new Student(TEST_NAME, TEST_AGE);
    }
    
    @After
    public void tearDown() {
        // Cleanup after each test
        System.out.println("Cleaning up test fixture...");
        student = null;
    }
    
    @Test
    public void testStudentCreation() {
        // Arrange - Already done in setUp()
        
        // Act - No additional action needed for this test
        
        // Assert
        assertEquals("Student name should match", TEST_NAME, student.getName());
        assertEquals("Student age should match", TEST_AGE, student.getAge());
        assertTrue("Initial grades list should be empty", student.getGrades().isEmpty());
    }
    
    @Test
    public void testAddValidGrade() {
        // Arrange
        int validGrade = 85;
        
        // Act
        student.addGrade(validGrade);
        
        // Assert
        assertEquals("Should have 1 grade", 1, student.getGrades().size());
        assertTrue("Grades should contain the added grade", 
                  student.getGrades().contains(validGrade));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testAddInvalidGrade() {
        // Arrange
        int invalidGrade = 150;
        
        // Act
        student.addGrade(invalidGrade);
        
        // Assert - Exception expected
    }
    
    @Test
    public void testAverageGradeCalculation() {
        // Arrange
        int[] grades = {80, 90, 70, 85};
        double expectedAverage = 81.25;
        
        // Act
        for (int grade : grades) {
            student.addGrade(grade);
        }
        double actualAverage = student.getAverageGrade();
        
        // Assert
        assertEquals("Average should be calculated correctly", 
                    expectedAverage, actualAverage, 0.01);
    }
    
    @Test
    public void testPassingStudent() {
        // Arrange
        int[] passingGrades = {70, 80, 90};
        
        // Act
        for (int grade : passingGrades) {
            student.addGrade(grade);
        }
        
        // Assert
        assertTrue("Student should be passing", student.isPassing());
    }
    
    @Test
    public void testFailingStudent() {
        // Arrange
        int[] failingGrades = {40, 50, 45};
        
        // Act
        for (int grade : failingGrades) {
            student.addGrade(grade);
        }
        
        // Assert
        assertFalse("Student should be failing", student.isPassing());
    }
    
    @Test
    public void testEmptyGradesList() {
        // Arrange - Student already created in setUp()
        
        // Act - No grades added
        double average = student.getAverageGrade();
        
        // Assert
        assertEquals("Average of empty grades should be 0", 0.0, average, 0.01);
        assertFalse("Student with no grades should not be passing", student.isPassing());
    }
}
