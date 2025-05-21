package Examen_21M;

import java.util.Scanner;

public class ExamenPrimo {
	
	public static void main(String[] args) {
		
		Scanner ent= new Scanner(System.in);
		int num=0;
		boolean primo=true;
		
		System.out.println("Bueno dias Ceinmark, soy Víctor Diego.");
		try {
			System.out.println("Introduce un número para averiguar si es primo o no:");
			num=Integer.parseInt(ent.nextLine());
		}catch(NumberFormatException ex) {
			System.out.println("Valor no esperado");
		}
		
		for(int i=2;i<num;i++){
            if(num%i==0){
                primo=false;
            }
        }
        if(primo==true){
            System.out.println (num+" es primo");
        }
        else{
            System.out.println (num+" no es primo");
        }
		
		
	}//fin main

}//fin class
