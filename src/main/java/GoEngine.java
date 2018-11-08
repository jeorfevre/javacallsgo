package io.bumker.javacallsgo;
import com.sun.jna.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class GoEngine {
  static GoLib GOLIB;
  static {   
    String lib = "C:/dev/git/go/src/javacallsgo/libso/app.so";
    GOLIB = (GoLib) Native.loadLibrary(lib, GoLib.class);
  }

  public interface GoLib extends Library {
    long Add(long x, long y);
  }

  public static void main(String[] args) { 

    int max = 1000;  
    printf("CALLING GO from java x"+ max+ "\n");

    for (int i=0; i <max; i++){
      long total = GOLIB.Add(30, 12);
    }
    printf ( " \n");   
    printf ( " done :");   
  
  }
  private static void printf(String msg){
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");  
    System.out.println(formatter.format(new Date())+ " - "+ msg);
  }
}