package pe.com.gmd.disfruta.back.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import pe.com.gmd.disfruta.back.adapter.TipoAdapter;
import pe.com.gmd.disfruta.back.model.Tipo;
import pe.com.gmd.disfruta.back.service.TipoService;
import pe.com.gmd.disfruta.back.transfer.request.TipoRequest;
import pe.com.gmd.disfruta.back.transfer.response.TipoResponse;
import pe.com.gmd.disfruta.back.util.UConstantes;


@Controller
@EnableWebMvc
@RequestMapping(value = "/tipo")
public class TipoController {

	@Autowired
	TipoService tipoService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<TipoResponse> listarEje() {
		List<TipoResponse> listaTipo = new ArrayList<TipoResponse>();
		Tipo filtro = new Tipo();		
		filtro.setInEstado(UConstantes.ESTADO_ACTIVO);
		List<Tipo> listaAux = tipoService.listarTipo(filtro);
		for(Tipo tipo : listaAux){
			listaTipo.add(TipoAdapter.obtenerTipoResponse(tipo));
		}
		return listaTipo;
	}
	
	@RequestMapping(value = "/{idTipo}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody TipoResponse obtenerTipo(@PathVariable("idTipo")int idTipo){		
		Tipo filtro = new Tipo();
		filtro.setIdTipo(idTipo);		
		Tipo objAux = tipoService.cargarTipo(filtro);
		TipoResponse tipo = TipoAdapter.obtenerTipoResponse(objAux);
        return tipo;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST, headers = "Accept=application/json", produces = "application/json")	
	public @ResponseBody Tipo registrarTipo(@RequestBody TipoRequest tipoRequest){
		Tipo tipo = TipoAdapter.obtenerTipo(tipoRequest);
		tipoService.registrarTipo(tipo);
		return tipo;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, headers = "Accept=application/json", produces = "application/json")	
	public @ResponseBody Tipo actualizarTipo(@RequestBody TipoRequest tipoRequest){
		Tipo tipo = TipoAdapter.obtenerTipo(tipoRequest);
		tipoService.actualizarTipo(tipo);
		return tipo;
	}
}
