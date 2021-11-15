import fr.ensea.projet2A.Point;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class MyDrawing extends JPanel {
   Color c;
   Figure figure;
   ArrayList<Figure> liste = new ArrayList<Figure>();

   Rectangle rect = new Rectangle(c,new Point());
   Ellipse ellipse = new Ellipse(c,new Point());
   Square square = new Square(c, new Point());
   Circle circle = new Circle(c, new Point());

    public MyDrawing() {
        this.setBackground(Color.white);
        liste.add(rect); liste.add(ellipse); liste.add(square); liste.add(circle);
        c = Color.black;
        figure = rect;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }
}
