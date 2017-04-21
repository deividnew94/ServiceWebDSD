package pe.com.gmd.disfruta.back.dao;

import java.util.List;

import pe.com.gmd.disfruta.back.model.Empresa;

public interface EmpresaDao {
	
	List<Empresa> listarEmpresas(Empresa empresa);
	
	Empresa cargarEmpresa(Empresa empresa);
	
	public int registrarEmpresa(Empresa empresa);
	
	public int actualizarEmpresa(Empresa empresa);

}
