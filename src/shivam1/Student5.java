package shivam1;

class Student5{
int id;
String name;
Student5(int i,String n){
id=i;
name=n;}
void display(){System.out.println(id+" "+name);}
public static void main(String[] args){
Student5 s1=new Student5(111,"jay");
s1.display();
}
}