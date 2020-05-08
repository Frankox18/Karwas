package pe.edu.upc.karwas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autos")
public class Auto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "placa", length = 30, nullable = false)
	private Integer placa;
	@Column(name = "marca", length = 30, nullable = false)
	private String marca;
	@Column(name = "modelo", length = 30, nullable = false)
	private String modelo;
	@Column(name = "tipoAuto", length = 30, nullable = false)
	private String tipoAuto;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPlaca() {
		return placa;
	}
	public void setPlaca(Integer placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipoAuto() {
		return tipoAuto;
	}
	public void setTipoAuto(String tipoAuto) {
		this.tipoAuto = tipoAuto;
	}
	
	
}
