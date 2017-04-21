package pe.com.gmd.disfruta.back.service;

import java.util.List;
import pe.com.gmd.disfruta.back.model.Tipo;

public interface TipoService {
	
	public List<Tipo> listarTipo(Tipo tipo);
	
	public Tipo cargarTipo(Tipo tipo);
	
	public int registrarTipo(Tipo tipo);

	public int actualizarTipo(Tipo tipo);
}
