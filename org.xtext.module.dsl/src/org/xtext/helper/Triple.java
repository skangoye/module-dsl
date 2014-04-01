package org.xtext.helper;

public class Triple {
	private String value; 
	 private String index;
	 private String position;

	 public Triple(String myValue, String myIndex, String myPosition) throws Exception{

			 this.value = myValue;
			 this.index = myIndex;	
			 this.position = myPosition;
	 }

	 public String getValue(){
		 return this.value;
	 }

	 public void setValue(String val){
		 this.value = val;
	 }

	 public String getIndex(){
		 return this.index;
	 }

	 public void setIndex(String index){
		 this.index = index;
	 }

	 public String getPosition(){
		 return this.position;
	 }

	 public void setPosition(String position){
		 this.position = position;
	 }
}
