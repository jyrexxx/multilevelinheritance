import java.awt.Cursor;

//C - Subclass
public class personalInfo extends menu {

	String igreet = "Hello! Here you will know my personal information";
	String age = "21";
	String sex = "Male";
	String bday = "December 3 2001";
	String live = "Parañaque City";
	String wt = "54 kg";
	String ht = "5'5 ft";

	public personalInfo() {
		super();
	}

	@Override
	void onDefaultCursor() {
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	}
}