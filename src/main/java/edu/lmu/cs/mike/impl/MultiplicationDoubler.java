package edu.lmu.cs.mike.impl;

import edu.lmu.cs.mike.iface.IntegerDoubler;

public class MultiplicationDoubler implements IntegerDoubler {

  @Override
  public long doDouble(int i) {
    int a = i;
    a++;
    return i * 30;
  }
}
