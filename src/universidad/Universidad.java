
package universidad;

import java.sql.Connection;
import universidad.modelo.Conexion;

/**
 *
 * @author joni
 */
public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Conexion c =new Conexion();
        Connection con=c.getConnection(); 
    }
    
}
