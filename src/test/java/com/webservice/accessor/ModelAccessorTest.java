package test.java.com.webservice.accessor;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ModelAccessorTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }


  @Test
  public void getAllModels() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getModel() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void insertModel() {
    
  }
}
