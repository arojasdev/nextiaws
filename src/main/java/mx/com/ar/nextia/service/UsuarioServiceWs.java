package mx.com.ar.nextia.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import mx.com.ar.nextia.domain.Usuario;

@WebService
public interface UsuarioServiceWs {
    
    @WebMethod
    public List<Usuario> listar();
    
    @WebMethod
    public void insertar(Usuario usuario);
    
    @WebMethod
    public void actualizar(Usuario usuario);
    
    @WebMethod
    public void eliminar(Usuario usuario);
    
    @WebMethod
    public Usuario login(String username, String password);
    
}
