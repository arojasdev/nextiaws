package mx.com.ar.nextia.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import mx.com.ar.nextia.domain.Usuario;

@Stateless
public class UsuarioDaoImpl implements UsuarioDao {
    
    @PersistenceContext(unitName="NextiaPU")
    EntityManager em;

    @Override
    public List<Usuario> listar() {
        return em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public void insertar(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public void actualizar(Usuario usuario) {
         em.merge(usuario);
    }

    @Override
    public void eliminar(Usuario usuario) {
        em.remove(usuario);
    }

    @Override
    public Usuario login(String username, String password) {
        Query query = em.createQuery("FROM Usuario u WHERE u.username = :username and u.password = :password");
        query.setParameter("username", username);
        query.setParameter("password", password);
        return (Usuario) query.getSingleResult();
    }
    
}
