package TestNGone;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTestone {
	@Test
	public void f() {
		System.out.println("testing");
	}

	@BeforeClass
	public void f1() {
		System.out.println("testing");
	}

	public void f2() {
		System.out.println("testing");
	}

	public void f3() {
		System.out.println("testing");
	}
}
