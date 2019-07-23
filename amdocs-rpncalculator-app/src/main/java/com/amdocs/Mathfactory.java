package com.amdocs;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

public class Mathfactory {

	 private static HashMap< String, String> classNameMap;
	 static {
		  classNameMap= new HashMap< String ,String>();
	 try
	 {
		 FileInputStream file=new FileInputStream("/home/train/amdocs-rpncalculator-app/src/main/java/com/amdocs/config.properties");
		 Properties properties=new Properties();
		 properties.load(file);
		 properties.forEach((key,value)->{
			 classNameMap.put((String)key, (String)value);
		 });
		 
	 }
	 catch (Exception e) {
		 e.printStackTrace();
		 }
	 }       
	public static IMathOperation getObject(String mathOperator) {
		
		IMathOperation mathOperation=null;
		
		String className=classNameMap.get(mathOperator);
		try
		{
			mathOperation=(IMathOperation)Class.forName(className).newInstance();
		}
		catch(Exception e) {e.printStackTrace();}
		/*
		if(mathOperator.equals("+"))
			mathOperation=new Addition();
		else if(mathOperator.equals("-"))
			mathOperation=new Subtratcion();
		else if(mathOperator.equals("*"))
			mathOperation=new Multiplication();
		else if(mathOperator.equals("/"))
			mathOperation=new Division();
		*/
		return mathOperation;
	}

}
