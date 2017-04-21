package pe.com.gmd.disfruta.back.dao;

import java.util.List;

import pe.com.gmd.disfruta.back.model.Proveedor;

public interface ProveedorDao {
	
	public List<Proveedor> listarProveedores(Proveedor proveedor);
	
	Proveedor cargarProveedor(Proveedor proveedor);
	
	public int registrarProveedor(Proveedor proveedor);
	
	public int actualizarProveedor(Proveedor proveedor);

}
