
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
        boolean encontrado;
        boolean rellenado = false;
        int dorsal, total=4;
        String[] nomramdom = {"mango", "uva", "pera", "manzana", "melon", "sandia", "platano", "piña"};
      
        
           
        do{
        Random r = new Random();
        int nramdom2 = r.nextInt(6)+1;
        String nbot=nomramdom[nramdom2];

          //Sacar dorsal
        
            do{
                encontrado=false;
                dorsal = r.nextInt(4)+1;
                for (int i = 1; i < pilotos.length; i++) {
                    if (pilotos[i]!=null && pilotos[i].getDorsal()==dorsal) { 
                        encontrado = true;
                        break;
                    } 
                }   
            }while(encontrado==true);

            for (int i = 1; i < pilotos.length; i++) {
                   if (pilotos[i]==null) { 
                        Coche bot = new Coche(nbot, dorsal, distanciacarrera);
                        pilotos[i]=bot;
                        System.out.println(">>>>>> Bot añadido ");
                        total--;
                        break;
                   }
            }

       }while(total>0);
            
        
        System.out.println(">>>> Totos los bots añadidos ");
    }
    
    
        
      
  public void mostrarPilotos(){
      System.out.println("____PILOTOS____");
      System.out.println("");
      for (int i = 0; i < pilotos.length; i++) {
          if (pilotos[i]!=null) {                   
               System.out.println(""+(i+1)+" - "+pilotos[i].toString());
             }
          else{
              System.out.println("No hay coches");
          }
      }
      System.out.println("_______________");
  }         

    public String getNombre() {
        return nombre;
    }
      
        
    
            
    }
    
    

