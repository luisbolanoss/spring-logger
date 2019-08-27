package com.labs.logger;

import com.labs.logger.services.Foo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConfigBean.class)
public class FooAOPTest {

  @Autowired
  private Foo foo;

  @Test
  public void test()
  {
    foo.bar();
  }
}
