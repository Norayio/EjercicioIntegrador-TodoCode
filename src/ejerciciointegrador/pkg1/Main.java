package ejerciciointegrador.pkg1;

import ejerciciointegrador.pkg1.logica.Arbol;
import ejerciciointegrador.pkg1.logica.Arbusto;
import ejerciciointegrador.pkg1.logica.Flor;

/**
 *
 * @author Norayio
 */

public class Main {

    public static void main(String[] args) {
        
        // creación de objetos de cada clase hija
        Arbol arbol = new Arbol( );
        Flor flor = new Flor( );
        Arbusto arbusto = new Arbusto( );
        
        // usando el metodo de la interfaz en cada una de las clases hijas
        arbol.holaSoyUn( );
        arbol.comoSoy( );
        
        System.out.println("");
        
        flor.holaSoyUn( );
        flor.comoSoy( );
        
        System.out.println("");
        
        arbusto.holaSoyUn( );
        arbusto.comoSoy( );
        
        
        
        
    }
    
}
