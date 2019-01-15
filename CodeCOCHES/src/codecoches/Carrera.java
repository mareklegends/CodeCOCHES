
package codecoches;

import java.util.Random;

/**
 *
 * @author MarekLegends
 */
public class Carrera {
    private String nombre;
    private int distanciacarrera;
    
     private Coche[] pilotos;

    public Carrera(String nombre, int distanciacarrera) {
        this.nombre = nombre;
        this.distanciacarrera = distanciacarrera;
        
    }

    public Carrera() {
        pilotos = new Coche[5];
    }
    

   
     
    
    public void añadirBots(){
        
        
        for (int i = 1; i < pilotos.length; i++) {
            
            Random r = new Random();
            int nramdom = r.nextInt(4)+1;
           
            
            if (pilotos[i].getDorsal()!=nramdom) { 
                
                pilotos[i].setDorsal(nramdom);
            } 
            
            String[] nomramdom = {"mango", "uva", "pera", "manzana", "melon", "sandia"};
            String anterior=nomramdom[nramdom];
            
            if (pilotos[i].getNombrepiloto()!=anterior) { 
           
             pilotos[i].setNombrepiloto(nomramdom[nramdom]);
             
            }
        }  
        
        
    }
    
    
}
