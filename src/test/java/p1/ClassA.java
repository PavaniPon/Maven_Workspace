package p1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassA 
{
  @Test
  public void tc1() 
  {
	  Reporter.log("tc1 excuted",true);
  }
}
