package mx.com.ar.nextia.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import mx.com.ar.nextia.dao.UsuarioDao;
import mx.com.ar.nextia.domain.Usuario;

@Stateless
@WebService(endpointInterface = "mx.com.ar.nextia.service.UsuarioServiceWs")
public class UsuarioServiceImpl implements UsuarioService, UsuarioServiceRemote, UsuarioServiceWs {
    
    @Inject
    private UsuarioDao usuarioDAO;

    @Override
    public List<Usuario> listar() {
        return usuarioDAO.listar();
    }

    @Override
    public void insertar(Usuario usuario) {
        usuarioDAO.insertar(usuario);
    }

    @Override
    public void actualizar(Usuario usuario) {
        usuarioDAO.actualizar(usuario);
    }

    @Override
    public void eliminar(Usuario usuario) {
        usuarioDAO.eliminar(usuario);
    }

    @Override
    public Usuario login(String username, String password) {
        return usuarioDAO.login(username, password);
    }
    
}