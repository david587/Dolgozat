//
// File: Gyepes.java
//Author: Baráth Dávid
// Copyright: 2022, Baráth Dávid
// Group: Szoft 1/N
// Date: 2022-02-22
// Github: https://github.com/david587/
// Licenc: GNU GPL
//


//1 négyzetméter-->2500ft



import java.util.Scanner;
public class Gyepes {
	public static void main (String[] args) {
	System.out.println("Baráth Dávid,Szoft1/N,2022.02.22");
	
	double forint=2500;
	
	Scanner sc =new Scanner (System.in);
	
	System.out.print("Adja meg a sugárt(r):");
	double sugar = sc.nextDouble();
	
	System.out.println("------------------------------------------------------------------");
	
	double terulet=Math.pow(sugar,2)*Math.PI;
	double osszeg = terulet*forint;
	
	System.out.println(terulet+"négyzetméter gyeptéglára van szükség");
	System.out.println(osszeg+"Ft-ba kerül ");
	
	
	
	
	
	
	}
}

