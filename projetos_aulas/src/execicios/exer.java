package execicios;

import java.util.Scanner;

public class exer {

	public static void main(String[] args) {

		
		float mediaA = calcularMedia(7, 8, 9);
		System.out.println(mediaA);
		
		float mediaB = calcularMedia(4, 5, 6);
		System.out.println(mediaB);
		
		float mediaDaMedia = calcularMediaDaMedia(mediaA, mediaB);
		System.out.println(mediaDaMedia);
	}

	private static float calcularMedia(float numA, float numB, float numC) {
		return (numA + numB + numC)/3;
		
	}
	
	private static float calcularMediaDaMedia(float mediaA, float mediaB) {
		return (mediaA + mediaB)/2;
		
	}

}
