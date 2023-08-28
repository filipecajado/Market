package model;

import java.util.Random;

public class Fornecedor {
	Random random = new Random();
	private Long id;
	private String razaoSocial;
	private String cpnj;
	
	
	public Fornecedor( String razaoSocial, String cpnj) {
		this.id =  random.nextLong(100);
		this.razaoSocial = razaoSocial;
		this.cpnj = cpnj;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCpnj() {
		return cpnj;
	}
	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}
	
	
}
