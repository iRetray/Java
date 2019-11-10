import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Layout extends Applet implements ActionListener {
	TextField tfEstatura,tfPeso;
	Label lEstatura,lPeso;
	Button boton;
	double resultado;

	public Layout() {
		this.setLayout((null));
		//setBounds(posicionx, posiciony, ancho, alto)
		lEstatura= new Label("Estatura (mt): ");
		lEstatura.setBounds(20, 20, 100, 20);
		lPeso= new Label("Peso (kg): ");
		lPeso.setBounds(20, 40, 100, 20);
		tfEstatura = new TextField();
		tfEstatura.setBounds(120, 20, 100, 20);
		tfPeso = new TextField();
		tfPeso.setBounds(120, 40, 100, 20);
		boton = new Button("Calcula");
		boton.setBounds(120,80,100,20);
		add(lEstatura);
		add(lPeso);
		add(tfEstatura);
		add(tfEstatura);
		add(tfPeso);
		add(boton);
		boton. addActionListener(this);
	}

	public void paint(Graphics g) {
		this.setSize(300, 300);
		g.drawString("Su Indice de Masa corporal es = "+resultado, 20, 120);
	}
	public void actionPerformed(ActionEvent ae) {
		double indice;
		double peso = Double.parseDouble(tfPeso.getText());
		double estatura = Double.parseDouble(tfEstatura.getText());
		indice = peso / Math.pow(estatura, 2);
		resultado = indice;
		repaint();
	}
}
