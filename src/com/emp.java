package com;

public class emp 
{
	String name;
	int emp_id;
	String company="infosys";

	public emp(String string, int i) {
            this.name=string;
            this.emp_id=i;
            System.out.println(name);
            System.out.println(company);
       	 
       	 System.out.println(emp_id);
	}

	public static void main(String[] args) 
	{
	 emp e1 = new emp("deepak", 101);
	 emp e2 = new emp("deepak", 101);
	 emp e3 = new emp("deepak2", 103);
	 
		
		
	}

}
