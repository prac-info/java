interface Sayable
{
public String say();
}
public class  NoparameterLamdaExpression
{
public static void main(String[]args)
{
Sayable s=()->{
return "WELCOME TO MUMBAI UNIVERSITY IDOL";
};
System.out.println(s.say());
}
}
