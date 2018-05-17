/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_05;

/**
 * Projecte: Examen_m05
 * @version 17/05/2018
 * @author nerea
 */
public class Pantry {
	private Jam jar1;
	private Jam jar2;
	private Jam jar3;
	private Jam selected;
        /**
         * Constructor
         * @param jar1 as jar1
         * @param jar2 as jar2
         * @param jar3 as jar3
         */
	Pantry(Jam jar1, Jam jar2, Jam jar3) {
		this.jar1 = jar1;
		this.jar2 = jar2;
		this.jar3 = jar3;
		selected = null;
	}
        /**
         * Ens mostra els atrubuts de cada Jam al Output
         */
	public void print() {
		System.out.print("1: ");
		jar1.print();
		System.out.print("2: ");
		jar2.print();
		System.out.print("3: ");
		jar3.print();
	}
        /**
         * Si esculls un num del (1 al 3), et diu qui Jam ha sigut escollit.
         * @param jarNumber 
         */
	public void select(int jarNumber) {
		if (jarNumber == 1) {
			selected = jar1;
		} else if (jarNumber == 2) {
			selected = jar2;
		} else {
			selected = jar3;
		}
	}
        /**
         * 
         * @param oz 
         */
	public void spread(int oz) {
		selected.spread(oz);
	}
}
