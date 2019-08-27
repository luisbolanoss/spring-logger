package com.labs.logger.services;

public class Foo {

  public void bar()
  {
    for (int i = 0;i<10000000;i++)
    {
      String foobar = "foobar";
      foobar.replaceAll("o", "i");
    }
  }
}
