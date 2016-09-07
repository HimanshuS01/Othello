

package OthelloGame;
import javax.swing.JApplet;

import java.applet.*;
import java.awt.*;

import javax.swing.*;

import OthelloGame.OthelloTwoPlayerGame;

//Applet is a special type of program that is embedded in the webpage to generate the dynamic content. 
//It runs inside the browser and works at client side.
//As we prefer Swing to AWT. Now we can use JApplet that can have all the controls of swing. 
//The JApplet class extends the Applet class.

public class OthelloSwingApplet extends JApplet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void init() {

		getContentPane().setLayout(new GridLayout(1, 1));
		JButton button = new JButton("Start Othello");

		getContentPane().add(button);

		button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonPushed(evt);  }  } );

	}


	private void buttonPushed(java.awt.event.ActionEvent evt) {
		OthelloTwoPlayerGame f = new OthelloTwoPlayerGame();
		f.setVisible(true);
	}

}


