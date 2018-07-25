package warteschlangen;

public class Warteschlange {

	private int l�nge;
	private Person[] personen;
	
	public Warteschlange(int maxL�nge) {
		l�nge = 0;
		personen = new Person[maxL�nge];
	}
	
	public void hintenAnstellen(Person p) {
		if(l�nge >= personen.length)
			System.out.print("Warteschlange full \n");
		else {
			personen[l�nge] = p;
			l�nge++;
		}
	}
	//lol
	public void vorr�cken() {
		if(l�nge <= 0)
			System.out.print("Warteschlange leer \n");
		else {
			for(int i = 0; i < l�nge-1; i++) {
				personen[i] = personen[i+1];
			}
			personen[l�nge-1] = null;
			l�nge--;
		}
	}
	
	public void printLeute() {
		if(isSchlangeLeer())
			System.out.println("Schlange Leer");
		else {
			for(int i = 0; i < l�nge; i++) {
				System.out.println((i+1) + ": " + personen[i].getName() + " : " + personen[i].getAlter());
			}
			System.out.print("\n");
		}
		
	}
	
	public boolean isSchlangeLeer() {
		return l�nge == 0 ? true : false;
	}
}
