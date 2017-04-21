package pe.com.gmd.disfruta.back.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.gmd.disfruta.back.dao.EmpresaDao;
import pe.com.gmd.disfruta.back.dao.UsuarioDao;
import pe.com.gmd.disfruta.back.model.Empresa;
import pe.com.gmd.disfruta.back.model.Usuario;
import pe.com.gmd.disfruta.back.service.UsuarioService;
import pe.com.gmd.disfruta.back.util.LDapUtil;


@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	EmpresaDao empresaDao;

	@Autowired
	UsuarioDao usuarioDao;
	
	public Usuario loginUsuario(Usuario usuario) throws Exception{
		Usuario user = null;
				
		Empresa empresa = empresaDao.cargarEmpresa(usuario.getEmpresa());		
		LDapUtil ldapUtil = new LDapUtil(empresa);
		boolean existeUsuario = ldapUtil.loginUsuario(usuario.getLogiUsuario(), usuario.getPassUsuario());
		if(existeUsuario){
			Usuario filtro = new Usuario();
			filtro.setLogiUsuario(usuario.getLogiUsuario());
			user = usuarioDao.cargarUsuario(filtro);
			//empresa.getDesEmpresa()
			user.setEmpresa(empresa);
			//ldapUtil.obtenerUsuario("");
			/*user = new Usuario();
			user.setIdUsuario(1);
			user.setNomUsuario("rhuamani");			
			empresa.setNomEmpresa("GMD S.A.");
			user.setEmpresa(empresa);*/
		}
		return user;
	}
	
}
