package MCA_I; 
import java.util.Arrays; 
import java.util.List;
public class WildCard_1 {
public static void main(String args[]){
// Lower bounded Integer List 
List<Integer> list1 =Arrays.asList(1,2,3,4);
// Integer List object is being passed 
print(list1);
//Lower bounded Number List 
List<Number> list2= Arrays.asList(5,6,7,8); 
print(list2);
}
public static void print(List<? super Integer>list){ 
System.out.println("Output is:"+ list);
}
}
