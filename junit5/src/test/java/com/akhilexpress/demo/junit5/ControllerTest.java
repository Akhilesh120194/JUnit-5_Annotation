package com.akhilexpress.demo.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class ControllerTest {

	Controller controller;
	
	@BeforeAll //Method annotated with @beforeAll shoud be static because it has to be called even before the creatjion of class instance 
	public static void init()
	{
		System.out.println("Inside Init method ");
	}
	
	@BeforeEach
	public void setUp() throws Exception
	{
		controller=new Controller();
	}
	
	@Test
	@DisplayName("HomePage Test")
	public void showHomePage_Test()
	{
	//	assertEquals("Home-page", controller.showHomePage());
		assertEquals("Home-page", controller.showHomePage(),"the actual and expected home page doesn't match ");
	}
	
	@Test
	public void showContactUsPage_Test()
	{
		assertEquals("show-contact-us-page", controller.showContactUsPage());
	}
	
	@Disabled
	@Test
	public void Sampletest()
	{
		assertEquals(1, 1234);
	}

	@EnabledOnOs(OS.MAC)
	@Test
	public void runInMac()
	{
		System.out.println("You are running MAC machine ");
	}
	
	@EnabledOnOs(OS.WINDOWS)
	@Test
	public void runInWindows()
	{
		System.out.println("You are running windows machine ");
	}
	
	@EnabledOnJre(value = JRE.JAVA_8)
	@Test
	public void runItOnJRE8()
	{
		System.out.println("JAVA 8");
	}
	
	@EnabledOnJre(value = JRE.JAVA_11)
	@Test
	public void runItOnJRE11()
	{
		System.out.println("JAVA 11");
	}
}
