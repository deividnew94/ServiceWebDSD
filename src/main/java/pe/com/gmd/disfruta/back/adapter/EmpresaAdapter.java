package pe.com.gmd.disfruta.back.adapter;

import pe.com.gmd.disfruta.back.model.Empresa;
import pe.com.gmd.disfruta.back.transfer.request.EmpresaRequest;
import pe.com.gmd.disfruta.back.transfer.response.EmpresaResponse;

public class EmpresaAdapter {

	public static EmpresaResponse obtenerEmpresaResponse(Empresa empresa){
		EmpresaResponse empresaResponse = new EmpresaResponse();
		empresaResponse.setIdEmpresa(empresa.getIdEmpresa());
		empresaResponse.setNomEmpresa(empresa.getNomEmpresa());
		empresaResponse.setDesEmpresa(empresa.getDesEmpresa());
		empresaResponse.setUrlLogo(empresa.getUrlLogo());
		empresaResponse.setNumSoporte(empresa.getNumSoporte());
		empresaResponse.setNomSkype(empresa.getNomSkype());
		empresaResponse.setInClave(empresa.getInClave());
		return empresaResponse;
	}
	
	public static Empresa obtenerEmpresa(EmpresaRequest empresaRequest){
		Empresa empresa = new Empresa();
		empresa.setIdEmpresa(empresaRequest.getIdEmpresa());
		empresa.setNomEmpresa(empresaRequest.getNomEmpresa()); 
		empresa.setDesEmpresa(empresaRequest.getDesEmpresa());
		empresa.setUrlLogo(empresaRequest.getUrlLogo());
		empresa.setNumSoporte(empresaRequest.getNumSoporte());
		empresa.setNomSkype(empresaRequest.getNomSkype());		
		return empresa;
	}	
	
}
