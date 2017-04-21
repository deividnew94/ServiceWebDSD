package pe.com.gmd.disfruta.back.model;

public class Producto {

	private int idProducto;
	private int idProveedor;
	private String nomProducto;
	private String desProducto;
	private String inEstado;
	
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getNomProducto() {
		return nomProducto;
	}
	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}
	public String getDesProducto() {
		return desProducto;
	}
	public void setDesProducto(String desProducto) {
		this.desProducto = desProducto;
	}
	public String getInEstado() {
		return inEstado;
	}
	public void setInEstado(String inEstado) {
		this.inEstado = inEstado;
	}
	
}
