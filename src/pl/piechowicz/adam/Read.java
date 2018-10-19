package pl.piechowicz.adam;

import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
	
		DeltaDesigns dd = new DeltaDesigns();
		
		Scanner read = new Scanner(System.in);
		double a, b, c, delta, x0, x1, x2;
		
		System.out.println("Witaj w programie do liczenia delty!");
		System.out.println("Podaj wartoœæ wspó³czynnika A");
		a = read.nextDouble();
		System.out.println("Podaj wartoœæ wspó³czynnika B");
		b = read.nextDouble();
		System.out.println("Podaj wartoœæ wspó³czynnika C");
		c = read.nextDouble();
		
		delta = dd.countingDelta(a, b, c);
		x0 = dd.countingX0(a, b);
		x1 = dd.countingX1(a, b, c);
		x2 = dd.countingX2(a, b, c);
		
		System.out.println("Delta wynosi: " + delta);
		if (delta > 0) {
			System.out.println("x1 = " + x1 + " oraz x2 = " + x2);
		} else if (delta == 0) {
			System.out.println("x0 = " + x0);
		} else {
			System.out.println("Delta na minusie, brak rozwi¹zania");
		}
		read.close();
	}

}
