
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
        pilotos = new Coche[5];
    }

 
    

    public void añadirPiloto(Coche nobot){
        for (int i = 0; i < 1; i++) {
            if (pilotos[i]==null) {
                pilotos[i]=nobot;
                System.out.println(">>>> Tu coche esta añadido ");
                break;
            }
        }
         
    }
   
     
    
    public void añadirBots(){        
        boolean encontrado = false;
        boolean rellenado = false;
        int nramdomfimal=0;
  
        //Sacar dorsal
        
        do{
        Random r = new Random();
        int nramdom = r.nextInt(4)+1;
        for (int i = 1; i < pilotos.length; i++) {
            if (pilotos[i]!=null && pilotos[i].getDorsal()!=nramdom) { 
                encontrado = true;
                nramdomfimal=nramdom;
                break;
            } 
        }   
        }while(encontrado!=true);
        
        if (encontrado==true) {
            
            do{
            Random r = new Random();
            int nramdom2 = r.nextInt(6)+1;
            String[] nomramdom = {"mango", "uva", "pera", "manzana", "melon", "sandia", "platano", "piña"};
            String nbot=nomramdom[nramdom2];
            
            for (int i = 1; i < pilotos.length; i++) {
                
                   if (pilotos[i]==null) { 
                
                        Coche bot = new Coche(nbot, nramdomfimal, 10);
                        pilotos[i]=bot;
                        System.out.println(">>>> Bot añadido ");
                        break;
                
                   }
                   
            }
            
           }while(rellenado!=true);
            
        } 
    }
    
    
        
      
  public void mostrarPilotos(){
      for (int i = 0; i < pilotos.length; i++) {
          if (pilotos[i]!=null) {
                   
          System.out.println(i+""+pilotos[i]);
             }
      }
  }         
      
        
    
            
    }
    
    

