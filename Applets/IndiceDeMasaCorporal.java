import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class IndiceDeMasaCorporal extends Applet implements ActionListener {
	Label titulo,peso,est,indiceMasa;
	TextField P,E;
	Button boton;
	
public IndiceDeMasaCorporal() {
	titulo = new Label("Calculo del indice de masa corporal");
	// lEstatura.setBounds(20, 20, 100, 20);
	titulo.setBounds(100, 100, 100, 100);
	peso = new Label("Peso:");
	est = new Label("Estatura:");
	P = new TextField();
	E = new TextField();
	indiceMasa = new Label("-------------");
	boton = new Button("Obtener");
	
	add(titulo);
	add(peso);
	add(P);
	add(est);
	add(E);
	add(boton);
	boton.addActionListener(this);
}

public void actionPerformed(ActionEvent ae) {
	double indice;
	double peso = Double.parseDouble(P.getText());
	double estatura = Double.parseDouble(E.getText());
	indice = peso / Math.pow(estatura, 2);
	indiceMasa.setText("El IMC es: "+indice);
	}
}