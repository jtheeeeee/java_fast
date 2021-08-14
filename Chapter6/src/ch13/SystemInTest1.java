package ch13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInTest1 {
    public static void main(String[] args) {
        System.out.println("알파벳 하나를 쓰고 enter를 누르세요.");
//        int i;
//        try {
//            i= System.in.read(); //여러개를 입력해도 하나만 받음.
//            System.out.println(i);//숫자로 나옴 a=97
//            System.out.println((char)i);//문자로 형변환
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        int j;
        try{
            //바이트를 문자열로 바꿔주는 것.
            InputStreamReader irs = new InputStreamReader(System.in);//한글잘나옴
            while((j=irs.read())!='\n'){
                System.out.print((char)j);

            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
