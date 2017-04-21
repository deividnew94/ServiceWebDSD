package pe.com.gmd.disfruta.back.adapter;

import pe.com.gmd.disfruta.back.model.Eje;
import pe.com.gmd.disfruta.back.transfer.request.EjeRequest;
import pe.com.gmd.disfruta.back.transfer.response.EjeResponse;
public class EjeAdapter {

	public static EjeResponse obtenerEjeResponse(Eje eje){
		EjeResponse ejeResponse = new EjeResponse();
		ejeResponse.setIdEje(eje.getIdEje());
		ejeResponse.setNomEje(eje.getNomEje());
		ejeResponse.setDesEje(eje.getDesEje());
		ejeResponse.setImgEje(eje.getImgEje());
		ejeResponse.setFecEje(eje.getFecEje());
		return ejeResponse;
	}
	
	public static Eje obtenerEje(EjeRequest ejeRequest){
		Eje eje = new Eje();
		eje.setIdEje(ejeRequest.getIdEje());
		eje.setNomEje(ejeRequest.getNomEje());
		eje.setDesEje(ejeRequest.getDesEje());
		eje.setImgEje(ejeRequest.getImgEje());
		eje.setFecEje(ejeRequest.getFecEje());		
		return eje;
	}	
	
}
