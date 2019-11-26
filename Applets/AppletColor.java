import java.applet.Applet;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

@SuppressWarnings("serial")
public class AppletColor extends Applet implements ItemListener{
	Choice selectorColor;
	Label titulo;
	
	public AppletColor() {
		titulo = new Label("Selector de Colores");
		selectorColor = new Choice();
		selectorColor.add("Blanco");
		selectorColor.add("Amarillo");
		selectorColor.add("Azul");
		selectorColor.add("Rojo");
		selectorColor.add("Verde");
		selectorColor.add("Morado");
		selectorColor.add("Naranja");
		selectorColor.select("Blanco");
		add(titulo);
		add(selectorColor);
		selectorColor.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie) {
		repaint();
		}
	
	public static void main(String[] args) {}
	

    public void start()
    {
    }
    public void paint(Graphics g)
    {
    	if(selectorColor.getSelectedItem()=="Amarillo") {
    		setBackground(Color.yellow);
    	}
    	else {
    		if(selectorColor.getSelectedItem()=="Azul") {
        		setBackground(Color.blue);
        	}
    		else {
    			if(selectorColor.getSelectedItem()=="Rojo") {
    	    		setBackground(Color.red);
    	    	}
    			else {
    				if(selectorColor.getSelectedItem()=="Verde") {
    		    		setBackground(Color.green);
    		    	}
    				else {
    					if(selectorColor.getSelectedItem()=="Morado") {
    			    		setBackground(Color.magenta);
    			    	}
    					else {
    						if(selectorColor.getSelectedItem()=="Naranja") {
    				    		setBackground(Color.orange);
    				    	}
    						else {
    							if(selectorColor.getSelectedItem()=="Blanco") {
        				    		setBackground(Color.white);
        				    	}
    						}
    					}
    				}
    			}
    		}
    	}
    }
}


