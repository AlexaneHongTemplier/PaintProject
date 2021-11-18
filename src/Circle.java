import java.awt.Graphics;
import java.awt.Color;

public class Circle extends Ellipse {

    int length;

    public Circle (Color c, fr.ensea.projet2A.MyPoint point) {
        super(c, point);
    }

    public void setBoundingBox (int width, int length){
        int l;
        if (width<length){
            l = width;
        }
        else {
            l = length;
        }

        int x1 = getPoint().getX();
        int y1 = getPoint().getY();
        int x2 = x1+l;
        int y2 = y1+l;
        this.length = l;
    }

    public void draw (Graphics g){
        g.drawOval(getPoint().getX(), getPoint().getY(), length,length);
    }
}
