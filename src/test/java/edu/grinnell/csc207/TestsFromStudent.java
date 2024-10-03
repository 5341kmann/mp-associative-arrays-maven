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
    assertEquals(null, aa.get("alvin"));
  }

  /**
   * Repeated key values in aa list.
   */
  @Test
  public void sackmannGrantKeyFetchTest1() throws Exception {
    AssociativeArray<String, String> aa = new AssociativeArray<String, String>();
    aa.set("Alvin", "Harris");
    aa.set("Alvin", "Tooler");
    assertEquals("Tooler", aa.get("Alvin"));
  }

  /**
   * Checks for key of removed value.
   */
  @Test
  public void sackmannGrantRemovedKey() throws Exception {
    AssociativeArray<String, String> aa = new AssociativeArray<String, String>();
    aa.set("Alvin", "Harris");
    aa.remove("Alvin");

    assertEquals(null, aa.get("alvin"));
    }
} // class TestsFromSam
