import org.junit.*;
import static org.junit.Assert.assertEquals;
import mockit.*;
import edu.lmu.cs.mike.impl.*;

public class MyFirstJMockitTest
{
   // Mocked instances (rather than conventional "mock objects") will be
   // automatically created and assigned to annotated mock fields:
   @Mocked
   MultiplicationDoubler mock1; // all current and future instances are mocked

   @Injectable
   AdditionDoubler anotherMock; // only one particular instance is mocked

   @Test
   public void myFirstTestMethod()
   {
      // Any mock field can be used here or in any other test method of the class.
      assertEquals(true, true);
   }

   @Test
   public void testMethodWithMockParameter(@Mocked AdditionDoubler testSpecificMock)
   {
      assertEquals(true, true);
   }
}
