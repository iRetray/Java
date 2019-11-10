import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class InterfazConversion extends Applet implements ActionListener {
	Label titulo,cent,faren;
	TextField C,F;
	Button boton;
	
public InterfazConversion() {
	titulo = new Label("Conversor de Centigrados a Farenheit");
	cent = new Label("Centigrados");
	faren = new Label("Farenheit");
	C = new TextField();
	F = new TextField();
	boton = new Button("Convertir");
	
	add(titulo);
	add(cent);
	add(C);
	add(faren);
	add(F);
	add(boton);
	boton.addActionListener(this);
}

public void actionPerformed(ActionEvent ae) {
	double centigrados = Double.parseDouble(C.getText());
	double farenheit;
	farenheit = (centigrados*9/5)+32;
	F.setText(""+farenheit);
	}
}