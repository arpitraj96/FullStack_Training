// 5th Program
public class LearnAbstraction{
  public static void main(String[] args){
    SBI sbi = new SBI(1000, 2, 2);
    System.out.println("The rate of Interest is: "+sbi.getRateOfInterest());
  }
}
abstract class RateOfInterest{
  abstract double getRateOfInterest();
}

class SBI extends RateOfInterest{
  int principle;
  int time;
  int rate;
  SBI(int principle, int time, int rate){
    this.principle = principle;
    this.time = time;
    this.rate = rate;
  }
  @Override double getRateOfInterest(){
    return (principle*rate*time)/100;
  }

}