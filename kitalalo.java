package kital�losdi;

import java.util.Random;
import java.util.Scanner;

public class kitalalo {
	
	
	static int gondol()
	{
		System.out.println();
		System.out.println();
		System.out.println("Pr�b�ld meg kital�lni arra a sz�mra amire gondolok!!!");
		
		Random kitalaltSzam=new Random();
		int gondoltszam=kitalaltSzam.nextInt(100)+1;
		
		System.out.println();
		System.out.println("Gondoltam. Tal�ld ki.");
		System.out.println();
		return gondoltszam;
	}
	
	static int Beiras() 
	{
		Scanner bemenet=new Scanner(System.in);
		System.out.println("Ird be a Saj�todat.");
		int szamod=Integer.parseInt(bemenet.nextLine());
		return szamod;
	}
	
	
	static void Kitalalo(int gondolat, int proba) 
	{
		while(!(gondolat==proba))
		{
			if(proba<gondolat)
				{
				System.out.println("Nagyobb sz�mra gondoltam");
				System.out.println("Ird be �rja");
				
				}
			
			if(proba>gondolat) 
				{
					System.out.println("Kisebb sz�mra gondoltam");
					System.out.println("Ird be �rja");
			    	 
				}
				proba=Beiras();
				
		}
		System.out.println("Eltal�ltadd!!");
		System.out.println();
		System.out.println("Folytassuk? Igeen==1 ; Nem==2 V�lassz: 1 2 ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�dv�z�llek a Kital�l�sdi j�t�kban");
		int valasz=1;
		
		
		while(valasz==1)
		{
		int szamok=gondol();
		int szam=0;
		szam=Beiras();
		Kitalalo(szamok,szam);
		
		valasz=Beiras();
		
		
		}
		System.out.println("K�sz�n�m a j�t�kot. Viszl�t");
		
		//Created by Albert Attila 2020;
	}
		
		
		
	}


