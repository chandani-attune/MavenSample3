import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class StuTestCase {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	Student obj=new Student();
	@Test
	public void testCountAvg() 
	{
		int res=obj.countAvg(10, 20, 30);
		Assert.assertEquals(res, 20);
		
		res=obj.countAvg(20, 20, 20);
		Assert.assertEquals(res, 20);
	}

	@Test
	public void testGetGrades() {
		String res=obj.getGrades(95);
		Assert.assertEquals("A", res);
	}
	@Ignore("This is ignored intentionally")
	@Test
	public void testCountAvgIgnored() {
		Assert.assertEquals(20,obj.countAvg(10, 10, 10));
	}
	
	@Test
	public void testCountAvg1() 
	{
		int res=obj.countAvg(10, 20, 30);
		Assert.assertEquals(res, 50);
	}

	
}
