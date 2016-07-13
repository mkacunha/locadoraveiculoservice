package br.mkacunha.locadora.model;

import java.math.BigDecimal;
import java.sql.Clob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "veiculo")
public class Veiculo {

	@Id
	@Column(precision = 8, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(length = 60, nullable = false)
	private String marca;

	@Column(length = 60, nullable = false)
	private String modelo;

	@Column(length = 4, nullable = false)
	private String ano;

	@Column(length = 60, nullable = false)
	private String cor;

	@Column(length = 8, nullable = false)
	private String placa;

	@Column(name = "valor_diaria", precision = 14, scale = 2, nullable = false)
	private BigDecimal valorDiaria;

	@Column(name = "valor_km", precision = 14, scale = 2, nullable = false)
	private BigDecimal valorKM;

	private Clob opcionais;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public BigDecimal getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(BigDecimal valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public BigDecimal getValorKM() {
		return valorKM;
	}

	public void setValorKM(BigDecimal valorKM) {
		this.valorKM = valorKM;
	}

	public Clob getOpcionais() {
		return opcionais;
	}

	public void setOpcionais(Clob opcionais) {
		this.opcionais = opcionais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.id + " " + this.modelo + " (" + this.marca + ")";
	}

}
