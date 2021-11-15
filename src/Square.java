import fr.ensea.projet2A.Point;
import java.awt.Graphics;
import java.awt.Color;

public class Square extends Rectangle {
    public Square (Color c, Point point) {
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
    }

    public void draw (Graphics g){

    }
}
