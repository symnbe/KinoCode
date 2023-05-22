//データ型について

//整数(byte, short, int, long)
// byte -100~100
// short -3万~３万
// int -20億〜20億
// long 京の桁以上[最後にLをつけないといけない]

// public class Lesson_07 {

//   public static void main(String[] args) {
//     byte var01 = 1;
//     short var02 = 12345;
//     int var03 = 1234567890;
//     long var04 = 123456789000L;

//     System.out.println(var01);
//     System.out.println(var02);
//     System.out.println(var03);
//     System.out.println(var04);

//   }

// }
//------------------------------------------------------------------------------
//小数(Float、double)
//小数点を使用するときはdoubleを使用することが多い
// public class Lesson_07 {

//   public static void main(String[] args) {

//     double var01 = 1.23456789;
//     float var02 = 1.234F;

//     System.out.println(var01);
//     System.out.println(var02);

//   }

// }

//------------------------------------------------------------------------------
//（char, String）
//char 一文字の場合に使用（シングルクォーテーション）
//String 2文字以上の場合に使用（ダブルクォーテーション）

// public class Lesson_07 {

//   public static void main(String[] args) {

//     char var01 = 'C';
//     String var02 = "hello, world";

//     System.out.println(var01);
//     System.out.println(var02);

//   }

// }
//------------------------------------------------------------------------------
 //ブール型(true or false)


public class Lesson_07 {

  public static void main(String[] args) {

    int var01 = 10;
    int var02 = 1;
    boolean var_bool;

    var_bool = (var01 < var02);

    System.out.println(var_bool);

  }

}
