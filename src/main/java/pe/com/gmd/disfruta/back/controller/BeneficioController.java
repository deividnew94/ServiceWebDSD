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

import pe.com.gmd.disfruta.back.adapter.BeneficioAdapter;
import pe.com.gmd.disfruta.back.model.Beneficio;
import pe.com.gmd.disfruta.back.service.BeneficioService;
import pe.com.gmd.disfruta.back.service.ProveedorService;
import pe.com.gmd.disfruta.back.transfer.request.BeneficioRequest;
import pe.com.gmd.disfruta.back.transfer.response.BeneficioResponse;


@Controller
@EnableWebMvc
@RequestMapping(value = "/beneficio")
public class BeneficioController {

	@Autowired
	BeneficioService beneficioService;
	ProveedorService proveedorService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<BeneficioResponse> listarBeneficios() {
		List<BeneficioResponse> listaBeneficio = new ArrayList<BeneficioResponse>();
		
		Beneficio filtro = new Beneficio();	
		
		
		List<Beneficio> listaAux = beneficioService.listarBeneficios(filtro);
		
		for(Beneficio auxBeneficio : listaAux){
			BeneficioResponse beneficioResponse = BeneficioAdapter.obtenerBeneficioResponse(auxBeneficio);
			listaBeneficio.add(beneficioResponse);
		}
		return listaBeneficio;
	}
	
	@RequestMapping(value = "/eje/{idEje}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<BeneficioResponse> listarBeneficiosEje(@PathVariable("idEje")int idEje) {
		List<BeneficioResponse> listaBeneficio = new ArrayList<BeneficioResponse>();
		
		Beneficio filtro = new Beneficio();	
		filtro.setIdEje(idEje);
		List<Beneficio> listaAux = beneficioService.listarEjeBeneficios(filtro);
		for(Beneficio auxBeneficio : listaAux){
			BeneficioResponse beneficioResponse = BeneficioAdapter.obtenerBeneficioResponse(auxBeneficio);
			listaBeneficio.add(beneficioResponse);
		}
		return listaBeneficio;
	}
	
	@RequestMapping(value = "/tipo/{idTipo}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<BeneficioResponse> listarBeneficiosTipo(@PathVariable("idTipo")int idTipo) {
		List<BeneficioResponse> listaBeneficio = new ArrayList<BeneficioResponse>();
		
		Beneficio filtro = new Beneficio();	
		filtro.setIdTipo(idTipo);
		//filtro.getTipo().setIdTipo(idTipo);
		List<Beneficio> listaAux = beneficioService.listarTipoBeneficios(filtro);
		for(Beneficio auxBeneficio : listaAux){
			BeneficioResponse beneficioResponse = BeneficioAdapter.obtenerBeneficioResponse(auxBeneficio);
			listaBeneficio.add(beneficioResponse);
		}
		return listaBeneficio;
	}
	
	@RequestMapping(value = "/{idBeneficio}", method = RequestMethod.GET)
	public @ResponseBody BeneficioResponse obtenerBeneficio(@PathVariable("idBeneficio")int idBeneficio){	
		BeneficioResponse beneficioResponse = null;
		
		Beneficio filtro = new Beneficio();
		filtro.setIdBeneficio(idBeneficio);
		Beneficio listaAux = beneficioService.cargarBeneficios(filtro);
		if(listaAux.getIdBeneficio() > 0){
			beneficioResponse = BeneficioAdapter.obtenerBeneficioResponse(listaAux);
		}		
        return beneficioResponse;
	}
		
	
	@RequestMapping(value = "/", method = RequestMethod.POST, headers = "Accept=application/json", produces = "application/json")	
	public @ResponseBody Beneficio registrarBeneficio(@RequestBody BeneficioRequest beneficioRequest){	
		Beneficio beneficio = BeneficioAdapter.obtenerBeneficio(beneficioRequest);
		beneficioService.registrarBeneficio(beneficio);
		return beneficio;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, headers = "Accept=application/json", produces = "application/json")	
	public @ResponseBody Beneficio actualizarBeneficio(@RequestBody BeneficioRequest beneficioRequest){
		Beneficio beneficio = BeneficioAdapter.obtenerBeneficio(beneficioRequest);
		beneficioService.actualizarBeneficio(beneficio);
		return beneficio;
	}
	
}
