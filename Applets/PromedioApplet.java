import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class PromedioApplet extends Applet implements ActionListener {
	TextField n1,n2,n3,n4;
	Label tittle,num1,num2,num3,num4,result;
	Button buton;
	double promedio;
	
	TextField tfEstatura,tfPeso;
	Label lEstatura,lPeso;
	Button boton;
	double resultado;

	public PromedioApplet() {
		this.setLayout((null));
		//setBounds(posicionx, posiciony, ancho, alto)
		
		tittle = new Label("Calculadora de promedios");
		tittle.setBounds(50, 20, 200, 20);
		
		num1 = new Label("Numero 1:");
		num1.setBounds(20, 50, 100, 20);
		n1 = new TextField();
		n1.setBounds(120, 50, 100, 20);
		
		num2 = new Label("Numero 2:");
		num2.setBounds(20, 70, 100, 20);
		n2 = new TextField();
		n2.setBounds(120, 70, 100, 20);
		
		num3 = new Label("Numero 3:");
		num3.setBounds(20, 90, 100, 20);
		n3 = new TextField();
		n3.setBounds(120, 90, 100, 20);
		
		num4 = new Label("Numero 4:");
		num4.setBounds(20, 110, 100, 20);
		n4 = new TextField();
		n4.setBounds(120, 110, 100, 20);
		
		boton = new Button("Calcular Promedio");
		boton.setBounds(20, 150, 200, 30);
		
		add(tittle);
		add(num1);
		add(num2);
		add(num3);
		add(num4);
		add(n1);
		add(n2);
		add(n3);
		add(n4);
		add(boton);

		boton. addActionListener(this);
	}

	public void paint(Graphics g) {
		this.setSize(300, 300);
		g.drawString("El promedio es: "+resultado, 50, 220);
	}
	public void actionPerformed(ActionEvent ae) {
		resultado = (Double.parseDouble(n1.getText())+Double.parseDouble(n2.getText())+Double.parseDouble(n3.getText())+Double.parseDouble(n4.getText()))/4;
		repaint();
	}
}
