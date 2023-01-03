public class Main {
    public static void main(String[] args) {

        //SOBRECARGA
        System.out.println("\nÁrea dos quadriláteros:\n");

        Quadrilatero.area(5);
        Quadrilatero.area(2d, 5d);
        Quadrilatero.area(10, 5, 2 );
        Quadrilatero.area(2f, 5f);



        //RETORNO
        System.out.println("\n\nÁrea dos quadriláteros:\n");

        double areaQuadrado = Retornos.area(5);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Retornos.area(2d, 5d);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Retornos.area(10, 5, 2);
        System.out.println("Área do trapézio: " + areaTrapezio);

        float areaLosango = Retornos.area(2f, 5f);
        System.out.println("Área do losango: " + areaLosango);
    }
}