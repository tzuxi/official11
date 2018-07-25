/*
 * Listen - Warteschlangen
 */
package warteschlangen;

public class Pizzastand {

	public static void main(String[] args) {
		
		Warteschlange w = new Warteschlange(5);
		w.hintenAnstellen(new Person("Udolf", 4));
		w.hintenAnstellen(new Person("Rudolf", 15));
		w.hintenAnstellen(new Person("Schmudolf", 90));
		
		w.printLeute();
		
		w.vorr�cken();
		
		w.printLeute();
		
		w.hintenAnstellen(new Person("Moad�n", 8));
		w.hintenAnstellen(new Person("Siggi", 3));
		w.hintenAnstellen(new Person("Schneig�rd", 88));
		w.hintenAnstellen(new Person("Tzuxi", 50));
		
		w.printLeute();
		
		while(!w.isSchlangeLeer()) {
			w.vorr�cken();
		}
		
		w.printLeute();
	}

	
}
