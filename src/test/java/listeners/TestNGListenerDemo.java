package listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners (listeners.TestNGListeners.class)

public class TestNGListenerDemo {
	@Test
	public void Test1 (){
		System.out.println("I am inside Test1");
		
	}
	@Test
	public void Test2 (){
		System.out.println("I am inside Test2");
		AssertJUnit.assertTrue(false);
		
	}
	@Test
	public void Test3 (){
		System.out.println("I am inside Test3");
		throw new SkipException("This Test is Skipped");
		
	}

}
