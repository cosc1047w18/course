package unittestexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class TriangleTest extends TestCase {
	private Triangle t;

	// Any method named setUp will be executed before each test.
	protected void setUp() {
		t = new Triangle(5, 4, 3);
	}

	protected void tearDown() {
	} // tearDown will be executed afterwards

	public void testIsScalene() { // All tests are named test[Something]
		assertTrue(t.isScalene());
	}

	public void testIsEquilateral() {
		assertFalse(t.isEquilateral());
	}
}
