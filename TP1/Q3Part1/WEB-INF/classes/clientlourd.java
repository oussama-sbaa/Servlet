import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class clientlourd{

    public static void main(String[] args) {
        String host = "http://10.104.21.104/TP1/Hello";
        URL url = null;
            try {
                url= new URL(host);
                URLConnection con = url.openConnection();
                BufferedReader in = new BufferedReader(
                new InputStreamReader(
                con.getInputStream(),"UTF-8"));
                String inputline;
                while((inputline = in.readLine())!=null){
                    System.out.println(inputline);
                }
            }
            catch (IOException e1) {
            e1.printStackTrace();
            
            }
        }
    
}


