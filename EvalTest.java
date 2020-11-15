package lab3.lab3_package;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class EvalTest {
	
	@Before
    public void Creating_Object_Of_ArrayListExamples_And_Linked_List_Examples() {
		ArrayListExamples obj1 = new ArrayListExamples(null);
		LinkedListExamples obj2 = new LinkedListExamples(null);
    }

	@Test
	public void Is_Empty_Return_Of_Method_carAdd() {
		ArrayListExamples obj = new ArrayListExamples(null);
		String strTest = obj.carAdd(100000);
		Assert.assertNotNull(strTest);
	}
	@Test
	public void Compare_Adding_Of_ArrayList() {
		ArrayListExamples obj1 = new ArrayListExamples(null);
		obj1.carAdd(100);
		ArrayList<Car> test_cars = new ArrayList<Car>();
		for(int i=0; i<100;i++)
			test_cars.add(new Car(null));
		Assert.assertEquals(test_cars.size(), test_cars.size());
	}		
}