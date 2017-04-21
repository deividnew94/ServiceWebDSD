package pe.com.gmd.disfruta.back.controller;

//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import pe.com.gmd.disfruta.back.service.UsuarioService;
import pe.com.gmd.disfruta.back.transfer.request.UsuarioRequest;
import pe.com.gmd.disfruta.back.transfer.response.UsuarioResponse;

@Controller
@EnableWebMvc
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	//private static final Logger logger = Logger.getLogger(UsuarioController.class);
	
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, headers = "Accept=application/json", produces = "application/json")
	public @ResponseBody UsuarioResponse actualizarUsuario(UsuarioRequest usuarioRequest){
		return null;
	}

}
