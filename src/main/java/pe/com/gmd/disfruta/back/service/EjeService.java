package pe.com.gmd.disfruta.back.service;

import java.util.List;

import pe.com.gmd.disfruta.back.model.Eje;

public interface EjeService {
	
	public List<Eje> listarEje(Eje eje);
	
	public Eje cargarEje(Eje eje);
	
	public int registrarEje(Eje eje);

	public int actualizarEje(Eje eje);
}
