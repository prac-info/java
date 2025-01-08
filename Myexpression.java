interface abc
{
public void say(String s1, String s2);
}
public class Myexpression {
public static void main(String []args)
{
abc msg=(s1,s2)->
{
System.out.println(s1+""+s2);
};
msg.say("Hello:", "MCA Student");
}
}
