package pl.imiajd.Barski_lab7;

public class BetterRectangle extends java.awt.Rectangle{

        public BetterRectangle(int szer, int wys, int cos, int cos2) {
            super.setLocation(cos,cos2);
            super.setSize(szer, wys);
            //super(width, height, cos, cos2) -----> dodane do zadania 7 (chyba o to chodziło)
        }

        public double getPerimeter(){
            return (super.height + super.width * 2);
        }

        public double getArea(){
            return super.width * super.height;
        }
}


