package hilos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ventana extends JFrame{

	public Ventana() {
		setLayout(null);
		setBounds(0, 0, 400, 600);
		setVisible(true);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("adioooossssssssss");
				System.exit(0);
			}						
		});
	}
	
	public static void main(String[] args) {
		new Ventana();
		int num = 0;
		while(true) {
			//demora
			for (int i = 0; i < 100000000; i++);
			System.out.println(num++);
		}
	}
}
