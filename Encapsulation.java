
class atm{
    private int amount;
    public void set(int a){
       amount=a;
    }
    public int get(){
     return amount;
    }
    public void deposit(int b){
       amount=amount+b;
        System.out.println("Amount deposited  "+b+"\nTotal amount"+amount);

    }
    public void withdraw(int c){
        amount=amount-c;
        System.out.println("Withdraw amount"+c+"\nTotal amount"+amount);
    }
}
class student{
    private int marks;
    private String name;
    public void set(int a,String b){
        marks=a;
        name=b;
    }
    public void get(){
        System.out.println("Name "+name+"\nMarks "+marks);
    }

}




class employee{
    private int salary;
    private String name;
    private int id;
    public void set(int a,String b,int c){
        salary=a;
        name=b;
        id=c;
    }
    public void get(){
        System.out.println("Name "+name+"\nSalary "+salary+"\nID "+id);
    }
}




class rectangle{
    private int length;
    private int breadth;
    public void set(int a, int b){
        length=a;
        breadth=b;
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
    
}


class tempt{
    int celcius;
    public void set(int a){
        celcius=a;
    }
    public double fahrenheit(){
        return (celcius*1.8)+32;
    }
}



class Main{
    public static void main(String[] args){
        rectangle obj=new rectangle();
        obj.set(5,10);
        System.out.println("Area "+obj.area());
        System.out.println("Perimeter "+obj.perimeter());
        
    }
}













