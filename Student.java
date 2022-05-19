class Student{

        int roll;
       
        String name;

        int marks;

    public static void main(String[] args){

        Student k1 = new Student();

        

        k1.roll = 12;

        k1.name = "Yash";

        k1.marks = 70;

        System.out.println("Roll is: "+k1.roll);
        System.out.println("Name is : "+k1.name);
        System.out.println("Marks is : "+k1.marks);

        
        k1 = null;
 
        System.out.println(k1);

    }

}