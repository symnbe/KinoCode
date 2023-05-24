//switchについて

public class Lesson_10 {

  public static void main(String[] args) {

    String signal = "green";
    switch(signal){
      case "red":
      System.out.println("Stop!!");
      break;
      case "yellow":
      System.out.println("Caoution1");
      break;
      case "blue":
      case "green":
      System.out.println("Go!!");
      break;
    }
  }

}