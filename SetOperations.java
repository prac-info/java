package MCA_I; 
import java.util.*;
public class SetOperations {
public static void main(String args[]){ 
Integer[] A = {22,45,64,55,87,45,42};
Integer[] B = {34,54,76,75,75,13,35};
Set<Integer> set1 = new HashSet<Integer>(); 
set1.addAll(Arrays.asList(A));
Set<Integer> set2 = new HashSet<Integer>(); 
set2.addAll(Arrays.asList(B));
// Finding Union of set1 and set2
Set<Integer> union_data = new HashSet<Integer>(set1); 
union_data.addAll(set2);
System.out.print("Union of set1 and set2 is:"); 
System.out.println(union_data);
// Finding Intersection of set1 and set2
Set<Integer> intersection_data = new HashSet<Integer>(set1); 
intersection_data.retainAll(set2);
System.out.print("Intersection of set1 and set2 is:");
6
System.out.println(intersection_data);
// Finding Diffrence of set1 and set2
Set<Integer> difference_data = new HashSet<Integer>(set1); 
difference_data.removeAll(set2);
System.out.print("ifference of set1 and set2 is:"); 
System.out.println(difference_data);
}
}