import java.awt.Graphics;
import java.awt.Color;

public class Rectangle extends Figure {

    int length;
    int width;

    public Rectangle(Color c, fr.ensea.projet2A.MyPoint point) {
        super(c, point);
    }

    public void setBoundingBox (int widthBB, int lengthBB){
        int x1 = getPoint().getX();
        int y1 = getPoint().getY();
        int x2 = x1+lengthBB;
        int y2 = y1+widthBB;

        this.length = lengthBB;
        this.width = widthBB;
    }



    public void draw (Graphics g){
        g.drawRect(getPoint().getX(), getPoint().getY(), length,width);
    }

}
