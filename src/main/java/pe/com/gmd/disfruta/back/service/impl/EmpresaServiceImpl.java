package pe.com.gmd.disfruta.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.gmd.disfruta.back.dao.EmpresaDao;
import pe.com.gmd.disfruta.back.model.Empresa;
import pe.com.gmd.disfruta.back.service.EmpresaService;

@Service("EmpresaService")
public class EmpresaServiceImpl implements EmpresaService {

	@Autowired
	EmpresaDao empresaDao;
	
	public List<Empresa> listarEmpresas(Empresa empresa){
		List<Empresa> listaEmpresas = empresaDao.listarEmpresas(empresa);
		return listaEmpresas;
	}
	
	public Empresa cargarEmpresa(Empresa empresa){
		Empresa objEmpresa = empresaDao.cargarEmpresa(empresa);
		return objEmpresa;
	}
	
	public int registrarEmpresa(Empresa empresa){
		int result = empresaDao.registrarEmpresa(empresa);
		return result;
	}
	
	public int actualizarEmpresa(Empresa empresa){
		int result = empresaDao.actualizarEmpresa(empresa);
		return result;
	}
	
	
}
