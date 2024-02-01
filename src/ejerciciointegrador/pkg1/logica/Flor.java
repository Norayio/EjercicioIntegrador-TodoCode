package ejerciciointegrador.pkg1.logica;

/**
 *
 * @author Norayio
 */

public class Flor extends Planta implements Ihola {

    private String colorPetalos;
    private double promedioPetalos;
    private String colorPistilo;
    private String variedadFlor;
    private String estacionFlorece;

    public Flor() {
    }


    public Flor(String colorPetalos, double promedioPetalos, String colorPistilo, String variedadFlor, String estacionFlorece, String nombre, boolean altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.promedioPetalos = promedioPetalos;
        this.colorPistilo = colorPistilo;
        this.variedadFlor = variedadFlor;
        this.estacionFlorece = estacionFlorece;
    }

    
    
    
    
    
    
    @Override
    public void holaSoyUn() {
        System.out.println("Hola, soun una flor");
    }

    @Override
    public void comoSoy() {
        System.out.println("Hola, soy una flor y soy muy pequeña y fina");
    }
    


    

    
}
