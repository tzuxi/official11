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
		
		w.vorrücken();
		
		w.printLeute();
		
		w.hintenAnstellen(new Person("Moadün", 8));
		w.hintenAnstellen(new Person("Siggi", 3));
		w.hintenAnstellen(new Person("Schneigörd", 88));
		w.hintenAnstellen(new Person("Tzuxi", 50));
		
		w.printLeute();
		
		while(!w.isSchlangeLeer()) {
			w.vorrücken();
		}
		
		w.printLeute();
	}

	
}
