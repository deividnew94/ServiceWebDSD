package pe.com.gmd.disfruta.back.adapter;

import pe.com.gmd.disfruta.back.model.Usuario;
import pe.com.gmd.disfruta.back.transfer.response.UsuarioResponse;

public class UsuarioAdapter {

	public static UsuarioResponse obtenerUsuarioResponse(Usuario usuario){
		UsuarioResponse usuarioResponse = new UsuarioResponse();
		usuarioResponse.setIdUsuario(usuario.getIdUsuario());
		usuarioResponse.setIdEmpresa(usuario.getEmpresa().getIdEmpresa());
		usuarioResponse.setNomUsuario(usuario.getNomUsuario());
		usuarioResponse.setNomEmpresa(usuario.getEmpresa().getNomEmpresa());
		
		usuarioResponse.setLogiUsuario(usuario.getLogiUsuario());
		usuarioResponse.setApeUsuario(usuario.getApeUsuario());
		usuarioResponse.setImgUsuario(usuario.getImgUsuario());

		return usuarioResponse;
		
	}
	
}
