import java.util.*;
public class ArrayList1 {
public static void main(String args[]) {
List<String> str = new ArrayList<String>();
str.add("John");
str.add("Jane");
str.add("Alice");
for (int i = 0; i < str.size(); i++) {
System.out.println(str.get(i) + "");
}
System.out.println(); 
for (String name : str) {
System.out.println(name + "");
}
}
}
