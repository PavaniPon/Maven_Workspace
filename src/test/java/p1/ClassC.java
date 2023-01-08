package p1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassC 
{
  @Test
  public void Setup() 
  {
	  Reporter.log("Browser is setting up");
  }
}
