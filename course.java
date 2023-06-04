import java.awt.Font;

//F - Subclass
public class course extends achievements {

	String cgreet = "Hello! Here you will know why I chose this course";

	public course() {
		super();
	}

	@Override
	void onDefaultFont() {
		setFont(new Font("Tahoma", Font.BOLD, 16));
	}
}