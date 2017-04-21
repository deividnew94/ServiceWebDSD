package pe.com.gmd.disfruta.back.dao;

import java.util.List;

import pe.com.gmd.disfruta.back.model.Tipo;

public interface TipoDao {

	public List<Tipo> listarTipo(Tipo tipo);
	
	Tipo cargarTipo(Tipo tipo);
	
	public int registrarTipo(Tipo tipo);
	
	public int actualizarTipo(Tipo tipo);
	
}
