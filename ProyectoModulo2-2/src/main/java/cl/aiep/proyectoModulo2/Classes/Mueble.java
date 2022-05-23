package cl.aiep.proyectoModulo2.Classes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="mueblesentity")
public class Mueble implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Integer id;
	
	public Mueble(Integer id, String nombre, long costo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.costo = costo;
	}
	
	public Mueble() {}

	@Column (nullable = false )
	private String nombre;
	
	@Column (nullable = false )
	private long costo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCosto() {
		return costo;
	}

	public void setCosto(long costo) {
		this.costo = costo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}