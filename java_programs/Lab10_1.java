import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Lab10_1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
            String line = br.readLine();
            int lc = 0 ,wc =0 , cc = 0;
            while(line != null){
                lc++;
                String[] word = line.split(" ");
                wc += word.length;
                cc += line.length();
                line = br.readLine();
              
            }
            System.out.println("word count : "+wc);
            System.out.println("character count : "+cc);
            System.out.println("total lines :"+lc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

