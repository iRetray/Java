import java.applet.Applet;
import java.awt.*;

public class AppletEjemplo extends Applet {
	public void paint(Graphics g) {
		g.drawString("Dibujo de un marco para mi nombre", 10, 40);
		
		g.drawLine(10,60, 160,60);
		g.drawLine(10,110, 160,110);
		
		g.drawLine(10,60, 10,110);
		g.drawLine(160,60, 160,110);
		
		g.drawString("Julian Camilo", 45, 90);
		
		}
}
