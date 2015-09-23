package interview;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaximumyieldTest {

	@Test
	public void test() {
		Maximumyield test=new Maximumyield();
		int[] s1={ 206, 140, 300, 52, 107};
		int[] s2={147, 206, 52, 240, 300 };
		int result1=test.maxYield(s1);
		int result2=test.maxYield(s2);
		assertEquals(613, result1);
		assertEquals(506, result2);
	}

}
