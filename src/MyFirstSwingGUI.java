/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstSwingGUI {
	public static void main(String[] args) {
		//1. Create and initialize an object of the JFrame class
		JFrame C3P0 = new JFrame();
		//2. Set your JFrame object to be visible
		C3P0.setVisible(true);
		//3. Run your program. Do you see your window? It's probably very small.
		//yes i see the window
		//4. Set the default close operation to JFrame.EXIT_ON_CLOSE
		C3P0.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		//5. Create and initialize an object of the JPanel class
		JPanel R2D2 = new JPanel();
		//6. Create and initialize an object of the JLabel class
		JLabel BB8 = new JLabel();
		//7. Set the text of the JLabel to a lovely greeting.
		BB8.setText("Ur mama is fat");
		//8. Add the JPanel object to the JFrame 
		C3P0.add(R2D2);
		//9. Add the JLabel object to the JPanel
		R2D2.add(BB8);
		//10. Pack your JFrame.
		C3P0.pack();
		//11. Run your program again. Do you see your message.
		//yep
		//12. Use the loadImage method to set the icon of the JLabel object.  
		BB8.setIcon(loadImage());
		//13. Re-pack the JFrame object.
		C3P0.pack();
		//14. Run the program one more time. Do you see the image?
	}
	
	public static ImageIcon loadImage(){
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("java.png")));
		} catch (IOException e) {
			
			return null;
		}
	}
}
