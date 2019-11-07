import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyArrayListTest {

	@Test
	void test() 
	{
		MyArrayList<Integer> intList = new MyArrayList<Integer>();
		intList.add(1);
		intList.add(-1);
		assertEquals(intList.min(), -1);
		assertEquals(intList.get(0), 1);
		
		MyArrayList<String> strList = new MyArrayList<String>();
		strList.add("foo");
		strList.add("bar");
		strList.add("a");
		assertEquals(strList.min(), "foo");
		assertEquals(strList.get(1), "bar");
	}

}
