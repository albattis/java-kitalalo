package kitalálosdi;

import java.util.Random;
import java.util.Scanner;

public class kitalalo {
	
	
	static int gondol()
	{
		System.out.println();
		System.out.println();
		System.out.println("Próbáld meg kitalálni arra a számra amire gondolok!!!");
		
		Random kitalaltSzam=new Random();
		int gondoltszam=kitalaltSzam.nextInt(100)+1;
		
		System.out.println();
		System.out.println("Gondoltam. Találd ki.");
		System.out.println();
		return gondoltszam;
	}
	
	static int Beiras() 
	{
		Scanner bemenet=new Scanner(System.in);
		System.out.println("Ird be a Sajátodat.");
		int szamod=Integer.parseInt(bemenet.nextLine());
		return szamod;
	}
	
	
	static void Kitalalo(int gondolat, int proba) 
	{
		while(!(gondolat==proba))
		{
			if(proba<gondolat)
				{
				System.out.println("Nagyobb számra gondoltam");
				System.out.println("Ird be úrja");
				
				}
			
			if(proba>gondolat) 
				{
					System.out.println("Kisebb számra gondoltam");
					System.out.println("Ird be úrja");
			    	 
				}
				proba=Beiras();
				
		}
		System.out.println("Eltaláltadd!!");
		System.out.println();
		System.out.println("Folytassuk? Igeen==1 ; Nem==2 Válassz: 1 2 ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Üdvözöllek a Kitalálósdi játékban");
		int valasz=1;
		
		
		while(valasz==1)
		{
		int szamok=gondol();
		int szam=0;
		szam=Beiras();
		Kitalalo(szamok,szam);
		
		valasz=Beiras();
		
		
		}
		System.out.println("Köszönöm a játékot. Viszlát");
		
		//Created by Albert Attila 2020;
	}
		
		
		
	}


