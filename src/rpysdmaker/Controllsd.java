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

    private String sdpathname = null;
    
    
    void startHome(){
        
        BufferedReader bf;
        
        try {
            FileReader fl = new FileReader("cnsys");
            bf = new BufferedReader(fl);
            String cn = bf.readLine().toString();
            if(cn.equals("")){
                System.out.println("Nessuna SD Presente");
                Errornosd err = new Errornosd();
                err.main(null);
            }else{
                sdpathname = cn;
                System.out.println("SD Presente to:" + sdpathname);
                Home hom = new Home();
                hom.main(sdpathname);
            }
            
        } catch (IOException ex) {
            System.out.println("Error !!!");
            Errornosd err = new Errornosd();
            err.main(null);
        } catch (NullPointerException nlpex){
            Errornosd err = new Errornosd();
            err.main(null);
        }
    }
}