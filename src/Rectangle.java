import fr.ensea.projet2A.Point;
import java.awt.Graphics;
import java.awt.Color;

public class Rectangle extends Figure {


    public Rectangle(Color c, Point point) {
        super(c, point);
    }

    public void setBoundingBox (int widthBB, int lengthBB){
        int x1 = getPoint().getX();
        int y1 = getPoint().getY();
        int x2 = x1+lengthBB;
        int y2 = y1+widthBB;
    }



    public void draw (Graphics g){
        g.drawRect();
    }

}
