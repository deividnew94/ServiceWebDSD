package pe.com.gmd.disfruta.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.gmd.disfruta.back.dao.ProveedorDao;
import pe.com.gmd.disfruta.back.model.Proveedor;
import pe.com.gmd.disfruta.back.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService {
	@Autowired
	ProveedorDao proveedorDao;
	public List<Proveedor> listarProveedores(Proveedor proveedor){
		List<Proveedor> listaEmpresas = proveedorDao.listarProveedores(proveedor);
		return listaEmpresas;
		
		//return null;
	}
	
	public Proveedor cargarProveedor(Proveedor proveedor){
		
		Proveedor objProveedor = proveedorDao.cargarProveedor(proveedor);
		return objProveedor;
	}
	
	public int registrarProveedor(Proveedor proveedor){
		int result = proveedorDao.registrarProveedor(proveedor);
		return result;
	}
	
	public int actualizarProveedor(Proveedor proveedor){
		int result = proveedorDao.actualizarProveedor(proveedor);
		return result;
	}
	
}
