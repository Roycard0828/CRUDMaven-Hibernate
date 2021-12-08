
package org.uv.data;


public class Empleado {
    public String nombre;
    public String cod_emp;
    public int sueldo;
    public String cod_dept;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(String Cod_emp) {
        this.cod_emp = Cod_emp;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getCod_dept() {
        return cod_dept;
    }

    public void setCod_dept(String Cod_dept) {
        this.cod_dept = Cod_dept;
    }
}
