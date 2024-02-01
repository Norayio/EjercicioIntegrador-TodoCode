package ejerciciointegrador.pkg1.logica;

/**
 *
 * @author Norayio
 */

public class Arbol  extends Planta implements Ihola {
    
    private String variedad;
    private String tipoTronco;
    private double radioTronco;
    private String color;
    private String tipoHojas;

    public Arbol() {
    }


    public Arbol(String variedad, String tipoTronco, double radioTronco, String color, String tipoHojas, String nombre, boolean altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioTronco = radioTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;
    }
    
    

    @Override
    public void holaSoyUn() {
        System.out.println("Hola, soy un arbol");
    }

    @Override
    public void comoSoy() {
        System.out.println("Hola, soy un arbol y soy muy alto");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
