package zad2List3;

import java.util.Scanner;

public class Zad2 {
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        System.out.println("Podaj 1 wyraz: ");
	        String word1 = sc.nextLine();
	        
	        System.out.println("Podaj 2 wyraz: ");
	        String word2 = sc.nextLine();
	
	
	int l1 = word1.length();
    int l2 = word2.length();
	if (l1 >= l2) 
		System.out.println("B³¹d!");
	
	for(int c = 0; c <= l2 - l1; c++) {
		int w;
		for (w = 0; w < l1; w++)
            if (word2.charAt(c + w) != word1.charAt(w))
                break;

        if (w == l1) {
        	System.out.println("Tak");
            return;
        }
    }
	System.out.println("Nie");
	
}	
}

