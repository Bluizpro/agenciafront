package model;

public class Agencia {
 private  Integer id;
 private String Nome;
 private String Endereco;
 private String Destino;
 
 public Agencia() {
 
 }
 
 
public Agencia(String nome, String endereco, String destino) {

	Nome = nome;
	Endereco = endereco;
	Destino = destino;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public String getEndereco() {
	return Endereco;
}
public void setEndereco(String endereco) {
	Endereco = endereco;
}
public String getDestino() {
	return Destino;
}
public void setDestino(String destino) {
	Destino = destino;
}
 
}
