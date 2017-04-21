package pe.com.gmd.disfruta.back.adapter;

import pe.com.gmd.disfruta.back.model.Beneficio;
import pe.com.gmd.disfruta.back.transfer.request.BeneficioRequest;
import pe.com.gmd.disfruta.back.transfer.response.BeneficioResponse;

public class BeneficioAdapter {

	public static BeneficioResponse obtenerBeneficioResponse(Beneficio beneficio){
		BeneficioResponse beneficioResponse = new BeneficioResponse();
		beneficioResponse.setIdBeneficio(beneficio.getIdBeneficio());
		beneficioResponse.setIdEmpresa(beneficio.getIdEmpresa());
		beneficioResponse.setIdProveedor(beneficio.getIdProveedor());
		beneficioResponse.setIdCategoria(beneficio.getIdCategoria());
		beneficioResponse.setIdEje(beneficio.getIdEje());
		beneficioResponse.setIdTipo(beneficio.getIdTipo());
		
		beneficioResponse.setNomBeneficio(beneficio.getNomBeneficio());
		beneficioResponse.setDesBeneficio(beneficio.getDesBeneficio());
		beneficioResponse.setAnioBeneficio(beneficio.getAnioBeneficio());
		beneficioResponse.setFecInicio(beneficio.getFecInicio());
		beneficioResponse.setFecFin(beneficio.getFecFin());
		beneficioResponse.setFonBeneficio(beneficio.getFonBeneficio());
		beneficioResponse.setResBeneficio(beneficio.getResBeneficio());
		beneficioResponse.setInNotificacion(beneficio.getInNotificacion());
		
		beneficioResponse.setNomProveedor(beneficio.getNomProveedor());
		beneficioResponse.setNomEje(beneficio.getNomEje());
		
		return beneficioResponse;
	}
	
	public static Beneficio obtenerBeneficio(BeneficioRequest beneficioRequest){
		Beneficio beneficio = new Beneficio();
		beneficio.setIdBeneficio(beneficioRequest.getIdBeneficio());
		beneficio.setIdEmpresa(beneficioRequest.getIdEmpresa());
		beneficio.setIdProveedor(beneficioRequest.getIdProveedor());
		beneficio.setIdCategoria(beneficioRequest.getIdCategoria());
		beneficio.setIdEje(beneficioRequest.getIdEje());
		beneficio.setIdTipo(beneficioRequest.getIdTipo());
		
		beneficio.setNomBeneficio(beneficioRequest.getNomBeneficio());
		beneficio.setDesBeneficio(beneficioRequest.getDesBeneficio());
		beneficio.setAnioBeneficio(beneficioRequest.getAnioBeneficio());
		beneficio.setFecInicio(beneficioRequest.getFecInicio());
		beneficio.setFecFin(beneficioRequest.getFecFin());
		beneficio.setFonBeneficio(beneficioRequest.getFonBeneficio());
		beneficio.setResBeneficio(beneficioRequest.getResBeneficio());
		beneficio.setInNotificacion(beneficioRequest.getInNotificacion());
		return beneficio;
	}
	
}
