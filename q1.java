Class which can't be inherit
final class A{  
 void show(){
 System.out.println("Class A");
}                                       
}            
class B extends A{  
 void show(){
 System.out.println("Class B");
}                                       
}
class question3{
public static void main(String args[]){  
B obj= new B(); 
obj.show();
}
}
