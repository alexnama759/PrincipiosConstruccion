public class Main {
    public static void main(String[] args) {
        Rectangle rectangulo = new Rectangle(4, 3);
        Triangle triangulo = new Triangle(5, 6);

        System.out.println("Rectángulo:");
        System.out.println("Área: " + rectangulo.getArea());
        System.out.println("Perímetro: " + rectangulo.getPerimeter());

        System.out.println("Triángulo:");
        System.out.println("Área: " + triangulo.getArea());
        System.out.println("Perímetro: " + triangulo.getPerimeter());

        System.out.println("Redimensionando el rectángulo...");
        rectangulo.resize(3);

        System.out.println("Rectángulo:");
        System.out.println("Área: " + rectangulo.getArea());
        System.out.println("Perímetro: " + rectangulo.getPerimeter());
    }
}