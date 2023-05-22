//配列

//配列の作り方
// データ型[] 配列変数名;
// 配列変数名 ＝ new　データ型[要素数];

// public class Lesson_08 {
  
//   public static void main(String[] args) {
//     String[] arr;
//     arr = new String[3];
    
//     arr[0] = "sato";
//     arr[1] = "suzuki";
//     arr[2] = "takahashi";
    
//     System.out.println(arr[0]);
//     System.out.println(arr[1]);
//     System.out.println(arr[2]);
    
//   }
  
// }

//下記は省略形

// public class Lesson_08 {
  
//   public static void main(String[] args) {
//     String[] arr = {"sato", "suzuki", "takahashi"};
    
//     arr[1] = "Tanaka";
    
//     System.out.println(arr[0]);
//     System.out.println(arr[1]);
//     System.out.println(arr[2]);
    
//   }
  
  
  
// }

//二次元の配列コード

public class Lesson_08 {
  
  public static void main(String[] args) {
    String[][] arr;
    arr = new String [2][2];
    
    arr[0][0] = "sato";
    arr[0][1] = "suzuki";
    arr[1][0] = "takahashi";
    arr[1][1] = "tanaka";
    
    System.out.println(arr[0][0]);
    System.out.println(arr[0][1]);
    System.out.println(arr[1][0]);
    System.out.println(arr[1][1]);
    
  }
  
  
  
}