package com;

public class PrimeNum{
	public static boolean isPrime(int num) {
		boolean flag=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
		
	}

	public static void main(String[] args) {
		
			for(int i=2;i<50;i++) {
				if(isPrime(i)) {
					System.out.print(i+ " ");
				}
		}
		
	}

}
