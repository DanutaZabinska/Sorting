package Sorting.Sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest {

@Test
	
	public void shouldSayIs15InRange()
	{
		Range range= new Range(10,20);
	assertTrue("nie jest", range.isInRange(12));
		
	}

}
