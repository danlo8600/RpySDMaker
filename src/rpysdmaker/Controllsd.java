/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpysdmaker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author d4n1x
 */
public class Controllsd {

    public static void main(String[] args) {
        
        BufferedReader bf;
        
        try {
            FileReader fl = new FileReader("cnsys");
            bf = new BufferedReader(fl);
            String cn = bf.readLine().toString();
            if(cn.equals("/dev/mmcblk0")){
                System.out.println("SD Presente");
                Home hom = new Home();
                hom.main(null);
            }else{
                System.out.println("Nessuna SD Presente");
                //Sdnotpresent err = new Sdnotpresent();
                //Sdnotpresent.main();
            }
            
        } catch (IOException ex) {
            System.out.println("Error !!!");
            //Sdnotpresent err = new Sdnotpresent();
            //Sdnotpresent.main();
        } catch (NullPointerException nlpex){
            //Sdnotpresent.main();
        }
    }
    
}