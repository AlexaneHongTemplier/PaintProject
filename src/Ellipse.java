import java.awt.Graphics;
import java.awt.Color;

public class Ellipse extends Figure {

    int length;
    int width;

    public Ellipse(Color c, fr.ensea.projet2A.MyPoint point) {
        super(c, point);
    }

    public void setBoundingBox (int widthBB, int lengthBB){
        int x1 = getPoint().getX();
        int y1 = getPoint().getY();
        int x2 = x1+length;
        int y2 = y1+width;

        this.length = lengthBB;
        this.width = widthBB;
    }

    public void draw (Graphics g){
        g.drawOval(getPoint().getX(), getPoint().getY(), length,width);
    }
}
