public class Factorial{

     public static void main(String []args){
        int num=5,i,j;
        for( i=1;i<=num;i++)
        {
              int fact=1;
              for( j=1;j<=i;j++)
              {
                  fact=fact*j;
              }
              System.out.println("Factorial of " + i + "= " + fact );
        }
     }
}

$javac Factorial.java
$java -Xmx128M -Xms16M Factorial
Factorial of 1= 1
Factorial of 2= 2
Factorial of 3= 6
Factorial of 4= 24
Factorial of 5= 120