public class Controller {
    public static void main(String []args) {
    
    APLine line1 = new APLine(1, 1, 3);
    System.out.println(line1.getSlope());
    APLine line2 = new APLine(5, 10, 0);
    System.out.println(line2.isOnLine(10, -5));
    
    MinePrac obj1 = new MinePrac(1001, 1002, 1003);
    System.out.println(obj1.Coordinates());
    System.out.println(obj1.totalDistance());
    System.out.println(obj1.Diamonds(true, 'b'));
    }
}