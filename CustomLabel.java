import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

//A - Parent class
public class CustomLabel extends JLabel {

	public CustomLabel() {
		// Common initialization code
		setHorizontalAlignment(SwingConstants.CENTER);
		onDefaultColor();
		onDefaultFont();
		onDefaultCursor();
	}

	void onDefaultColor() {
		setForeground(new Color(255, 255, 255));
	}

	void onDefaultFont() {
		setFont(new Font("Tahoma", Font.BOLD, 18));
	}

	void onDefaultCursor() {
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
}