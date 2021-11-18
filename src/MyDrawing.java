import fr.ensea.projet2A.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;


public class MyDrawing extends JPanel implements MouseMotionListener {
   Color c;
   Figure figure;
   String figureName;
   ArrayList<Figure> liste = new ArrayList<Figure>();

   Rectangle rect = new Rectangle(c,new Point());
   Ellipse ellipse = new Ellipse(c,new Point());
   Square square = new Square(c, new Point());
   Circle circle = new Circle(c, new Point());

    public MyDrawing() {
        this.setBackground(Color.white);
        c = Color.black;
        figure = rect;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {

    }



}
