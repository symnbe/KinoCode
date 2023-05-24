//メソッド

//アクセス修飾子
// public protected 指定なし　private

//その他の修飾子
// static abstract final

//戻り値の型
// void int String

// メソッド名
//  main(javaのメソッドには必ず書く)
//  avg (自作メソッド名の際に使用)


//　クラス(データと処理をまとめたもの)
//　データ　＝　フィールド(代入・参照)
//  処理　＝　メソッド

class Student {
  String name = "sato";
  public void calculateAvg(int math, int english) {
    System.out.println((math + english)/2);
  }
}

public class Lesson_11{
  public static void main(String[] args){
    Student a001 = new Student();
    a001.name = "sato";
    System.out.println(a001.name);
    a001.calculateAvg(90,80);
    
    Student a002 = new Student();
    a002.name = "suzuki";
    System.out.println(a002.name);
    a002.calculateAvg(70,80);
  }
}