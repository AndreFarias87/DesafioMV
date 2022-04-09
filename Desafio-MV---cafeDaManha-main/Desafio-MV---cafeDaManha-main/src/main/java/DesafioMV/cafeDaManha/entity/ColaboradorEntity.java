package DesafioMV.cafeDaManha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ColaboradorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	@Column(nullable = false, length = 15, unique = true)
	private String cpf;
	
	@Column(nullable = false, length = 100)
	private String contribuicao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getContribuicao() {
		return contribuicao;
	}

	public void setContribuicao(String contribuicao) {
		this.contribuicao = contribuicao;
	}
	
	
	@Override
	public String toString() {
		return "Colaborador{" + "Id: " + id + "Nome: " + nome + "CPF: " + cpf + "Contribuição: " + contribuicao + "}";
	
	}

	public ColaboradorEntity orElseThrow(Object object) {
	
		return null;
	}
	

}
