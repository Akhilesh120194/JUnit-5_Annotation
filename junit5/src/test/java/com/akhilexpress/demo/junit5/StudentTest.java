package com.akhilexpress.demo.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	public void assertAll()
	{
		Student student=new Student(1, "Akhilesh", "India");
	//	assertEquals("Akhilesh", student.getName());
	//	assertEquals("India", student.getCountry());
		Assertions.assertAll("Testing Student Properties", ()->{
			assertEquals("Akhilesh", student.getName());},
				()->{assertEquals("India", student.getCountry());}
			
		);
	
}
}
