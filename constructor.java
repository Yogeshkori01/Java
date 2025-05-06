
    import java.util.Scanner;
class  student {
  student(){
    String name="yogesh";
    int age=20;
    
  }
  // String name="yogesh";
  // int age=20;
  // student(String n ,int a){
    //String n=name;
    //int a=age;
  }
  void display(){
    System.out.println("my name is "+name+" and i am "+age+" year old");
  }
  
}

    public class Main {
      public static void main(String[] args) {
        student s1=new student("yogesh",19);
        s1.display();
        
// class Main{
//   void sum()
//   {
//     System.out.println(this);
//   }
//   public static void main(String[] args){
//     Main obj=new Main();
//     System.out.println(obj);
//     obj.sum();
//   }
// }





    
//   }
// }
