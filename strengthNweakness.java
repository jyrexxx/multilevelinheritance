import java.awt.Font;

//H - Subclass this is the last subclass that inherited from A - Parent class through subclasses.
public class strengthNweakness extends skillsNeducation {

	String sgreet = "Hello! Here you will know my strength and weakness";
	String ss = "Strength";
	String ww = "Weakness";

	public strengthNweakness() {
		super();
	}

	@Override
	void onDefaultFont() {
		setFont(new Font("Tahoma", Font.BOLD, 20));
	}
}