class A{
    public void Car(){
        System.out.println("Audi car");

    }
    
}
class B extends A {
    public void Bike()
    {
        System.out.println("Duke Bike");
    }
}
class C extends B{
    public void Cycle(){

    
    System.out.println("cycle");
}}
public class Multinheritance{
    public static void main(String[] args) {
        C ob=new C();
        ob.Car();
        
        
    }
}