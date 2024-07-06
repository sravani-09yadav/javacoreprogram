package com.tns.scannerclass;

import java.util.Scanner;

public class personexec {
	
	public static void main(String[] args) {
		 Scanner Sc=new   Scanner(System.in);
	     
		  System.out.println("enter you are name");
		      String name=Sc.nextLine();
			     
			  System.out.println("enter you are income");
			    int income=Sc.nextInt();
			    
			    
			 Person  pp=new Person ();
			 pp.setName(name);
			 pp.setIncome(income);
			 
			 Taxcalculation t=new Taxcalculation();
			 
			 t.calculatetax(pp);
			 System.out.println("after calu tax");
			 System.out.println(pp);
	}

}
