/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

/**
 *
 * @author Amina
 */
import algebra.Matrica;

public class Zadatak2Ispit extends Matrica{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{
            Matrica prva = new Matrica(2);
            prva.setElement(0, 0, 1);
            prva.setElement(0, 1, 1);
            prva.setElement(1, 0, 1);
            prva.setElement(1, 1, 1);
            
            Matrica druga = new Matrica(2);
            druga.setElement(0, 0, 1);
            druga.setElement(0, 1, 1);
            druga.setElement(1, 0, 1);
            druga.setElement(1, 1, 1);
            
            int pomnozena[][];
            
            pomnozena = prva.Pomnozi(druga.elementi, 2);
            prva.OMatrica("tekst", pomnozena);      
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
