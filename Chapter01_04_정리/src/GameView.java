import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;
public class GameView extends JPanel {
	Image back, horse;
	int x = 0;
	int y = 450;
	public GameView()
	{
		back = Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
		horse = Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\h.gif");
	}
	public void paint(Graphics g)
	{
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		g.drawImage(horse, x, y, 150, 100, this);
	}

}
