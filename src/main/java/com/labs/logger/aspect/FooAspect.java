package com.labs.logger.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

@Aspect
public class FooAspect {
  Logger logger = LoggerFactory.getLogger(FooAspect.class);


  @Around("execution(* com.labs.logger.entities.Foo.*(..))")
  public Object measureMethod(ProceedingJoinPoint pjp) throws Throwable
  {
    StopWatch sw = new StopWatch();
    Object retVal;
    try
    {
      sw.start(pjp.getTarget()+"."+pjp.getSignature());
      retVal = pjp.proceed();
    }
    catch (Throwable e)
    {
      throw e;
    }
    finally
    {
      sw.stop();
      logger.info(sw.prettyPrint());
    }
    return retVal;
  }
}
