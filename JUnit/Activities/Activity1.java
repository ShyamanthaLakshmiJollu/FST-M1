package practisePackage;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Activity1 {
	
	static ArrayList<String> list;
	
	@BeforeAll
	public void setUp()
	{
		list=new ArrayList<String>();
		list.add("alpha");
		list.add("beta");
	}
	
	@Test
	public void insertTest() {
		
		assertEquals(2,list.size(),"length before insert");
		list.add(2,"Charlie");
		assertEquals(3,list.size(),"length after insert");
	}
	 @Test
	    public void replaceTest() {
	        
	        list.set(1, "charlie");
	 
	        // Assert size of list
	        assertEquals(2, list.size(), "Wrong size");
	        // Assert individual elements
	        assertEquals("alpha", list.get(0), "Wrong element");
	        assertEquals("charlie", list.get(1), "Wrong element");
	    }
	}


