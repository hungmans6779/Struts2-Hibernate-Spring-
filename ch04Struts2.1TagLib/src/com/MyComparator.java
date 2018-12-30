package com;

import java.util.Comparator;

public class MyComparator implements Comparator{
  
  public int compare(Object element1,Object element2){
	return element1.toString().length() - element2.toString().length();  
  }
  
}
