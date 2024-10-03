package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import edu.grinnell.csc207.util.KeyNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;

import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Your Name Here
 */
public class TestsFromStudent {
  /**
   * A simple test.
   */
  @Test
  public void alwaysPass() throws Exception {
    assertEquals(2, 1+1);
  } // alwaysPass()

  /**
   * Tests for case sensitivity.
   */
  @Test
  public void sackmannGrantTest1() throws Exception {
    AssociativeArray<String, String> aa = new AssociativeArray<String, String>();

    aa.set("Alvin", "Harris");
    try {
      aa.get("alvin");
      fail("Did not throw Exception");
    } catch (Exception e) {
      // Do nothing
    }
  } // sackmannGrantTest1()

  /**
   * Repeated key values in aa list.
   */
  @Test
  public void sackmannGrantTest2() throws Exception {
    AssociativeArray<String, String> aa = new AssociativeArray<String, String>();
    aa.set("Alvin", "Harris");
    aa.set("Alvin", "Aethylthryth");
    assertEquals("Aethylthryth", aa.get("Alvin"));
  } // sackmannGrantTest2()

  /**
   * Removal from the middle of array
   */
  @Test
  public void sackmannGrantEdge() throws Exception {
    AssociativeArray<String, String> aa = new AssociativeArray<String, String>();
    aa.set("a","b");
    aa.set("b","c");
    aa.set("d","e");
    aa.set("f","g");
    aa.set("h","i");
    aa.remove("d");
    assertEquals("i", aa.get("h"));
    } //  sackmannGrantEdge()
} // class TestsFromSam
