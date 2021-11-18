import java.awt.Graphics;
import java.awt.Color;


public abstract class Figure {
    public abstract void setBoundingBox (int width, int length);
    public abstract void draw (Graphics g);
    private Color c;
    private fr.ensea.projet2A.MyPoint point;

    public Figure (Color c, fr.ensea.projet2A.MyPoint point){
        this.c = c;
        this.point = point;
    }

    public Color getColor(){return c;}
    public fr.ensea.projet2A.MyPoint getPoint(){return point;}

    @Override
    public String toString(){return "Color :"+getColor()+"  Origin :"+getPoint();}

}
