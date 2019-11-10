import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("serial")

public class ConversionCentigrados extends Applet {

	public void paint(Graphics g) {
		int centigrados;
		int faren;
		centigrados = 30;
		faren = (centigrados*9/5)+32;
		g.drawString("Conversion de Centigrados a Farenheit", 100, 50);
		g.drawString(""+centigrados+" grados centigrados son "+faren+" grados farenheit", 100, 100);
	}

}
