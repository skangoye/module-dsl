package org.xtext.helper;

public class Couple {
	 private String val1; 
	 private String val2; 
	 
	 public Couple(String myValue1, String myValue2){
			 this.val1 = myValue1;
			 this.val2 = myValue2;	
	 }
	 
	 public String getFirst(){
		 return this.val1;
	 }
	 
	 public void setFirst(String val){
		 this.val1 = val;
	 }
	 	 
	 public String getSecond(){
		 return this.val2;
	 }
	 
	 public void setSecond(String val){
		 this.val2 = val;
	 }
}
