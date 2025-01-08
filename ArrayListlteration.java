import java.util.*;
public class ArrayListlteration{
public static void main(String args[])
{
List<String>al=new ArrayList<String>();
al.add("Ann");
al.add("Bill");
al.add("Cathy");
for (int i=0;i<al.size();i++)
{
System.out.print(al.get(i)+"");
}
System.out.println();
for(String str:al)
System.out.print(str+"");
}
}
