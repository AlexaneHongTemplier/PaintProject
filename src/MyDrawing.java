import javax.swing.*;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;


public class MyDrawing extends JPanel implements MouseListener {
   Color c;
   Figure figure;
   ArrayList<Figure> liste = new ArrayList<Figure>();
   double x;
   double y;

   Rectangle rect = new Rectangle(c,new fr.ensea.projet2A.MyPoint());
   Ellipse ellipse = new Ellipse(c,new fr.ensea.projet2A.MyPoint());
   Square square = new Square(c, new fr.ensea.projet2A.MyPoint());
   Circle circle = new Circle(c, new fr.ensea.projet2A.MyPoint());

    public MyDrawing() {
        this.setBackground(Color.white);
        c = Color.black;
        figure = rect;
        addMouseListener(this);
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public Color getC() {
        return c;
    }

    @Override
    public int getX() {
        return (int) x;
    }

    @Override
    public int getY() {
        return (int) y;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        double x = e.getXOnScreen();
        double y = e.getYOnScreen();
        this.x = x;
        this.y = y;

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }


    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}
