package cl.aiep.proyectoModulo2.Classes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="autosentity")
public class Auto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (nullable = false )
	private String nombre;
	
	@Column (nullable = false )
	private long marca;
	
	@Column (nullable = false )
	private long modelo;

	public Auto(Integer id, String nombre, long marca, long modelo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Auto() {}

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

	public long getMarca() {
		return marca;
	}

	public void setMarca(long marca) {
		this.marca = marca;
	}

	public long getModelo() {
		return modelo;
	}

	public void setModelo(long modelo) {
		this.modelo = modelo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}


