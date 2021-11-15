import fr.ensea.projet2A.Point;
import java.awt.Graphics;
import java.awt.Color;

public class Rectangle extends Figure {
    public Rectangle(Color c, Point point) {
        super(c, point);
    }

    public void setBoundingBox (int width, int length){
        int x1 = getPoint().getX();
        int y1 = getPoint().getY();
        int x2 = x1+length;
        int y2 = y1+width;
    }

    public void draw (Graphics g){

    }

}
