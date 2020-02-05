package edu.lmu.cs.mike.impl;

import edu.lmu.cs.mike.iface.IntegerDoubler;

public class BitShiftDoubler implements IntegerDoubler {

  @Override
  public long doDouble(int i) {
//    return 0;
  return i + i + i + i;
  }
}
