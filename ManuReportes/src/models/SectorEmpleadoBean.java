package models;

public class SectorEmpleadoBean {

	String nombre  = new String("");
	

	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if (nombre==null) {
			this.nombre="";			
		} else {
			this.nombre = nombre;
		};
	}
	
}
