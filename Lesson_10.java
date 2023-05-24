//繰り返し

public class Lesson_10 {

  public static void main(String[] args) {
    int arr[] = {2, 4, 6, 8, 10};
    int sum = 0;
    for(int i = 0; i <= 4; i++){
      // if(i == 3){
        // break;
        // continue;
      // }
      
      // for(int j = 0; j <= 2; j++){
        
        // System.out.println(i + "-" + j );
     // }
          // System.out.println(arr[i] );
          sum += arr[i];
          
      
    }
          System.out.println(sum);
  }

}