public class Student {
    private String name;
    private Double GPA;
    private int age;

    public Student (String studentName, Double studentGPA, int studentAge){
        name = studentName;
        GPA = studentGPA;
        age = studentAge;
    }
    public void printStudentInfo(){
        if (age >= 14 && age <= 17){
            System.out.println("Student Name: " + name);
            System.out.println ("School status: High-schooler");
            System.out.println("Student GPA: " + GPA);
            System.out.println(" ");
            
            }else if (age > 17){
                System.out.println("Student Name: " + name);
                System.out.println ("School status: Graduated High-school");
                System.out.println("Student GPA: " + GPA);
                System.out.println(" ");
               
            }else{
                System.out.println("Student Name: " + name);
                System.out.println ("School status: Not in high-school yet");
                System.out.println("Student GPA: " + GPA);
                System.out.println(" ");

                
             }
            }
        }

