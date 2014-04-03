package org.xtext.mcdc.generator;

import java.util.ArrayList;
import java.util.List;

import org.xtext.helper.Couple;
import org.xtext.helper.Triple;

public class Test {

	public static void main(String[] args) throws Exception {
		MCDC mcdc = new MCDC();
		 String str1 = "FFFTT";
		 String str2 = "TFFTF";
		 String str3 = "TTTTT";
		 String str4 = "FFFFT";
		 String str5 = "TFFFT";
		 String str6 = "FTTTT";
		 
		 List<List<Couple>> list = new ArrayList<List<Couple>>();
		 int i =0;
		 for(i=0; i<5; i++){
			 list.add(new ArrayList<Couple>());
		 }
		 
		 // mcdc.addIndepVector(str1, str2, list);
		 
		 
		  //mcdc.addIndepVector(str1, str3, list);
		 
		  //mcdc.addIndepVector(str1, str4, list);
		  //mcdc.addIndepVector(str5, str4, list);
		  //mcdc.addIndepVector(str3, str6, list);
		  
		  System.out.println(list.toString());
		 
		 /*System.out.println(mcdc.deleteLast(str1));
		 System.out.println(mcdc.lastChar(str2));
		 System.out.println(mcdc.lastChar(str3));
		 System.out.println(mcdc.lastChar(str4));
		 
		 List<Triple> l1 = new ArrayList<Triple>();
		 List<Triple> l2 = new ArrayList<Triple>();
		 
		 l1.add(new Triple ("T","111","101"));
		 l1.add(new Triple ("F","111","101"));
		 l1.add(new Triple ("T","121","101"));
		 l1.add(new Triple ("T","121","101"));
		 l1.add(new Triple ("F","121","101"));
		 
		 l2.add(new Triple ("F","111","100"));
		 l2.add(new Triple ("T","111","100"));
		 l2.add(new Triple ("T","121","100"));
		// l2.add(new Triple ("F","211","100"));
		 //l2.add(new Triple ("T","212","100"));
		 
		 List<Triple> myList = mcdc.merge(l1, l2);
		 int size = myList.size();
		 int i;
		 System.out.print("[ ");
		 for (i= 0; i < size; i++){
			System.out.print( "(" + myList.get(i).getValue() + ", " + myList.get(i).getIndex() + ", " 
					            + myList.get(i).getPosition() + ") ");
		 }
		 System.out.println("] ");
		 */
		 



	}

}
