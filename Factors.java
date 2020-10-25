public class Factors{

  public static void main(String[] args) {
    
   int num=48;
     
   for (int i = 1; i <= num; ++i) {

      if (num % i == 0) {
        System.out.print(i + "are the factors of the number ");
      }
    }
  }
}

$javac Factors.java
$java -Xmx128M -Xms16M Factors
1,2,3,4,6,8,12,16,24,48 are thde factors of the number