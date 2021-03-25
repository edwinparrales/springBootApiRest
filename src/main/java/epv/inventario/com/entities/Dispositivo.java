package epv.inventario.com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_dispositivos")
public class Dispositivo  {

	
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="name", length=150, nullable=false, unique=false)
	private String name;
	@Column(name="modelo", length=150, nullable=false, unique=false)
	private String modelo;
	@Column(name="caracterisiticas", nullable=true, unique=false)
	private String caracteristicas;
	private String serial;
	@Column(name = "valor",nullable = false)
	private Double valor;
	
	
	public Dispositivo() {
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCaracteristicas() {
		return caracteristicas;
	}


	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}


	public String getSerial() {
		return serial;
	}


	public void setSerial(String serial) {
		this.serial = serial;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	@Override
	public String toString() {
		return "Dispositivo [id=" + id + ", name=" + name + ", modelo=" + modelo + ", caracteristicas="
				+ caracteristicas + ", serial=" + serial + ", valor=" + valor + "]";
	}

}
