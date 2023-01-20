package mx.com.ar.nextia.service;

import java.util.List;
import javax.ejb.Remote;
import mx.com.ar.nextia.domain.Usuario;

@Remote
public interface UsuarioServiceRemote {
    
    public List<Usuario> listar();
    
    public void insertar(Usuario usuario);
    
    public void actualizar(Usuario usuario);
    
    public void eliminar(Usuario usuario);
    
    public Usuario login(String username, String password);
    
}
