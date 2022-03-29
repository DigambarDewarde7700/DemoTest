package com.mavenproject.qa.mavenproject;

import com.mavenproject.lib.ReadExcelLib;

import org.testng.annotations.DataProvider;

public class DataProviderTest {
 

  @DataProvider
  public Object[][] dataProvider1() {
	  
	  ReadExcelLib excel = new ReadExcelLib();
	  String file = "D:\\Oct_Test_Workspace\\mavenproject\\TestData\\TestData.xlsx";
	  return excel.Get_Excel_Data(file, "Sheet1", 3);
   
  }
}
