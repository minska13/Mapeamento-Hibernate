package model;

import java.util.ArrayList;

/**
 *
 * @author Yasmin
 */
public class Pais {
    private Integer idPais;
    private String nome;
    private ArrayList<Estado> estados = new ArrayList<Estado>();

    public Integer getIdPais() {
	return idPais;
    }

    public void setIdPais(Integer idPais) {
	this.idPais = idPais;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public ArrayList<Estado> getEstados() {
	return estados;
    }
	
    public void addEstado(Estado estado){
	this.estados.add(estado);
    }
}
