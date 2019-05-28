import java.util.Random;

public class Main {

  public static void pluarlize(String str, int num){
    if(num == 0 || num > 1){
      System.out.println("I own " + num + " " + str + "s");
    } else {
      System.out.println("I own " + num + " " + str);
    }
  }

  public static void flipNHeads(int n){
    Random rnd = new Random();
    
    int heads = 0;
    int totalFlips = 0;
    do {
      double result = rnd.nextDouble();
      if(result > .5){
        System.out.println("Heads");
        heads++;
        totalFlips++;
      } else {
        System.out.println("Tails");
        totalFlips++;
      }
    } while (heads < n);
    System.out.println("It took " + totalFlips + " flips to flip " + n + " heads in a row");
  }

  public static void main(String[] args){
    pluarlize("dog", 0);
    pluarlize("cat", 1);
    pluarlize("turle", 2);
    flipNHeads(5);
  }
}
