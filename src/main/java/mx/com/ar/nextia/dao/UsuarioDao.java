package mx.com.ar.nextia.dao;

import mx.com.ar.nextia.domain.Usuario;
import java.util.List;

public interface UsuarioDao {
    
    public List<Usuario> listar();
    
    public void insertar(Usuario usuario);
    
    public void actualizar(Usuario usuario);
    
    public void eliminar(Usuario usuario);
    
    public Usuario login(String username, String password);
    
}
