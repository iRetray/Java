import java.awt.*;
import java.awt.event.*;
public class InterfazGrafica extends Frame implements WindowListener {
public static void main(String[] args) {
InterfazGrafica x = new InterfazGrafica();
x.setSize(400,500);
x.setTitle("Aplicaci�n Gr�fica Hola");
x.setVisible(true);
}
public InterfazGrafica() {
addWindowListener(this);
}
public void paint(Graphics g) {
g.drawString("Hola", 100, 100);
}
public void windowClosing(WindowEvent e) {
System.exit(0);
}
public void windowOpened(WindowEvent e){}
public void windowClosed(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}
}
