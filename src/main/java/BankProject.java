// 8th program
import java.util.Random;
public class BankProject {
  public static void main(String[] args) {
    Account acc = new Account(100);
    OTP otp = new OTP();
    acc.deposit(100);
    acc.withdraw(50);
    System.out.println(acc.getBalance());
    System.out.println(otp.otp);
  }
}

class Account {
  private int balance;

  Account(int balance) {
    this.balance = balance;
  }

  void deposit(int amount) {
    this.balance += amount;
  }

  void withdraw(int amount) {
    this.balance -= amount;
  }

  int getBalance() {
    return this.balance;
  }
}

class OTP {
  Random rand = new Random();
  int otp = rand.nextInt(10000);
}