package pe.com.gmd.disfruta.back.model;

public class Empresa {

	private int idEmpresa;
	private String nomEmpresa;
	private String desEmpresa;
	private String urlLogo;
	private String numSoporte;
	private String nomSkype;
	private String inClave;
	private String inEstado;
	private Ldap ldap;
	
	public Empresa(){
		ldap = new Ldap();
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNomEmpresa() {
		return nomEmpresa;
	}

	public void setNomEmpresa(String nomEmpresa) {
		this.nomEmpresa = nomEmpresa;
	}
	
	public String getDesEmpresa(){
		return desEmpresa;
	}
	
	public void setDesEmpresa(String desEmpresa){
		this.desEmpresa = desEmpresa;
	}

	public String getUrlLogo() {
		return urlLogo;
	}

	public void setUrlLogo(String urlLogo) {
		this.urlLogo = urlLogo;
	}

	public String getNumSoporte() {
		return numSoporte;
	}

	public void setNumSoporte(String numSoporte) {
		this.numSoporte = numSoporte;
	}

	public String getNomSkype() {
		return nomSkype;
	}

	public void setNomSkype(String nomSkype) {
		this.nomSkype = nomSkype;
	}

	public String getInClave() {
		return inClave;
	}

	public void setInClave(String inClave) {
		this.inClave = inClave;
	}
	
	public String getInEstado(){
		return inEstado;
	}
	
	public void setInEstado(String inEstado){
		this.inEstado = inEstado;
	}

	public Ldap getLdap() {
		return ldap;
	}

	public void setLdap(Ldap ldap) {
		this.ldap = ldap;
	}	
	
}
