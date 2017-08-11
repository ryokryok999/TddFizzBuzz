import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testFizz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Fizz", fb.fizzBuzz(3));
	}
	@Test
	public void testBuzz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Buzz", fb.fizzBuzz(5));
	}
	@Test
	public void testFizzBuzz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("FizzBuzz", fb.fizzBuzz(15));
	}
	@Test
	public void testNotFizzBuzz() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("22", fb.fizzBuzz(22));
	}

}
