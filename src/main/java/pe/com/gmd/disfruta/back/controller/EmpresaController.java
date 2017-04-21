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

import pe.com.gmd.disfruta.back.adapter.EmpresaAdapter;
import pe.com.gmd.disfruta.back.adapter.ProveedorAdapter;
import pe.com.gmd.disfruta.back.model.Empresa;
import pe.com.gmd.disfruta.back.model.Proveedor;
import pe.com.gmd.disfruta.back.service.EmpresaService;
import pe.com.gmd.disfruta.back.transfer.request.EmpresaRequest;
import pe.com.gmd.disfruta.back.transfer.request.ProveedorRequest;
import pe.com.gmd.disfruta.back.transfer.response.EmpresaResponse;
import pe.com.gmd.disfruta.back.util.UConstantes;


@Controller
@EnableWebMvc
@RequestMapping(value = "/empresa")
public class EmpresaController {

	@Autowired
	EmpresaService empresaService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<EmpresaResponse> listarEmpresas() {
		List<EmpresaResponse> listaEmpresas = new ArrayList<EmpresaResponse>();
		Empresa filtro = new Empresa();		
		filtro.setInEstado(UConstantes.ESTADO_ACTIVO);
		List<Empresa> listaAux = empresaService.listarEmpresas(filtro);
		for(Empresa empresa : listaAux){
			listaEmpresas.add(EmpresaAdapter.obtenerEmpresaResponse(empresa));
		}
		return listaEmpresas;
	}
	
	@RequestMapping(value = "/{idEmpresa}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody EmpresaResponse obtenerEmpresa(@PathVariable("idEmpresa")int idEmpresa){		
		Empresa filtro = new Empresa();
		filtro.setIdEmpresa(idEmpresa);		
		Empresa objAux = empresaService.cargarEmpresa(filtro);
		EmpresaResponse empresa = EmpresaAdapter.obtenerEmpresaResponse(objAux);
        return empresa;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST, headers = "Accept=application/json", produces = "application/json")	
	public @ResponseBody Empresa registrarEmpresa(@RequestBody EmpresaRequest empresaRequest){
		Empresa empresa = EmpresaAdapter.obtenerEmpresa(empresaRequest);
		empresaService.registrarEmpresa(empresa);
		return empresa;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, headers = "Accept=application/json", produces = "application/json")	
	public @ResponseBody Empresa actualizarEmpresa(@RequestBody EmpresaRequest empresaRequest){
		Empresa empresa = EmpresaAdapter.obtenerEmpresa(empresaRequest);
		empresaService.actualizarEmpresa(empresa);
		return empresa;
	}
}
