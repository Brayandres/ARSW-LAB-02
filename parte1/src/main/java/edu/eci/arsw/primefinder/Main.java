package edu.eci.arsw.primefinder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		PrimeFinderThread pft0 = new PrimeFinderThread(0, 10000000);
		PrimeFinderThread pft1 = new PrimeFinderThread(10000000, 20000000);
		PrimeFinderThread pft2 = new PrimeFinderThread(20000000, 30000000);
		
		pft0.start();
		pft1.start();
		pft2.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pft0.pauseNow();
		pft1.pauseNow();
		pft2.pauseNow();
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press ENTER to continue.");
		String input = scanner.nextLine();
		while (input.length() != 0) {
			System.out.println("Press ENTER to continue.");
			input = scanner.nextLine();
		}
		
		pft0.resumeNow();
		pft1.resumeNow();
		pft2.resumeNow();
		
		try {
			pft0.join();
			pft1.join();
			pft2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}