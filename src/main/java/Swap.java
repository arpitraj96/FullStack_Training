// 1st Program
import java.util.Scanner;
public class Swap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value: ");
    int input = sc.nextInt();
    // if(input==1){
    //   System.out.println("After toggle: "+2);
    // }else if(input==2){
    //   System.out.println("After toggle: "+1);
    // }else{
    //   System.out.println("Invalid Number");
    // }
    // Another Approach 
    System.out.println("After Toggle: "+(3-input));
    sc.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}