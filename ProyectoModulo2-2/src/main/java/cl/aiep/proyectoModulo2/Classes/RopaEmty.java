package cl.aiep.proyectoModulo2.Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="ropaentity")
public class RopaEmty {

	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (nullable = false )
	private String nombre;
	
	@Column (nullable = false )
	private long marca;
	
	@Column (nullable = false )
	private long maerial;

	public Integer getId() {
		return id;
	}

	public RopaEmty(Integer id, String nombre, long marca, long maerial) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.maerial = maerial;
	}
	


	public RopaEmty() {}
	
	
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

	public long getMaerial() {
		return maerial;
	}

	public void setMaerial(long maerial) {
		this.maerial = maerial;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
