public class Addnumbers{

     public static void main(String []args){
         int a=10,b=15,sum;
         sum=a+b;
        System.out.println("The sum of the two numbers is" + sum)
     }
}

$javac Addnumbers.java
$java -Xmx128M -Xms16M Addnumbers
The sum of the two numbers is 25