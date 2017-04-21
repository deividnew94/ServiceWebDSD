package pe.com.gmd.disfruta.back.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.gmd.disfruta.back.dao.BeneficioDao;
import pe.com.gmd.disfruta.back.model.Beneficio;
import pe.com.gmd.disfruta.back.service.BeneficioService;

@Service("BeneficioService")
public class BeneficioServiceImpl implements BeneficioService {
	
	@Autowired
	BeneficioDao beneficioDao;

	public List<Beneficio> listarBeneficios(Beneficio beneficio) {
		List<Beneficio> listaBeneficio = beneficioDao.listarBeneficios(beneficio);
		return listaBeneficio;
	}

	
	public Beneficio cargarBeneficios(Beneficio beneficio){
		Beneficio objBeneficio = beneficioDao.cargarBeneficios(beneficio);
		return objBeneficio;
	}
	
	public List<Beneficio> listarEjeBeneficios(Beneficio beneficio){
		List<Beneficio> listaBeneficio = beneficioDao.listarEjeBeneficios(beneficio);
		return listaBeneficio;
	}
	
	public List<Beneficio> listarTipoBeneficios(Beneficio beneficio){
		List<Beneficio> listaBeneficio = beneficioDao.listarTipoBeneficios(beneficio);
		return listaBeneficio;
	}
	

	public int registrarBeneficio(Beneficio beneficio) {
		int result = beneficioDao.registrarBeneficio(beneficio);
		return result;
	}

	public int actualizarBeneficio(Beneficio beneficio) {
		int result = beneficioDao.actualizarBeneficio(beneficio);
		return result;
	}
	
}
