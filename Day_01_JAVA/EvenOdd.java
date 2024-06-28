// 2nd Program
import java.util.Scanner;
public class EvenOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value: ");
    int input = sc.nextInt();
    if((input&1)==0){
      System.out.println("Even");
    }else{
      System.out.println("Odd");
    }
  }
}
