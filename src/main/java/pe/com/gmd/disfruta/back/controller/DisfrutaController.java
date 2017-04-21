package pe.com.gmd.disfruta.back.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import pe.com.gmd.disfruta.back.adapter.UsuarioAdapter;
import pe.com.gmd.disfruta.back.model.Usuario;
import pe.com.gmd.disfruta.back.service.UsuarioService;
import pe.com.gmd.disfruta.back.transfer.request.UsuarioRequest;
import pe.com.gmd.disfruta.back.transfer.response.UsuarioResponse;

@Controller
@EnableWebMvc
@RequestMapping(value = "/")
public class DisfrutaController {

	private static final Logger logger = Logger.getLogger(UsuarioController.class);
	
	@Autowired
	UsuarioService usuarioService;

	@RequestMapping(value = "login/", method = RequestMethod.POST, headers = "Accept=application/json", produces = "application/json")
	public @ResponseBody UsuarioResponse loginUsuario(@RequestBody UsuarioRequest usuarioRequest){
		UsuarioResponse usuarioResponse = new UsuarioResponse();
		try{
			Usuario filtro = new Usuario();
			filtro.setLogiUsuario(usuarioRequest.getNomUsuario());
			filtro.setPassUsuario(usuarioRequest.getPassUsuario());
			filtro.getEmpresa().setIdEmpresa(usuarioRequest.getIdEmpresa());
			Usuario usuario = usuarioService.loginUsuario(filtro);
			
			if(usuario != null){
				usuarioResponse = UsuarioAdapter.obtenerUsuarioResponse(usuario);				
			}
		}
		catch(Exception e){
			logger.error("Ocurrió un error en loginUsuario - UsuarioController : "+e.getMessage());
		}
		return usuarioResponse;
	}
}
