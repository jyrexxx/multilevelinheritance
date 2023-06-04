import java.awt.Font;

//B - Subclass
public class menu extends CustomLabel {

	// Menu
	String pers = "Personal Info";
	String hob = "Hobbies";
	String ach = "Achievement";
	String cor = "Course";
	String snw = "Strength & Weakness";
	String name = "Abastillas, Jyre Irvine S.";
	String cour = "BSIT-MWA";
	String sec = "INF 223";
	String se = "Skills & Education";

	public menu() {
		super();
	}

	@Override
	void onDefaultFont() {
		setFont(new Font("Tahoma", Font.BOLD, 19));
	}
}