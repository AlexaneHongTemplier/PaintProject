package fr.ensea.projet2A;

public class MyPoint {
    private Integer X;
    private Integer Y;

    public MyPoint(){
        X = 0;
        Y = 0;
    }

    public MyPoint(Integer X, Integer Y){
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
        fr.ensea.projet2A.MyPoint zero = new fr.ensea.projet2A.MyPoint();
        fr.ensea.projet2A.MyPoint random = new fr.ensea.projet2A.MyPoint(45,36);
        System.out.println(zero);
        System.out.println(random);
    }
}
