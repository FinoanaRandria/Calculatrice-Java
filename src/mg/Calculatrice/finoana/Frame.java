package mg.Calculatrice.finoana;
import java.awt.Panel;

import javax.swing.JFrame;
public class Frame extends JFrame{

	private static final long serialVersionUID = 1L;
       
	public Frame(String title) {
		 setTitle(title);
		 setSize(500,700);
		 setLocationRelativeTo(null);
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(false);
		 add(new Panel());
		
	}
}
