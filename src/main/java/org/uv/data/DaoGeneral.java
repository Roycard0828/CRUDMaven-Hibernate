/*
 * Interface DAO
 */
package org.uv.data;

import java.util.ArrayList;

/**
 *
 * @author rodrigo08
 */
public interface DaoGeneral<T> {
    
    public boolean add(T pojo);
    public boolean delete(T pojo);
    public boolean update(T pojo);
    public T read(String Cod_emp);
    public ArrayList<T> readAll();
    
}
