import com.microsoft.demo.Demo;
import org.junit.Test;

public class TestCalculator
{
  Calculator c = new Calculator();
  
  @Test
  public void testAdd()
  {
    assertEquals(5, c.add(2, 3));
  }
}
