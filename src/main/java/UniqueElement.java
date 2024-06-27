// 7th Program
// WAP to find the unique element in an array such that all other element are occuring twice in the array.(There is only one element occuring only once)
public class UniqueElement{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,11};
    int unique = 0;
    for(int i=0; i<arr.length; i++){
      unique = unique^arr[i];
    }
    System.out.println(unique);
  }
}