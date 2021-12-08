/*
 * Patron factory para los elementos Dao
 */
package org.uv.data;

public class FabricaDao {

    public enum TYPE_DAO{EMPLEADO};
    
    public static DaoGeneral getDao(TYPE_DAO type){
        DaoGeneral elemento = null;
        switch(type){
            
            case EMPLEADO:
                elemento = new DaoEmpleado();
                break;
        }                
        return elemento;
    }
    
}
