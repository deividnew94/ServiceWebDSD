package pe.com.gmd.disfruta.back.service;

import java.util.List;

import pe.com.gmd.disfruta.back.model.Empresa;

public interface EmpresaService {

	public List<Empresa> listarEmpresas(Empresa empresa);
	
	public Empresa cargarEmpresa(Empresa empresa);
	
	public int registrarEmpresa(Empresa empresa);

	public int actualizarEmpresa(Empresa empresa);
	
}
