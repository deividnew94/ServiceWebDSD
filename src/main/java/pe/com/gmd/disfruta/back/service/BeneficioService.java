package pe.com.gmd.disfruta.back.service;

import java.util.List;

import pe.com.gmd.disfruta.back.model.Beneficio;

public interface BeneficioService {
	
	public List<Beneficio> listarBeneficios(Beneficio beneficio);
	
	public Beneficio cargarBeneficios(Beneficio beneficio);
	
	public List<Beneficio> listarEjeBeneficios(Beneficio beneficio);
	
	public List<Beneficio> listarTipoBeneficios(Beneficio beneficio);
	
	public int registrarBeneficio(Beneficio beneficio);
	
	public int actualizarBeneficio(Beneficio beneficio);

}
