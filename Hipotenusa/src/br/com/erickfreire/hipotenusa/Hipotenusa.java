package br.com.erickfreire.hipotenusa;

import java.util.Scanner;

/**
 * Programa em Java que calcula a hipotenusa de triângulo retangulo
 * @author Erick Freire
 * @version 1 - Criado em 29-04-2021 as 23:05
 */

public class Hipotenusa {
	public static void main(String[] args) {
		double cateto1;
		double cateto2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que calcula a hipotenusa de um triângulo Retângulo: ");
		
		System.out.print("Informe o valor do primeiro cateto: ");
		cateto1 = entrada.nextDouble();
		System.out.print("Informe o valor do segundo cateto: ");
		cateto2 = entrada.nextDouble();
		
		hipotenusa(cateto1, cateto2);
	}
	
	public static void hipotenusa(double c1, double c2) {
		
		double hip = Math.sqrt(c1) + Math.pow(c2, 2);
		
		System.out.printf("%n%nA hipotenusa é igual a: %f%n", hip);
		
	}

}
