package fr.ensea.projet2A;

public class Point {
    private Integer X;
    private Integer Y;

    public Point(){
        X = 0;
        Y = 0;
    }

    public Point(Integer X, Integer Y){
        this.X = X;
        this.Y = Y;
    }

    public Integer getX(){return X;}
    public Integer getY(){return Y;}

    public void setX(Integer x) {
        X = x;
    }

    public void setY(Integer y) {
        Y = y;
    }

    @Override
    public String toString(){
        return "("+getX()+","+getY()+")";
    }

    static public void main(String args[]){
        Point zero = new Point();
        Point random = new Point(45,36);
        System.out.println(zero);
        System.out.println(random);
    }
}
