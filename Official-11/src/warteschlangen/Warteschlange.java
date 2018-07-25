package warteschlangen;

public class Warteschlange {

	private int länge;
	private Person[] personen;
	
	public Warteschlange(int maxLänge) {
		länge = 0;
		personen = new Person[maxLänge];
	}
	
	public void hintenAnstellen(Person p) {
		if(länge >= personen.length)
			System.out.print("Warteschlange full \n");
		else {
			personen[länge] = p;
			länge++;
		}
	}
	//lol
	public void vorrücken() {
		if(länge <= 0)
			System.out.print("Warteschlange leer \n");
		else {
			for(int i = 0; i < länge-1; i++) {
				personen[i] = personen[i+1];
			}
			personen[länge-1] = null;
			länge--;
		}
	}
	
	public void printLeute() {
		if(isSchlangeLeer())
			System.out.println("Schlange Leer");
		else {
			for(int i = 0; i < länge; i++) {
				System.out.println((i+1) + ": " + personen[i].getName() + " : " + personen[i].getAlter());
			}
			System.out.print("\n");
		}
		
	}
	
	public boolean isSchlangeLeer() {
		return länge == 0 ? true : false;
	}
}
