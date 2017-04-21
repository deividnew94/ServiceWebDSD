package pe.com.gmd.disfruta.back.model;

public class Beneficio {

	/*private int idBeneficio;
	private String nomBeneficio;
	private String desBeneficio;
	
	private Eje eje;
	private Proveedor proveedor;*/
	
	
	private Eje eje;
	private int idBeneficio; 
	private int idEmpresa; 
	private int idProveedor; 
	private int idCategoria; 
	private int idEje;
	private int idTipo; 
	private String nomBeneficio; 
	private String desBeneficio; 
	private String anioBeneficio; 
	private String fecInicio;
	private String fecFin;
	private String fonBeneficio; 
	private String resBeneficio; 
	private String inNotificacion;
	private String nomProveedor;
	private String nomEje;
	
	
	
	public String getNomEje() {
		return nomEje;
	}
	public void setNomEje(String nomEje) {
		this.nomEje = nomEje;
	}
	public String getNomProveedor() {
		return nomProveedor;
	}
	public void setNomProveedor(String nomProveedor) {
		this.nomProveedor = nomProveedor;
	}
	public Eje getEje() {
		return eje;
	}
	public void setEje(Eje eje) {
		this.eje = eje;
	}

	public int getIdBeneficio() {
		return idBeneficio;
	}
	public void setIdBeneficio(int idBeneficio) {
		this.idBeneficio = idBeneficio;
	}
	public int getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public int getIdEje() {
		return idEje;
	}
	public void setIdEje(int idEje) {
		this.idEje = idEje;
	}
	public int getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	public String getNomBeneficio() {
		return nomBeneficio;
	}
	public void setNomBeneficio(String nomBeneficio) {
		this.nomBeneficio = nomBeneficio;
	}
	public String getDesBeneficio() {
		return desBeneficio;
	}
	public void setDesBeneficio(String desBeneficio) {
		this.desBeneficio = desBeneficio;
	}
	public String getAnioBeneficio() {
		return anioBeneficio;
	}
	public void setAnioBeneficio(String anioBeneficio) {
		this.anioBeneficio = anioBeneficio;
	}
	public String getFecInicio() {
		return fecInicio;
	}
	public void setFecInicio(String fecInicio) {
		this.fecInicio = fecInicio;
	}
	public String getFecFin() {
		return fecFin;
	}
	public void setFecFin(String fecFin) {
		this.fecFin = fecFin;
	}
	public String getFonBeneficio() {
		return fonBeneficio;
	}
	public void setFonBeneficio(String fonBeneficio) {
		this.fonBeneficio = fonBeneficio;
	}
	public String getResBeneficio() {
		return resBeneficio;
	}
	public void setResBeneficio(String resBeneficio) {
		this.resBeneficio = resBeneficio;
	}
	public String getInNotificacion() {
		return inNotificacion;
	}
	public void setInNotificacion(String inNotificacion) {
		this.inNotificacion = inNotificacion;
	}
}
