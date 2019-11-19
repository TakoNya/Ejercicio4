package archivosejercicio4;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

        public class ArchivosEjercicio4 {

        public static void main(String[] args) {
            String[] lineas = {"糞虫"};
            Writer out = null;
            try{
                out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("archivo2.txt"), "UTF-8"));
                for (String linea : lineas){
                    try{
                        out.write (linea + "\r\n");
                    } catch (IOException ex){
                        System.out.println("Mensaje excepcion escritura: " + ex.getMessage());
                    }
                }
            } catch (UnsupportedEncodingException | FileNotFoundException ex2){
                System.out.println("Mensaje error 2: " + ex2.getMessage());
                
            } finally {
                try {
                    out.close();
                } catch (IOException ex3){
                    System.out.println("Mensaje error cierre archivo: " + ex3.getMessage());
                }
            }
        
    }
    
}
