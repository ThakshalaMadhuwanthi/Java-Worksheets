public class MathOperations {
      private static final double pi = 3.14159;

    public static double calculateCircleArea(double radius){
       double area;
       area = pi*radius*radius;
       return area;
    }

    public static double calculateSquareArea(double side){
        double area;
        area = side*side;
        return area;
    }

    static double getPi(){
        return pi;
    }

}
