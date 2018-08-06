import org.junit.*;
import static org.junit.Assert.*;

public class MathTest {  
  private static double sqrt2;  
  
  @BeforeClass
  public static void setUp() { sqrt2 = Math.sqrt(2);}
  
  @Test
  public void ceil() { 
    assertTrue( 4 == Math.ceil(3.1) );
  }
  
  @Test
  public void pow() { 
    assertEquals( 2, Math.pow( sqrt2, 2 ), 0.000001 );
  }
  
  @Test
  public void sin() { 
    assertEquals( sqrt2/2.0, Math.sin(Math.PI / 4.0), 0.000001 );
  } 
}