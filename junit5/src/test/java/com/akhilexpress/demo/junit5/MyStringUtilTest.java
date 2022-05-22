package com.akhilexpress.demo.junit5;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class MyStringUtilTest {

	MyStringUtil ms;

	@BeforeEach // @Before
	public void setUp() {
		System.out.println("Inside Setup Method");
		ms = new MyStringUtil();
	}

	@Test
	public void reverseString_test() {
		System.out.println("Inside reverseString_test method");
		String reverseString = ms.reverseString("ABC");

		assertEquals("CBA", reverseString);
		assertNotNull(reverseString);

	}

	@Test
	public void isStringPallindrome_test() {

		System.out.println("Inside isStringPallindrome_test method");
		String pallindrome = ms.reverseString("level");

		assertEquals(pallindrome, "level");
		assertNotNull(pallindrome);

	}

	@Test // (expected = IllegalArgumentException.class)
	public void reverseStringWithNullAsParamValue_test() {
		System.out.println("Inside reverseStringWithNullAsParamValue_test method");
		// ms.reverseString(null);
		assertThrows(IllegalArgumentException.class, ()->{ms.reverseString(null);});

	}

	@Test // (expected = IllegalArgumentException.class)
	public void reverseStringWithEmptyStringAsParamValue_test() {
		System.out.println("Inside reverseStringWithEmptyStringAsParamValue_test method");
		assertThrows(IllegalArgumentException.class, ()->{ms.reverseString("");});
	}

	@After//@After
	public void cleanUp() {
		System.out.println("Inside clean up method");
	}

	

}
