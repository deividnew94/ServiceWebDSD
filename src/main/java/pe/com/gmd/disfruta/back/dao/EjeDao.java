package pe.com.gmd.disfruta.back.dao;

import java.util.List;

import pe.com.gmd.disfruta.back.model.Eje;

public interface EjeDao {

	public List<Eje> listarEje(Eje eje);
	
	Eje cargarEje(Eje eje);
	
	public int registrarEje(Eje eje);
	
	public int actualizarEje(Eje eje);
	
}
