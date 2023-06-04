import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	// Instantiation
	static strengthNweakness ins = new strengthNweakness();
	
	// Frame 1 Syntax | First Interface
	private static JFrame frame1 = new JFrame();
	private static JPanel firstInterface;

	// Frame 2 Syntax | Menu Interface
	private static JFrame frame2 = new JFrame();
	private static JPanel menuInterface;
	
	// Frame 3 Syntax | Information Interface
	private static JFrame frame3 = new JFrame();
	private static JPanel informationInterface;
	static personalInfo lblName = new personalInfo();
	static personalInfo lblAge = new personalInfo();
	static personalInfo lblSex = new personalInfo();
	static personalInfo lblBday = new personalInfo();
	static personalInfo lblLive = new personalInfo();
	static personalInfo lblWeight = new personalInfo();
	static personalInfo lblHeight = new personalInfo();
	
	// Frame 4 Syntax | Hobbies Interface
	private static JFrame frame4 = new JFrame();
	private static JPanel hobbiesInterface;
	static hobbies lblWatch = new hobbies();
	static hobbies lblBond = new hobbies();
	static hobbies lblPlay = new hobbies();
	static hobbies lblHgreet = new hobbies();
		
	// Frame 5 Syntax | Achievement Interface
	private static JFrame frame5 = new JFrame();
	private static JPanel achievementInterface;
	static achievements lblAchievegreet = new achievements();
	static achievements lblDiploma = new achievements();
	static achievements lblGradpic = new achievements();
	static achievements lblMedalnCert = new achievements();
	
	// Frame 6 Syntax | Course Interface
	private static JFrame frame6 = new JFrame();
	private static JPanel courseInterface;
	static course lblCgreet = new course();
	
	// Frame 7 Syntax | Skills and Education
	private static JFrame frame7 = new JFrame();
	private static JPanel sneInterface;
	static skillsNeducation lblSkills = new skillsNeducation();
	static skillsNeducation lblEducation = new skillsNeducation();
	static skillsNeducation lblSneGreet = new skillsNeducation();
	static skillsNeducation lblSkill1 = new skillsNeducation();
	static skillsNeducation lblSkill2 = new skillsNeducation();
	static skillsNeducation lblSkill3 = new skillsNeducation();
	static skillsNeducation lblElem = new skillsNeducation();
	static skillsNeducation lblJhsShs = new skillsNeducation();
	static skillsNeducation lblCollege = new skillsNeducation();
	
	// Frame 8 Syntax | Strength and Weakness
	private static JFrame frame8 = new JFrame();
	private static JPanel snwInterface;
	static strengthNweakness lblSnwgreet = new strengthNweakness();
	static strengthNweakness lblStrength = new strengthNweakness();
	static strengthNweakness lblWeakness = new strengthNweakness();

	// Menu buttons
	static menu lblPersonalinfo = new menu();
	static menu lblHobbies = new menu();
	static menu lblAchievement = new menu();
	static menu lblCoursee = new menu();
	static menu lblStrandWk = new menu();
	static menu lblSkillsnEdu = new menu();

	static menu lblCourse = new menu();
	static menu lblSection = new menu();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myInterface();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	static void myInterface() {
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setBounds(0, 0, 793, 606);
		frame1.setLocationRelativeTo(null);
		firstInterface = new JPanel();
		firstInterface.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame1.setContentPane(firstInterface);
		firstInterface.setLayout(null);

		JLabel lblStart = new JLabel("Start");
		lblStart.setHorizontalAlignment(SwingConstants.CENTER);
		lblStart.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblStart.setBounds(344, 435, 101, 36);
		firstInterface.add(lblStart);
		lblStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame1.dispose();
				menuInterface();
			}

			public void mouseEntered(MouseEvent e) {
				lblStart.setForeground(Color.CYAN);
			}

			public void mouseExited(MouseEvent e) {
				lblStart.setForeground(Color.black);
			}
		});
		
		//import image background
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("1st.png"));
		lblNewLabel.setBounds(0, 0, 777, 567);
		firstInterface.add(lblNewLabel);
	}
	
	static void menuInterface() {
		frame2.setVisible(true);
		frame2.setTitle("Portfolio");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setBounds(100, 100, 793, 612);
		frame2.setLocationRelativeTo(null);
		menuInterface = new JPanel();
		menuInterface.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame2.setContentPane(menuInterface);
		menuInterface.setLayout(null);

		//personal information button
		lblPersonalinfo.setText(ins.pers);
//		lblPersonalinfo.setForeground(new Color(255, 255, 255));
//		lblPersonalinfo.setHorizontalAlignment(SwingConstants.CENTER);
//		lblPersonalinfo.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblPersonalinfo.setBounds(317, 81, 146, 27);
		menuInterface.add(lblPersonalinfo);
		lblPersonalinfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame2.dispose();
				informationInterface();
			}

			public void mouseEntered(MouseEvent e) {
				lblPersonalinfo.setForeground(Color.CYAN);
			}

			public void mouseExited(MouseEvent e) {
				lblPersonalinfo.setForeground(Color.WHITE);
			}
		});

		// hobbies button
		lblHobbies.setText(ins.hob);
//		lblHobbies.setForeground(new Color(255, 255, 255));
//		lblHobbies.setHorizontalAlignment(SwingConstants.CENTER);
//		lblHobbies.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblHobbies.setBounds(317, 155, 146, 35);
		menuInterface.add(lblHobbies);
		lblHobbies.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame2.dispose();
				hobbiesInterface();
			}

			public void mouseEntered(MouseEvent e) {
				lblHobbies.setForeground(Color.CYAN);
			}

			public void mouseExited(MouseEvent e) {
				lblHobbies.setForeground(Color.white);
			}
		});

		// achievements button
		lblAchievement.setText(ins.ach);
//		lblAchievement.setForeground(new Color(255, 255, 255));
//		lblAchievement.setFont(new Font("Tahoma", Font.BOLD, 19));
//		lblAchievement.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievement.setBounds(321, 228, 142, 35);
		menuInterface.add(lblAchievement);
		lblAchievement.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame2.dispose();
				achievementInterface();
			}

			public void mouseEntered(MouseEvent e) {
				lblAchievement.setForeground(Color.CYAN);
			}

			public void mouseExited(MouseEvent e) {
				lblAchievement.setForeground(Color.white);
			}
		});

		// course button
		lblCoursee.setText(ins.cor);
//		lblCoursee.setForeground(new Color(255, 255, 255));
//		lblCoursee.setHorizontalAlignment(SwingConstants.CENTER);
//		lblCoursee.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblCoursee.setBounds(328, 309, 131, 35);
		menuInterface.add(lblCoursee);
		lblCoursee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame2.dispose();
				courseInterface();
			}

			public void mouseEntered(MouseEvent e) {
				lblCoursee.setForeground(Color.CYAN);
			}

			public void mouseExited(MouseEvent e) {
				lblCoursee.setForeground(Color.white);
			}
		});

		// strength and weakness button
		lblStrandWk.setText(ins.snw);
//		lblStrandWk.setHorizontalAlignment(SwingConstants.CENTER);
//		lblStrandWk.setForeground(new Color(255, 255, 255));
//		lblStrandWk.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblStrandWk.setBounds(287, 474, 219, 27);
		menuInterface.add(lblStrandWk);
		lblStrandWk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame2.dispose();
				snwInterface();
			}

			public void mouseEntered(MouseEvent e) {
				lblStrandWk.setForeground(Color.CYAN);
			}

			public void mouseExited(MouseEvent e) {
				lblStrandWk.setForeground(Color.white);
			}
		});

		//inherited name from the last subclass that inherited variable and method.
		JLabel lblName = new JLabel(ins.name);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(0, 195, 190, 27);
		menuInterface.add(lblName);

		// inherited course
		lblCourse.setText(ins.cour);
//		lblCourse.setHorizontalAlignment(SwingConstants.CENTER);
//		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 19));
//		lblCourse.setForeground(new Color(255, 255, 255));
		lblCourse.setBounds(34, 226, 123, 19);
		menuInterface.add(lblCourse);

		// inherited section
		lblSection.setText(ins.sec);
//		lblSection.setForeground(new Color(255, 255, 255));
//		lblSection.setHorizontalAlignment(SwingConstants.CENTER);
//		lblSection.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblSection.setBounds(55, 246, 78, 27);
		menuInterface.add(lblSection);

		// back button
		JLabel lblBack = new JLabel("Back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBack.setBounds(45, 525, 55, 19);
		menuInterface.add(lblBack);
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame2.dispose();
				myInterface();
			}

			public void mouseEntered(MouseEvent e) {
				lblBack.setForeground(Color.CYAN);
			}

			public void mouseExited(MouseEvent e) {
				lblBack.setForeground(Color.black);
			}

		});

		// skills and education button
		lblSkillsnEdu.setText(ins.se);
//		lblSkillsnEdu.setHorizontalAlignment(SwingConstants.CENTER);
//		lblSkillsnEdu.setForeground(new Color(255, 255, 255));
//		lblSkillsnEdu.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblSkillsnEdu.setBounds(308, 396, 178, 27);
		menuInterface.add(lblSkillsnEdu);
		lblSkillsnEdu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame2.dispose();
				sneInterface();
			}

			public void mouseEntered(MouseEvent e) {
				lblSkillsnEdu.setForeground(Color.CYAN);
			}

			public void mouseExited(MouseEvent e) {
				lblSkillsnEdu.setForeground(Color.white);
			}
		});

		// import image background
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(("2nd.png")));
		lblNewLabel.setBounds(0, 0, 777, 573);
		menuInterface.add(lblNewLabel);
	}
	
	static void informationInterface() {
		frame3.setVisible(true);
		frame3.setTitle("Portfolio");
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.setBounds(0, 0, 784, 612);
		frame3.setLocationRelativeTo(null);
		informationInterface = new JPanel();
		informationInterface.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame3.setContentPane(informationInterface);
		informationInterface.setLayout(null);

		//information interface greet that is inherited from Parent class to subclasses using the instantiated last subclass.
		JLabel lblGreet = new JLabel(ins.igreet);
		lblGreet.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGreet.setHorizontalAlignment(SwingConstants.CENTER);
		lblGreet.setForeground(new Color(255, 255, 255));
		lblGreet.setBounds(196, 26, 329, 52);
		informationInterface.add(lblGreet);

		//name that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblName.setText(ins.name);
//		lblName.setHorizontalAlignment(SwingConstants.CENTER);
//		lblName.setForeground(Color.WHITE);
//		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(468, 150, 270, 35);
		informationInterface.add(lblName);

		//age that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblAge.setText(ins.age);
//		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
//		lblAge.setForeground(Color.WHITE);
//		lblAge.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAge.setBounds(483, 184, 35, 35);
		informationInterface.add(lblAge);

		//sex that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblSex.setText(ins.sex);
//		lblSex.setHorizontalAlignment(SwingConstants.CENTER);
//		lblSex.setForeground(Color.WHITE);
//		lblSex.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSex.setBounds(483, 217, 54, 35);
		informationInterface.add(lblSex);

		//birthday that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblBday.setText(ins.bday);
//		lblBday.setHorizontalAlignment(SwingConstants.CENTER);
//		lblBday.setForeground(Color.WHITE);
//		lblBday.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBday.setBounds(490, 252, 192, 35);
		informationInterface.add(lblBday);

		//live in that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblLive.setText(ins.live);
//		lblLive.setHorizontalAlignment(SwingConstants.CENTER);
//		lblLive.setForeground(Color.WHITE);
//		lblLive.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLive.setBounds(479, 283, 163, 37);
		informationInterface.add(lblLive);

		//weight that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblWeight.setText(ins.wt);
//		lblWeight.setHorizontalAlignment(SwingConstants.CENTER);
//		lblWeight.setForeground(Color.WHITE);
//		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWeight.setBounds(478, 318, 74, 37);
		informationInterface.add(lblWeight);

		//height that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblHeight.setText(ins.ht);
//		lblHeight.setHorizontalAlignment(SwingConstants.CENTER);
//		lblHeight.setForeground(Color.WHITE);
//		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHeight.setBounds(478, 354, 74, 35);
		informationInterface.add(lblHeight);

		// back button
		JLabel lblBack = new JLabel("Back");
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame3.dispose();
				lblPersonalinfo.setForeground(Color.WHITE);
				menuInterface();
			}

			public void mouseEntered(MouseEvent e) {
				lblBack.setForeground(Color.CYAN);
			}

			public void mouseExited(MouseEvent e) {
				lblBack.setForeground(Color.black);
			}
		});
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBack.setBounds(346, 521, 87, 25);
		informationInterface.add(lblBack);

		//import image background
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("3rd.png"));
		lblNewLabel.setBounds(0, 0, 768, 573);
		informationInterface.add(lblNewLabel);
	}
	
	static void hobbiesInterface() {
		frame4.setVisible(true);
		frame4.setTitle("Hobbies");
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.setBounds(0, 0, 798, 612);
		frame4.setLocationRelativeTo(null);
		hobbiesInterface = new JPanel();
		hobbiesInterface.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame4.setContentPane(hobbiesInterface);
		hobbiesInterface.setLayout(null);

		//watching anime that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblWatch.setText(ins.watch);
		lblWatch.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWatch.setForeground(new Color(255, 255, 255));
		lblWatch.setHorizontalAlignment(SwingConstants.CENTER);
		lblWatch.setBounds(47, 196, 185, 22);
		hobbiesInterface.add(lblWatch);

		//bonding with dogs that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblBond.setText(ins.dog);
		lblBond.setHorizontalAlignment(SwingConstants.CENTER);
		lblBond.setForeground(Color.WHITE);
		lblBond.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBond.setBounds(301, 196, 185, 22);
		hobbiesInterface.add(lblBond);

		//playing games that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblPlay.setText(ins.play);
		lblPlay.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlay.setForeground(Color.WHITE);
		lblPlay.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPlay.setBounds(556, 196, 185, 22);
		hobbiesInterface.add(lblPlay);

		//hobbies interface greet that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblHgreet.setText(ins.hgreet);
		lblHgreet.setHorizontalAlignment(SwingConstants.CENTER);
		lblHgreet.setForeground(Color.WHITE);
		lblHgreet.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblHgreet.setBounds(187, 22, 368, 44);
		hobbiesInterface.add(lblHgreet);

		// back button
		JLabel lblBack = new JLabel("Back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBack.setBounds(349, 519, 84, 31);
		hobbiesInterface.add(lblBack);
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame4.dispose();
				lblHobbies.setForeground(Color.WHITE);
				menuInterface();
			}

			public void mouseEntered(MouseEvent e) {
				lblBack.setForeground(Color.CYAN);
			}

			public void mouseExited(MouseEvent e) {
				lblBack.setForeground(Color.black);
			}

		});

		//import image background
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("4th.png"));
		lblNewLabel.setBounds(0, 0, 782, 573);
		hobbiesInterface.add(lblNewLabel);
	}
	
	static void achievementInterface() {
		frame5.setVisible(true);
		frame5.setTitle("Achievement");
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.setBounds(0, 0, 798, 612);
		frame5.setLocationRelativeTo(null);
		achievementInterface = new JPanel();
		achievementInterface.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame5.setContentPane(achievementInterface);
		achievementInterface.setLayout(null);

		// back button
		JLabel lblBack = new JLabel("Back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBack.setBounds(355, 520, 70, 25);
		achievementInterface.add(lblBack);
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame5.dispose();
				lblAchievement.setForeground(Color.WHITE);
				menuInterface();
			}

			public void mouseEntered(MouseEvent e) {
				lblBack.setForeground(Color.CYAN);
			}

			public void mouseExited(MouseEvent e) {
				lblBack.setForeground(Color.black);
			}
		});
		
		//achievement interface greet that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblAchievegreet.setText(ins.agreet);
//		lblAchievegreet.setForeground(new Color(255, 255, 255));
//		lblAchievegreet.setFont(new Font("Tahoma", Font.BOLD, 20));
//		lblAchievegreet.setHorizontalAlignment(SwingConstants.CENTER);
		lblAchievegreet.setBounds(356, 36, 405, 35);
		achievementInterface.add(lblAchievegreet);

		//diploma that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblDiploma.setText(ins.dip);
//		lblDiploma.setForeground(new Color(255, 255, 255));
//		lblDiploma.setHorizontalAlignment(SwingConstants.CENTER);
//		lblDiploma.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDiploma.setBounds(72, 171, 128, 25);
		achievementInterface.add(lblDiploma);

		//graduation photo that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblGradpic.setText(ins.gp);
//		lblGradpic.setForeground(new Color(255, 255, 255));
//		lblGradpic.setHorizontalAlignment(SwingConstants.CENTER);
//		lblGradpic.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGradpic.setBounds(283, 171, 212, 25);
		achievementInterface.add(lblGradpic);

		//medal and certificate that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblMedalnCert.setText(ins.mc);
//		lblMedalnCert.setForeground(new Color(255, 255, 255));
//		lblMedalnCert.setHorizontalAlignment(SwingConstants.CENTER);
//		lblMedalnCert.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMedalnCert.setBounds(530, 171, 242, 25);
		achievementInterface.add(lblMedalnCert);

		//import image background
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("5th.png"));
		lblNewLabel.setBounds(0, 0, 782, 571);
		achievementInterface.add(lblNewLabel);
	}
	
	static void courseInterface() {
		frame6.setVisible(true);
		frame6.setTitle("Course");
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame6.setBounds(0, 0, 798, 612);
		frame6.setLocationRelativeTo(null);
		courseInterface = new JPanel();
		courseInterface.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame6.setContentPane(courseInterface);
		courseInterface.setLayout(null);

		// back button
		JLabel lblBack = new JLabel("Back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBack.setBounds(353, 518, 78, 32);
		courseInterface.add(lblBack);
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame6.dispose();
				lblCoursee.setForeground(Color.WHITE);
				menuInterface();
//				menuInterface menu = new menuInterface();
//				menu.setVisible(true);
//				menu.setLocationRelativeTo(null);
			}

			public void mouseEntered(MouseEvent e) {
				lblBack.setForeground(Color.CYAN);
			}

			public void mouseExited(MouseEvent e) {
				lblBack.setForeground(Color.black);
			}
		});

		//course interface greet that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblCgreet.setText(ins.cgreet);
//		lblCgreet.setHorizontalAlignment(SwingConstants.CENTER);
//		lblCgreet.setForeground(new Color(255, 255, 255));
//		lblCgreet.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCgreet.setBounds(219, 38, 417, 41);
		courseInterface.add(lblCgreet);

		//import image background
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("6th.png"));
		lblNewLabel.setBounds(0, 0, 782, 573);
		courseInterface.add(lblNewLabel);
	}
	
	static void sneInterface() {
		frame7.setVisible(true);
		frame7.setTitle("Skills and Education");
		frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame7.setBounds(0, 0, 798, 612);
		frame7.setLocationRelativeTo(null);
		sneInterface = new JPanel();
		sneInterface.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame7.setContentPane(sneInterface);
		sneInterface.setLayout(null);

		//skills that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblSkills.setText(ins.s);
//		lblSkills.setHorizontalAlignment(SwingConstants.CENTER);
//		lblSkills.setForeground(new Color(255, 255, 255));
//		lblSkills.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSkills.setBounds(140, 171, 109, 28);
		sneInterface.add(lblSkills);

		//education that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblEducation.setText(ins.e);
//		lblEducation.setHorizontalAlignment(SwingConstants.CENTER);
//		lblEducation.setForeground(Color.WHITE);
//		lblEducation.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEducation.setBounds(535, 171, 109, 28);
		sneInterface.add(lblEducation);

		//skills and education greet that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblSneGreet.setText(ins.segreet);
//		lblSneGreet.setHorizontalAlignment(SwingConstants.CENTER);
//		lblSneGreet.setForeground(Color.WHITE);
		lblSneGreet.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSneGreet.setBounds(189, 36, 447, 28);
		sneInterface.add(lblSneGreet);

		// back button
		JLabel lblBack = new JLabel("Back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBack.setBounds(351, 516, 83, 36);
		sneInterface.add(lblBack);
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame7.dispose();
				lblSkillsnEdu.setForeground(Color.WHITE);
				menuInterface();
			}

			public void mouseEntered(MouseEvent e) {
				lblBack.setForeground(Color.CYAN);
			}

			public void mouseExited(MouseEvent e) {
				lblBack.setForeground(Color.black);
			}
		});

		//cap cut skill that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblSkill1.setText(ins.cv);
//		lblSkill1.setForeground(Color.WHITE);
		lblSkill1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSkill1.setBounds(118, 218, 212, 28);
		sneInterface.add(lblSkill1);

		//problem solving that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblSkill2.setText(ins.ps);
//		lblSkill2.setForeground(Color.WHITE);
		lblSkill2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSkill2.setBounds(110, 286, 202, 28);
		sneInterface.add(lblSkill2);

		//adaptability that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblSkill3.setText(ins.ad);
//		lblSkill3.setForeground(Color.WHITE);
		lblSkill3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSkill3.setBounds(108, 360, 175, 28);
		sneInterface.add(lblSkill3);

		//primary education that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblElem.setText(ins.el);
//		lblElem.setForeground(Color.WHITE);
		lblElem.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblElem.setBounds(429, 234, 287, 28);
		sneInterface.add(lblElem);

		//secondary education that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblJhsShs.setText(ins.hs);
//		lblJhsShs.setForeground(Color.WHITE);
		lblJhsShs.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblJhsShs.setBounds(420, 304, 339, 28);
		sneInterface.add(lblJhsShs);

		//tertiary education that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblCollege.setText(ins.col);
//		lblCollege.setForeground(Color.WHITE);
		lblCollege.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCollege.setBounds(438, 376, 287, 28);
		sneInterface.add(lblCollege);

		//import image background
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("7th.png"));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 0, 783, 574);
		sneInterface.add(lblNewLabel);
	}
	
	static void snwInterface() {
		frame8.setVisible(true);
		frame8.setTitle("Skills and Education");
		frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame8.setBounds(0, 0, 800, 612);
		frame8.setLocationRelativeTo(null);
		snwInterface = new JPanel();
		snwInterface.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame8.setContentPane(snwInterface);
		snwInterface.setLayout(null);

		//strength and weakness greet that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblSnwgreet.setText(ins.sgreet);
//		lblSnwgreet.setHorizontalAlignment(SwingConstants.CENTER);
		lblSnwgreet.setFont(new Font("Tahoma", Font.BOLD, 15));
//		lblSnwgreet.setForeground(new Color(255, 255, 255));
		lblSnwgreet.setBounds(202, 36, 431, 39);
		snwInterface.add(lblSnwgreet);

		// back button
		JLabel lblBack = new JLabel("Back");
		lblBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setBounds(359, 521, 64, 25);
		snwInterface.add(lblBack);
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame8.dispose();
				lblStrandWk.setForeground(Color.WHITE);
				menuInterface();
			}

			public void mouseEntered(MouseEvent e) {
				lblBack.setForeground(Color.CYAN);
			}

			public void mouseExited(MouseEvent e) {
				lblBack.setForeground(Color.black);
			}
		});

		//strength that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblStrength.setText(ins.ss);
//		lblStrength.setForeground(new Color(255, 255, 255));
//		lblStrength.setHorizontalAlignment(SwingConstants.CENTER);
//		lblStrength.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStrength.setBounds(122, 200, 138, 30);
		snwInterface.add(lblStrength);

		//weakness that is inherited from Parent class to subclasses using the instantiated last subclass.
		lblWeakness.setText(ins.ww);
//		lblWeakness.setHorizontalAlignment(SwingConstants.CENTER);
//		lblWeakness.setForeground(Color.WHITE);
//		lblWeakness.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWeakness.setBounds(513, 200, 138, 30);
		snwInterface.add(lblWeakness);

		//import image background
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("8th.png"));
		lblNewLabel.setBounds(0, 0, 784, 573);
		snwInterface.add(lblNewLabel);
	}
}