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
import pe.com.gmd.disfruta.back.service.ProveedorService;
import pe.com.gmd.disfruta.back.transfer.request.ProveedorRequest;
import pe.com.gmd.disfruta.back.transfer.response.EmpresaResponse;
import pe.com.gmd.disfruta.back.transfer.response.ProveedorResponse;
import pe.com.gmd.disfruta.back.util.UConstantes;

@Controller
@EnableWebMvc
@RequestMapping(value = "/proveedor")
public class ProveedorController {
	
	@Autowired
	ProveedorService proveedorService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<ProveedorResponse> listarProveedores() {
		List<ProveedorResponse> listaProveedor = new ArrayList<ProveedorResponse>();
		Proveedor filtro = new Proveedor();
		//filtro.setInEstado(UConstantes.ESTADO_ACTIVO);
		List<Proveedor> listaAux = proveedorService.listarProveedores(filtro);
		for(Proveedor aux : listaAux){
			listaProveedor.add(ProveedorAdapter.obtenerProveedorResponse(aux));
		}
		return listaProveedor;
	}
	
	@RequestMapping(value = "/{idProveedor}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Proveedor obtenerProveedor(@PathVariable("idProveedor")int idProveedor){
		Proveedor filtro = new Proveedor();
		filtro.setIdProveedor(idProveedor);
		Proveedor proveedor  = proveedorService.cargarProveedor(filtro);
        return proveedor;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST, headers = "Accept=application/json", produces = "application/json")	
	public @ResponseBody Proveedor registrarProveedor(@RequestBody ProveedorRequest proveedorRequest){
		Proveedor proveedor = ProveedorAdapter.obtenerProveedor(proveedorRequest);
		proveedorService.registrarProveedor(proveedor);
		
		return proveedor;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT, headers = "Accept=application/json", produces = "application/json")	
	public @ResponseBody Proveedor actualizarProveedor(@RequestBody ProveedorRequest proveedorRequest){
		Proveedor proveedor = ProveedorAdapter.obtenerProveedor(proveedorRequest);
		proveedorService.actualizarProveedor(proveedor);
		return proveedor;
	}
}
