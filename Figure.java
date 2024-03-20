public abstract class Figure {

    private int numberSide;

    public Figure(int numberSide) {
        this.numberSide = numberSide;
    }

    public int getNumberSide() {
        return numberSide;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
