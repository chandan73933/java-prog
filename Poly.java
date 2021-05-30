class test
{
int a,b;
void calculate(int x)
{
a=x;
System.out.println("the square is"+(a*a));
}
void calculate(int x,int y)
{
a=x;
b=y;
System.out.println("the add is"+(a+b));
}
}
class Poly
{
public static void main(String ar[])
{
test obj=new test();
obj.calculate(4,7);
obj.calculate(2);
}
}