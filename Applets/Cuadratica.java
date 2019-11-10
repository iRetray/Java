import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Cuadratica extends Applet implements ActionListener {
	Label titulo,a,b,c,aviso,resultado1,resultado2;
	TextField A,B,C;
	Button boton;
	
public Cuadratica() {
	titulo = new Label("Calculo de valores cuadraticos");
	a = new Label("Valor de A");
	b = new Label("Valor de B");
	c = new Label("Valor de C");
	resultado1 = new Label("------------------");
	resultado2 = new Label("------------------");
	aviso = new Label("------------------");
	A = new TextField();
	B = new TextField();
	C = new TextField();
	boton = new Button("Calcular");
	
	add(titulo);
	add(a);
	add(A);
	add(b);
	add(B);
	add(c);
	add(C);
	add(boton);
	add(resultado1);
	add(resultado2);
	add(aviso);
	
	boton.addActionListener(this);
}

public void actionPerformed(ActionEvent ae) {
	double valueP,valueN,valueA,valueB,valueC;
	int a;
	
	valueA = Double.parseDouble(A.getText());
	valueB = Double.parseDouble(B.getText());
	valueC = Double.parseDouble(C.getText());
	
	if (Math.pow(valueB, 2)-(4*valueA*valueC) < 0) {
		aviso.setText("Los valores ingresados generan resultados imaginarios");
	}
	else {
		valueP = ((-1)*valueB+Math.sqrt(Math.pow(valueB, 2)-(4*valueA*valueC)))/(2*valueA);
		valueN = ((-1)*valueB-Math.sqrt(Math.pow(valueB, 2)-(4*valueA*valueC)))/(2*valueA);
		resultado1.setText("Resultado 1: "+valueP);
		resultado2.setText("Resultado 2: "+valueN);
	}
	
	}
}