package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a=0, b=0;
		Scanner questionUser = new Scanner(System.in);
		
		//Start
		System.out.println("*****  Application Opérateurs *****");
		
		//premier nombre
		System.out.println("Veuillez saisir le premier nombre...");
		a = questionUser.nextInt();
		
		//deuxième nombre
		System.out.println("Veuillez saisir le second nombre...");
		b = questionUser.nextInt();
		
		//Calculs et affichages
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
		System.out.println(a+" % "+b+" = "+(a%b));
		
	}

}
