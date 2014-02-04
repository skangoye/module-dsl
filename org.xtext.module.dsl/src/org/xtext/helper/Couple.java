package org.xtext.helper;

public class Couple {
	 private char value; //Value is either 'F'(False) or 'T'(True)
	 private String index; // index of the value
	 
	 public Couple(char myValue, String myIndex) throws Exception{
		 if (myValue == 'F' || myValue == 'T'){
			 this.value = myValue;
		 }
		 else{
			 throw new Exception("Invalid Value argument");
		 }
		 
		// if(myIndex == ){
			 this.index = myIndex;	
		 //}
		 
	 }
	 
	 public char getValue(){
		 return this.value;
	 }
	 
	 public void setValue(char val){
		 this.value = val;
	 }
	 	 
	 public String getIndex(){
		 return this.index;
	 }
	 
	 public void setIndex(String index){
		 this.index = index;
	 }
	 
	 public void invertValue(){
		 if (this.value == 'F'){
			 this.value = 'T';
		 }
		 else{
			 if (this.value == 'T'){
				 this.value = 'F';
			 }
		 }
	 }
	 
	 public void incrIndex(int i){
		 this.index = index + new Integer(i).toString();
	 }
}
