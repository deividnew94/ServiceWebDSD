package pe.com.gmd.disfruta.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.gmd.disfruta.back.dao.EjeDao;
import pe.com.gmd.disfruta.back.model.Eje;
import pe.com.gmd.disfruta.back.service.EjeService;

@Service("EjeService")
public class EjeServiceImpl implements EjeService {

	@Autowired
	EjeDao ejeDao;
	
	public List<Eje> listarEje(Eje eje){
		List<Eje> listaEje = ejeDao.listarEje(eje);
		return listaEje;
	}
	
	public Eje cargarEje(Eje eje){
		Eje objEje = ejeDao.cargarEje(eje);
		return objEje;
	}
	
	public int registrarEje(Eje eje){
		int result = ejeDao.registrarEje(eje);
		return result;
	}
	
	public int actualizarEje(Eje eje){
		int result = ejeDao.actualizarEje(eje);
		return result;
	}
	
}
