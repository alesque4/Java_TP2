package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		float a, b;
		Scanner questionUser = new Scanner(System.in);
		
		System.out.println("*****  Application Op�rateurs *****");
		
		try {
			//premier nombre
			System.out.println("Veuillez saisir le premier nombre...");
			a = questionUser.nextFloat();
			
			//deuxi�me nombre
			System.out.println("Veuillez saisir le second nombre...");
			b = questionUser.nextFloat();
			
		//Si on a pas de nombre en entr�e, fin du programme
		}catch(Exception e) {
			System.out.println("Mauvaise entr�e !");
			return;
		}		
		
		//Calculs et affichages
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		
		//On fait attention aux divisions par z�ro
		if(b == 0) {
			System.out.println("Division par z�ro !");
		}else {
			System.out.println(a+" / "+b+" = "+(a/b));
			System.out.println(a+" % "+b+" = "+(a%b));
		}
		
		
	}

}
