package pe.com.gmd.disfruta.back.service;

import java.util.List;
import pe.com.gmd.disfruta.back.model.Proveedor;

public interface ProveedorService {

	public List<Proveedor> listarProveedores(Proveedor proveedor);
	
	public Proveedor cargarProveedor(Proveedor proveedor);
	
	public int registrarProveedor(Proveedor proveedor);

	public int actualizarProveedor(Proveedor proveedor);
}
