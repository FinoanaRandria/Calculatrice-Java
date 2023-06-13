package mg.Calculatrice.finoana;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Frame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
    public JTextField z1;
    public JButton b1 ,b2, b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15 ,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
	public Frame(String title) {
		Container c =getContentPane();
		
		c.setLayout(null);
		 this.z1 = new JTextField();
		 this.b1 = new JButton("Cos");
		 this.b2 = new JButton("Tan");
		 this.b3 = new JButton("Sin");
		 this.b4 = new JButton("Exp()");
		 this.b5 = new JButton("1");
		 this.b6 = new JButton("2");
		 this.b7 = new JButton("3");
		 this.b8 = new JButton("Log()");
		 this.b9 = new JButton("4");
		 this.b10 = new JButton("5");
		 this.b11 = new JButton("6");
		 this.b12 = new JButton("/");
		 this.b13 = new JButton("7");
		 this.b14 = new JButton("8");
		 this.b15 = new JButton("9");
		 this.b16 = new JButton("x");
		 this.b17 = new JButton("0");
		 this.b18 = new JButton(",");
		 this.b19 = new JButton("+");
		 this.b20 = new JButton("-");
		 this.b21 = new JButton("C");
		 this.b22 = new JButton("<-");
		 this.b23 = new JButton("x10^");
		 this.b24 = new JButton("√x");
		 this.b25 = new JButton("=");
		 
		 this.z1.setBounds(10, 20, 480, 100);
		 this.b1.setBounds(10, 220, 80, 50);
		 this.b2.setBounds(100, 220, 80, 50);
		 this.b3.setBounds(190, 220, 80, 50);
		 this.b4.setBounds(280, 220, 80, 50);
		 this.b5.setBounds(10, 280, 80, 50);
		 this.b6.setBounds(100, 280, 80, 50);
		 this.b7.setBounds(190, 280, 80, 50);
		 this.b8.setBounds(280, 280, 80, 50);
		 this.b9.setBounds(10, 340, 80, 50);
		 this.b10.setBounds(100, 340, 80, 50);
		 this.b11.setBounds(190, 340, 80, 50);
		 this.b12.setBounds(280, 340, 80, 50);
		 this.b13.setBounds(10, 400, 80, 50);
		 this.b14.setBounds(100, 400, 80, 50);
		 this.b15.setBounds(190, 400, 80, 50);
		 this.b16.setBounds(280, 400, 80, 50);
		 this.b17.setBounds(10, 460, 80, 50);
		 this.b18.setBounds(100, 460, 80, 50);
		 this.b19.setBounds(190, 460, 80, 50);
		 this.b20.setBounds(280, 460, 80, 50);
		 this.b21.setBounds(380, 220, 80, 50);
		 this.b22.setBounds(380, 280, 80, 50);
		 this.b23.setBounds(380, 340, 80, 50);
		 this.b24.setBounds(380, 400, 80, 50);
		 this.b25.setBounds(380, 460, 80, 50);
		 
		 setTitle(title);
		 setSize(500,700);
		 setLocationRelativeTo(null);
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setResizable(false);
		 
		 c.add(z1);c.add(b1);c.add(b1);c.add(b2);c.add(b3);c.add(b4);c.add(b5);c.add(b6);
		 c.add(b7);c.add(b8);c.add(b9);c.add(b10);c.add(b11);c.add(b12);c.add(b13);c.add(b14);c.add(b15);
		 c.add(b16);c.add(b17);c.add(b18);c.add(b19);c.add(b20);c.add(b21);c.add(b22);c.add(b23);c.add(b24);c.add(b25);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
