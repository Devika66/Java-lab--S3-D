public class EvenOdd {

    public static void main(String[] args) {
        
     int num = 27;

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
      }
   }

$javac EvenOdd.java
$java -Xmx128M -Xms16M EvenOdd
27 is odd