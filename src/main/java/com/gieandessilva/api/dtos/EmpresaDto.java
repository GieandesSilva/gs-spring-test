package com.gieandessilva.api.dtos;

public class EmpresaDto {

	private Long id;
	private String nome;
	private String cnpj;
	
	public EmpresaDto() {}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getRazaoSocial() {
		return nome;
	}

	/**
	 * @param nome the razaoSocial to set
	 */
	public void setRazaoSocial(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return "EmpresaDto [id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + "]";
	}

}
