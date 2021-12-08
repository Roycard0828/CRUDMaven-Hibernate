
package org.uv.data;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.uv.HibernateUtil;

/**
 *
 * @author rodrigo08
 */
public class DaoEmpleado implements DaoGeneral<Empleado>{

    @Override
    public boolean add(Empleado pojo) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        
        session.save(pojo);
        t.commit();
        return true;
    }

    @Override
    public boolean delete(Empleado pojo) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        
        session.delete(pojo);
        t.commit();
        return true;
    }

    @Override
    public boolean update(Empleado pojo) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        
        session.update(pojo);
        t.commit();
        return true;
    }

    @Override
    public Empleado read(String Cod_emp) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        
        Criteria crit = session.createCriteria(Empleado.class).add(Restrictions.eq("cod_emp", Cod_emp));
        List result=crit.list();
        t.commit();
        
        return (Empleado)result.get(0);
        
    }

    @Override
    public ArrayList<Empleado> readAll() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction t = session.beginTransaction();
        
        ArrayList<Empleado> list = null;
        try {
            list = (ArrayList<Empleado>)session.createQuery("from org.uv.data.Empleado").list();
            
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        
        t.commit();
        
        
        return list;
        
    }

    
    
}
