import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MathTest {  
	private static double sqrt2;
	private static final double THRESHOLD = 0.000001;

	@BeforeAll
	public static void setUp() { sqrt2 = Math.sqrt(2);}

	@Test
	public void ceilTest() { 
		assertTrue(4 == Math.ceil(3.1));
	}

	@Test
	public void powTest() { 
		assertEquals(2, Math.pow(sqrt2, 2), THRESHOLD);
	}

	@Test
	public void sinTest() { 
		assertEquals(sqrt2/2.0, Math.sin(Math.PI / 4.0), THRESHOLD);
	} 
}