
package codecoches;

/**
 *
 * @author MarekLegends
 */
public class Coche {
    
    private String nombrepiloto;
    private int dorsal;
    
    private int distanciacarrera;
    
    private String estado;
    private int potencia;
    private int velocidad;
    private int kmrecorridos;

    public Coche(String nombrepiloto, int dorsal, int distanciacarrera) {
        this.nombrepiloto = nombrepiloto;
        this.dorsal = dorsal;      
        this.distanciacarrera = distanciacarrera;   
        this.estado="PARADO";
        this.potencia=50;
        this.velocidad=0;
        this.kmrecorridos=0;
    }

    public String getNombrepiloto() {
        return nombrepiloto;
    }

    public void setNombrepiloto(String nombrepiloto) {
        this.nombrepiloto = nombrepiloto;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getDistanciacarrera() {
        return distanciacarrera;
    }

    public void setDistanciacarrera(int distanciacarrera) {
        this.distanciacarrera = distanciacarrera;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getKmrecorridos() {
        return kmrecorridos;
    }

    public void setKmrecorridos(int kmrecorridos) {
        this.kmrecorridos = kmrecorridos;
    }

   
    
 
    
}
