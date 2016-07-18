package edu.lmu.cs.mike;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.After;
import org.junit.Before;

import java.lang.Override;

import edu.lmu.cs.mike.iface.IntegerDoubler;
import edu.lmu.cs.mike.impl.AdditionDoubler;
import edu.lmu.cs.mike.impl.BitShiftDoubler;
import edu.lmu.cs.mike.impl.MultiplicationDoubler;

public class TestDoubler {
  private IntegerDoubler doubler = new AdditionDoubler();
  
   @Before
    public void setup() throws Exception {
        IntegerDoubler doubler = new MultiplicationDoubler();
        throw new RuntimeException("Foo");
    }

  
 /* @Test
  public void additionDoubler() {
    IntegerDoubler doubler = new AdditionDoubler();

    assertEquals(10, doubler.doDouble(5));
    assertEquals(20, doubler.doDouble(10));
  }*/

  @Test
  public void multiplicationDoubler() {
    IntegerDoubler doubler = new MultiplicationDoubler();

    assertEquals(10, doubler.doDouble(5));
    assertEquals(20, doubler.doDouble(10));
  }

  @Test
  public void bitshiftDoubler() {
    IntegerDoubler doubler = new BitShiftDoubler();

    assertEquals(10, doubler.doDouble(5));
    assertEquals(20, doubler.doDouble(10));
  }
}
