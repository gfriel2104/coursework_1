import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;

public class Dec2HexTest
{
  @Test
  public void evaluateExpression()
  {
      Dec2Hex dec2hex = new Dec2Hex();
      int num = dec2hex.evaluate();
      assertEquals(num < 200);
  }
}
