package gen1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(()-> {
				Frame frame = new Frame("Generator v.1.0");
				frame.setSize(450, 250);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				frame.setResizable(false);
				frame.setLocationRelativeTo(null);
		});
	}
}
