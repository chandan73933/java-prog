class A
{
 public A()
 {
  System.out.println("Class A1"); 
 }
}

class B extends A 
{
 public B()
 {
  this(5); 
  System.out.println("Class B1");
 }
 public B(int k)
 {
  super();
  System.out.println("Class B2");
 }
}

public class j
{
 public static void main(String[] args)
 {
   B obj = new B();
 }
}