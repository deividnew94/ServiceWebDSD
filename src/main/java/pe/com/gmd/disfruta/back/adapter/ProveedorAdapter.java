package pe.com.gmd.disfruta.back.adapter;

import pe.com.gmd.disfruta.back.model.Proveedor;
import pe.com.gmd.disfruta.back.transfer.request.ProveedorRequest;
import pe.com.gmd.disfruta.back.transfer.response.ProveedorResponse;

public class ProveedorAdapter {

	public static ProveedorResponse obtenerProveedorResponse(Proveedor proveedor){
		ProveedorResponse proveedorResponse = new ProveedorResponse();
		proveedorResponse.setIdProveedor(proveedor.getIdProveedor());
		proveedorResponse.setNomProveedor(proveedor.getNomProveedor());
		proveedorResponse.setDesProveedor(proveedor.getDesProveedor());
		proveedorResponse.setUrlProveedor(proveedor.getUrlProveedor());
		proveedorResponse.setNumTelefono(proveedor.getNumTelefono());
	
		return proveedorResponse;
	}
	
	public static Proveedor obtenerProveedor(ProveedorRequest proveedorRequest){
		Proveedor proveedor = new Proveedor();
		proveedor.setIdProveedor(proveedorRequest.getIdProveedor());
		proveedor.setNomProveedor(proveedorRequest.getNomProveedor()); 
		proveedor.setDesProveedor(proveedorRequest.getDesProveedor());
		proveedor.setUrlProveedor(proveedorRequest.getUrlProveedor());
		proveedor.setNumTelefono(proveedorRequest.getNumTelefono());
		return proveedor;
	}	
}
