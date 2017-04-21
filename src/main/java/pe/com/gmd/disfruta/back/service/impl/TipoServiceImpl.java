package pe.com.gmd.disfruta.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.gmd.disfruta.back.dao.TipoDao;
import pe.com.gmd.disfruta.back.model.Tipo;
import pe.com.gmd.disfruta.back.service.TipoService;

@Service("TipoService")
public class TipoServiceImpl implements TipoService {

	@Autowired
	TipoDao tipoDao;
	
	public List<Tipo> listarTipo(Tipo tipo){
		List<Tipo> listaTipo = tipoDao.listarTipo(tipo);
		return listaTipo;
	}
	
	public Tipo cargarTipo(Tipo tipo){
		Tipo objTipo = tipoDao.cargarTipo(tipo);
		return objTipo;
	}
	
	public int registrarTipo(Tipo tipo){
		int result = tipoDao.registrarTipo(tipo);
		return result;
	}
	
	public int actualizarTipo(Tipo tipo){
		int result = tipoDao.actualizarTipo(tipo);
		return result;
	}
	
}
