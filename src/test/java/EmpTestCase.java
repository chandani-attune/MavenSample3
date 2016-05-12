import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class EmpTestCase {


	Employee obj=new Employee();

	@Test
	public void testGetSalary() {
		int sal=obj.getSalary(100, 700);
		Assert.assertEquals(sal, 7000);
	}

}
