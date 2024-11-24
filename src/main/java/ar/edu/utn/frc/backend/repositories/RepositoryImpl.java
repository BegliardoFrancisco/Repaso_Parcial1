package ar.edu.utn.frc.backend.repositories;

public abstract class RepositoryImpl <T,K> implements Repository<T,K>{

    private DbContext context;

    public RepositoryImpl() {
        context = DbContext.getInstance();
    }

}
