package MCA_I;
public class GenericClass <T>{ 
private T t;
public void add(T t){ 
this.t=t;
}
public T get(){ 
return t;
}
public static void main(String args[]){
GenericClass<Integer> intObj = new GenericClass<Integer>(); 
GenericClass<String> strObj = new GenericClass<String>(); 
intObj.add(76045);
strObj.add("Imran Ansari");
System.out.println("Integer Value: "+ intObj.get()); 
System.out.println("String Value:" + strObj.get());
}
}