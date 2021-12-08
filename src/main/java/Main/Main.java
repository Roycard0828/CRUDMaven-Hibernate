/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import org.hibernate.Session;
import org.uv.HibernateUtil;
import org.uv.data.DaoEmpleado;
import org.uv.data.Empleado;

/**
 *
 * @author GAMR_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado emp = new Empleado();
        emp.setNombre("Jesus");
        emp.setCod_emp("E002");
        emp.setSueldo(1234);
        emp.setCod_dept("D001");
        
        DaoEmpleado dao = new DaoEmpleado();
        dao.add(emp);
        
    }
    
}
