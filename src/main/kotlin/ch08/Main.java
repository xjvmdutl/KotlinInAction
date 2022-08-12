package ch08;

import static ch08.Ch08MainKt.processTheAnswer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

public class Main {
  public static void main(String[] args) {
    /* 자바 */
    /*
    processTheAnswer(number -> number + 1);
    processTheAnswer(
        new Function1<Integer, Integer>() {//자바 코드에서 코틀린 함수 타입을 사용
          @Override
          public Integer invoke(Integer number) {
            System.out.println(number);
            return number + 1;
          }
        }
    );
     */
    List<String> strings = new ArrayList<>();
    strings.add("42");
    //코틀린 표준 라이브러리에서 가져온 함수를 자바 코드에서 호출할 수 있다
    CollectionsKt.forEach(strings, s -> { //Strings는 확장함수의 수신객체
      System.out.println(s);
      return Unit.INSTANCE;
    });
  }
  static String readFirstLineFromFile(String path) throws IOException{
    try(BufferedReader br = new BufferedReader(new FileReader(path))){
      return br.readLine();
    }
  }
}
