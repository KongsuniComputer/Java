import java.io.*;
public class Day01 {
  public static void main(String[] ar)  throws IOException{
  System.out.print("문자입력=");
 char aa= (char)System.in.read();
 System.in.read();
 System.in.read(); 
 System.out.print("숫자입력=");
 int bb=System.in.read()-48;
System.out.println("입력된 문자는 "+aa+" 입니다.");
System.out.println("입력된 숫자는 "+bb+" 입니다.");
    }  
  }
