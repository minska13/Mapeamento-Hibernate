package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Yasmin
 * @param <E>
 */
public abstract class DAO<E> {
    protected EntityManager entityManager;
	 
    public DAO() {
        entityManager = getEntityManager();
    }
 
    private EntityManager getEntityManager() {
        
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernate-example");
    	
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
 
        return entityManager;
    }
 
    public abstract List<E> findAll();
 
    public boolean persist(E object) {
    	
    	boolean result = true;
    	
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(object);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            result = false;
        }
        
        return result;
    }
 
    public boolean merge(E object) {
    	
    	boolean result = true;
    	
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(object);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            result = false;
        }
        
        return result;
    }
 
    public boolean remove(E object) {
    	
    	boolean result = true;
    	
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(object);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            result = false;
        }
        
        return result;
    }

	public abstract E getById(final Long id);
    
    public abstract boolean removeById(final Long id);
}