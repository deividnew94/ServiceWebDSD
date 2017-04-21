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

import pe.com.gmd.disfruta.back.adapter.EjeAdapter;
import pe.com.gmd.disfruta.back.model.Eje;
import pe.com.gmd.disfruta.back.service.EjeService;
import pe.com.gmd.disfruta.back.transfer.request.EjeRequest;
import pe.com.gmd.disfruta.back.transfer.response.EjeResponse;
import pe.com.gmd.disfruta.back.util.UConstantes;


@Controller
@EnableWebMvc
@RequestMapping(value = "/eje")
public class EjeController {

	@Autowired
	EjeService ejeService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<EjeResponse> listarEje() {
		List<EjeResponse> listaEje = new ArrayList<EjeResponse>();
		Eje filtro = new Eje();		
		filtro.setInEstado(UConstantes.ESTADO_ACTIVO);
		List<Eje> listaAux = ejeService.listarEje(filtro);
		for(Eje eje : listaAux){
			listaEje.add(EjeAdapter.obtenerEjeResponse(eje));
		}
		return listaEje;
	}
	
	@RequestMapping(value = "/{idEje}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody EjeResponse obtenerEje(@PathVariable("idEje")int idEje){		
		Eje filtro = new Eje();
		filtro.setIdEje(idEje);		
		Eje objAux = ejeService.cargarEje(filtro);
		EjeResponse eje = EjeAdapter.obtenerEjeResponse(objAux);
        return eje;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST, headers = "Accept=application/json", produces = "application/json")	
	public @ResponseBody Eje registrarEje(@RequestBody EjeRequest ejeRequest){
		Eje eje = EjeAdapter.obtenerEje(ejeRequest);
		ejeService.registrarEje(eje);
		return eje;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, headers = "Accept=application/json", produces = "application/json")	
	public @ResponseBody Eje actualizarEje(@RequestBody EjeRequest ejeRequest){
		Eje eje = EjeAdapter.obtenerEje(ejeRequest);
		ejeService.actualizarEje(eje);
		return eje;
	}
}
