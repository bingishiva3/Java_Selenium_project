package Day3;

public class Operators_Demo
{
    public static void main(String[] args){
        //Arthamatic operators
        int a=20, b=10;
        System.out.println("the sum of a and b is "+(a+b));
        System.out.println("difference of a and b is "+(a-b));
        System.out.println("div of a and b is "+(a/b));
        System.out.println("mul of a and b is "+(a*b));
        System.out.println("modul div of a and b is "+(a%b));

        //Relational or Comparison operators
        System.out.println(a>b); //true
        System.out.println(a<b); // false
        System.out.println(a>=b); //true
        System.out.println(a<=b); //false
        System.out.println(a==b); //false
        System.out.println(a!=b); //true

        // Logical Operators work between boolean values
        boolean x=true;
        boolean y=false;

        System.out.println(x&&y); //&&
        System.out.println(x||y); // ||
        System.out.println(!y);  // !y
        System.out.println(!x);  //!x

        //example

        boolean b1=10>20;
        boolean b2=20>10;

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(b1||b2);
        System.out.println(b1&&b2);
        System.out.println(!b1);
        System.out.println(!b2);

        System.out.println(!(10>20));


    }
}
