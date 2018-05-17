package examen_05;

/**
 * @version 17/05/2018
 * @author nerea
 */
public class Jam {
	private String contents;
	private String date;
	private int capacity;
	private static int numTotalJars, noJam = 0;
        /**
         * Constructor
         * Cada vegada que creo un Jam augmenta numTotalJars un valor.
         * @param contents
         * @param date
         * @param size 
         */
	Jam(String contents, String date, int size) {
		this.contents = contents;
		this.date = date;
		capacity = size;
		numTotalJars++;
	}
        /**
         * Retorna la capatitat buida
         * @return 
         */
	public boolean empty() {
		return (capacity == 0);
	}
        /**
         * Mostra per pantalla el numero total de Jars i el numero dels que s'han quedat sense mermelada.
         */
	public void print() {
		System.out.println(contents + " " + date + " " + capacity + " fl. oz.");
		System.out.println("El numero total de Jars creats des de l'inici dels temps son: " + Jam.getNumTotalJars());
		System.out.println("El numero de Jars que s'han quedat sense melmelada des de l'inici dels temps: " + Jam.getNoJam());
	}
        /**
         * 
         * @param fluidOz 
         */
	public void spread(int fluidOz) {
		if (!empty()) {
			if (fluidOz < capacity) {
				System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents);
				capacity = capacity - fluidOz;
			} else {
				System.out.println("Spreading " + capacity + " fluid ounces of " + contents);
				capacity = 0;
				noJam++;			}
		} else {
			System.out.println("No jam in the Jar!");
		}
	}
        /**
         * Retorna el numero total de Jars
         * @return 
         */
	public static int getNumTotalJars() {
		return numTotalJars;
	}
        //Retorna el numero de Jams que no tenen mermelada.
	public static int getNoJam() {
		return noJam;
	}
}
