import java.util.*;


public class Circle {
   public static double getCircum(double rad) {

      return 2 *3.142 *rad;
      }
   
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      double rad = sc.nextDouble();
     
     System.out.println(getCircum(rad));
   }   
}

// import java.util.*;


// public class Circle {
//    public static Double getCircumference(Double radius) {
//        double circ=2 * 3.14 * radius;
//    return circ;}
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       Double r = sc.nextDouble();
     
//     System.out.println(getCircumference(radius));
//    }   
// }
                                                      