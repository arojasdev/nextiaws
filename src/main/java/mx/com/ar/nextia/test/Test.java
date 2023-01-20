package mx.com.ar.nextia.test;

import java.util.List;
import javax.inject.Inject;
import mx.com.ar.nextia.domain.Usuario;
import mx.com.ar.nextia.service.UsuarioService;
import mx.com.ar.nextia.service.UsuarioServiceImpl;

public class Test {
    
    
    
    public static void main(String[] args) {
        
        //@Inject
        //UsuarioService us;
        
        /*Usuario usuarios = new Usuario();
        
        usuarios = us.login("admin", "1234");
        
        if(usuarios != null) {
            System.out.println("Login exitoso " + usuarios.getUsername());
        } else {
            System.out.println("Login fallo");
        }*/
        
        //usuarios = us.listar();
        //mostrarLista(usuarios);
        
        //Usuario nuevoUsuario = new Usuario();
        //nuevoUsuario.setUsername("Prueba");
        //nuevoUsuario.setPassword("Prueba");
        //us.insertar(nuevoUsuario);

        
        //Usuario user = usuarios.get(1);
        //user.setUsername("modificado");
        //us.actualizar(user);
        
        //Usuario user = usuarios.get(1);
        //us.eliminar(user);
        
    }
    
    public static void mostrarLista(List<Usuario> usuarios) {
        System.out.println("***************");
        for(Usuario user : usuarios) {
            System.out.println(user.getUsername());
        }
    }
}
