
package codecoches;

/**
 *
 * @author MarekLegends
 */
public class CodeCOCHES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carrera a = new Carrera("CarreraCAR", 10);
        
        Coche nobot = new Coche("Marcos", 26, 10);
        
        System.out.println("-----------------------");
        System.out.println(a.getNombre());
         System.out.println("-----------------------");
        
       a.añadirPiloto(nobot);
        
       // un buen bucle que peta el programa
       // a.añadirBots();
        
         System.out.println("-----------------------");
        
        a.mostrarPilotos();
        
        
        
    }
    
}
