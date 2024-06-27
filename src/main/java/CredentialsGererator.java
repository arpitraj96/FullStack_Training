// 3rd Program
import java.util.Scanner;
import java.util.Random;
public class CredentialsGererator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Department: ");
    String department = sc.nextLine();
    System.out.print("Enter the Name: ");
    String name = sc.nextLine();
    generateCredentials(department, name);
    sc.close();
  }
  static void generateCredentials(String department, String name){
    Random rand = new Random();
    String email = name+"@"+department+".niet.co.in";
    String psswd = department+name.charAt(0)+rand.nextInt(1000)+"@"+department.length()+"#"+name.length();
    System.out.println("Your Department Email is: "+email);
    System.out.println("Your Password for this Email is: "+psswd);
  }
}