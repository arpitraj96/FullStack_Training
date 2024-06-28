// 4th Program
public class {
  public static void main(String[] args){
    Faculty fac = new Faculty("Aliana", 1234567890, 'F', "aliana@niet.co.in", 1000000, "AP", "CSE-IoT");
    System.out.println(fac.name);
    System.out.println(fac.Salary);
    System.out.println(fac.gender);
    System.out.println(fac.mobile);
    System.out.println(fac.Department);
    System.out.println(fac.Designation);
    System.out.println(fac.email);
  }
}
class Person{
  String name;
  int mobile;
  char gender;
  String email;
  Person(String name, int mobile, char gender, String email)
    {
      this.name = name;
      this.mobile = mobile;
      this.gender = gender;
      this.email = email;
    }
}
class Faculty extends Person{
  int Salary;
  String Designation;
  String Department;
  Faculty(String name, int mobile, char gender, String email, int Salary, String Designation, String Department)
    {
      super(name, mobile, gender, email);
      this.Salary = Salary;
      this.Designation = Designation;
      this.Department = Department;
    }
}
