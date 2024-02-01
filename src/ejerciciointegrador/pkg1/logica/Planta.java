package ejerciciointegrador.pkg1.logica;

/**
 *
 * @author Norayio
 */

public abstract class Planta {
    
    private String nombre;
    private boolean altoTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    // constructores
    public Planta( ) {
    }

    public Planta(String nombre, boolean altoTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }
    
    // getters & setters

    public String getNombre( ) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public boolean getAltoTallo( ) {
        return altoTallo;
    }

    public void setAltoTallo(boolean altoTallo) {
        this.altoTallo = altoTallo;
    }
    

    public boolean isTieneHojas( ) {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }
    

    public String getClimaIdeal( ) {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    
    
    


    
    
    
    
    
    
}
