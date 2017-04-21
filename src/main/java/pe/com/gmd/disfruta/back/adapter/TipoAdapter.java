package pe.com.gmd.disfruta.back.adapter;

import pe.com.gmd.disfruta.back.model.Tipo;
import pe.com.gmd.disfruta.back.transfer.request.TipoRequest;
import pe.com.gmd.disfruta.back.transfer.response.TipoResponse;
public class TipoAdapter {

	public static TipoResponse obtenerTipoResponse(Tipo tipo){
		TipoResponse tipoResponse = new TipoResponse();
		tipoResponse.setIdTipo(tipo.getIdTipo());
		tipoResponse.setNomTipo(tipo.getNomTipo());
		tipoResponse.setDesTipo(tipo.getDesTipo());
		return tipoResponse;
	}
	
	public static Tipo obtenerTipo(TipoRequest tipoRequest){
		Tipo tipo = new Tipo();
		tipo.setIdTipo(tipoRequest.getIdTipo());
		tipo.setNomTipo(tipoRequest.getNomTipo());
		tipo.setDesTipo(tipoRequest.getDesTipo());
			
		return tipo;
	}	
	
}
