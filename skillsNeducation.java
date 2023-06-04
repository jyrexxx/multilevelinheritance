import java.awt.Font;

//G - Subclass
public class skillsNeducation extends course {

	String segreet = "Hello! Here you will know my Skills and Education";
	String s = "Skills";
	String e = "Education";
	String cv = "Capcut Video Editor - 6/10";
	String ps = "Problem Solving - 7/10";
	String ad = "Adaptability - 8/10";
	String el = "Philippians Academy - 2008 to 2014";
	String hs = "Ramon Pascual Institute - 2014 to 2020";
	String col = "National University - 2022 to Present";

	public skillsNeducation() {
		super();
	}

	@Override
	void onDefaultFont() {
		setFont(new Font("Tahoma", Font.BOLD, 20));
	}
}