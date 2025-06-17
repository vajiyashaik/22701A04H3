public class OOPS{
   static class Student{
        String name;
        String roll;
        int age;
        Student(String n,String r, int a){
            name=n;
            roll=r;
            age=a;
        }
    }
    public static void main(String[] args){
        Student s1=new Student("Ziyaaa","7yu",50);
        System.out.println(s1.name);
         System.out.println(s1.roll);
    }
}