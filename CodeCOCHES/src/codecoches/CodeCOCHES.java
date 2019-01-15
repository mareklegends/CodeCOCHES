
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
        
        Coche nobot = new Coche("Marek", 26, 10);
        
       a.añadirPiloto(nobot);
        
        a.añadirBots();
        
        a.mostrarPilotos();
        
        
        
    }
    
}
