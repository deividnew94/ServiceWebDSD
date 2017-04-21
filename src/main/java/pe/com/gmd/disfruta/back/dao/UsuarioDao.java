package pe.com.gmd.disfruta.back.dao;

import java.util.List;

import pe.com.gmd.disfruta.back.model.Usuario;

public interface UsuarioDao {

	List<Usuario> listarUsuarios(Usuario usuario);
	
	Usuario cargarUsuario(Usuario usuario);
	
}
