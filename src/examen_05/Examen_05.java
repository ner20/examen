/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_05;

import Jam;
import Pantry;
import java.util.Scanner;

/**
 *
 * @author nerea
 */
public class Examen_05 {

    /**
     * Es la classe PantryTester2
     * Em donava error i no podia fer el commit si no ho ficava aqui
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, amount;
		Jam goose = new Jam("Gooseberry", "7/4/2015", 12);
		Jam apple = new Jam("Crab Apple", "9/30/2015", 8);
		Jam rhub = new Jam("Rhubarb", "10/31/2014", 3);
		Jam rhub2 = new Jam("Rhubarb", "10/31/2014", 3);
		Pantry hubbard = new Pantry(goose, apple, rhub);

		System.out.println("Welcome to Mother Hubbard's Party!");
		System.out.println("The jams are: ");
		hubbard.print();
		do {
			System.out.println("Enter your selection (1,2,or 3):");
			num = scan.nextInt();
			if (num == 1 || num == 2 || num == 3) {
				hubbard.select(num);
				System.out.println("Enter amount to spread:");
				amount = scan.nextInt();
				hubbard.spread(amount);
				System.out.println("The jams are: ");
				hubbard.print();
			} else {
				System.out.println("Selection out-of-range, please enter again or '-1' for exit!");
			}
		} while (num != -1);
		System.out.println("Good-by!");
		scan.close();
	}