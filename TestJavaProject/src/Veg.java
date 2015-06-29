import java.util.HashMap;
import java.util.Map;




public class Veg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String vegnametemp = "कांदे (Onion1)";
		vegnametemp = vegnametemp.replace("(", "#");
		vegnametemp = vegnametemp.split("#")[1];
		vegnametemp = vegnametemp.replace(")", "");
		System.out.println(vegnametemp);
	}
}
