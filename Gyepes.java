//
// File: ButtonPanel.java
//Author: Baráth Dávid
// Copyright: 2021, Baráth Dávid
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
	
	double terulet=Math.pow(sugar,2)*Math.PI;
	double terulet_fele=terulet/2;
	double osszeg = terulet_fele*forint;
	
	System.out.println(terulet_fele+"négyzetméter gyeptéglára van szükség");
	System.out.println(osszeg+"FT-ba kerül ");
	
	
	
	
	
	
	}
}

