package ejerciciointegrador.pkg1.logica;

/**
 *
 * @author Norayio
 */

public class Arbusto extends Planta implements Ihola {
    
    private double anchoArbusto;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorHojas;
    private boolean sePodaOno;   

    public Arbusto() {
    }

    
    public Arbusto(double anchoArbusto, boolean esDomestico, String variedadArbusto, String colorHojas, boolean sePodaOno, String nombre, boolean altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorHojas = colorHojas;
        this.sePodaOno = sePodaOno;
    }
    
    
    
    @Override
    public void holaSoyUn() {
        System.out.println("Hola, soy un arbusto");
    }
    
    
    
    
    
    
    
    
    
}
