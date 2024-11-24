package ar.edu.utn.frc.backend.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbContext {

    private static DbContext instance=null;
    private EntityManager entityManager;

    private DbContext(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("academico");
        entityManager = emf.createEntityManager();

    }

    public static DbContext getInstance() {
        if (instance == null) {
            instance = new DbContext();
        }
        return instance;
    }

}
