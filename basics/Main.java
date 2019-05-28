import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        heads = 0;
      }
    } while (heads < n);
    System.out.println("It took " + totalFlips + " flips to flip " + n + " heads in a row");
  }

  public static void clock(){
    LocalDateTime now = LocalDateTime.now();
    while(true){
      if(now.getSecond() != LocalDateTime.now().getSecond()){
        System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        now = LocalDateTime.now();
      }
      
    }

    // while(true){
    //   LocalDateTime now = LocalDateTime.now();
    //   String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    //   System.out.println(time);
    //   try{
    //     Thread.sleep(1000);
    //   } catch(InterruptedException ex) {
    //     Thread.currentThread().interrupt();
    //   }
    // }
  }

  public static void main(String[] args){
    pluarlize("dog", 0);
    pluarlize("cat", 1);
    pluarlize("turle", 2);
    flipNHeads(5);
    clock();
  }
}
