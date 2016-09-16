package model;

import java.util.ArrayList;

/**
 *
 * @author Yasmin
 */
public class Estado {
    private Integer idEstado;
    private String nome;
    private ArrayList<Municipio> municipios = new ArrayList<Municipio>();
    private Pais pais;

    public Integer getIdEstado() {
	return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
    	this.idEstado = idEstado;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
    	this.nome = nome;
    }

    public ArrayList<Municipio> getMunicipios() {
	return municipios;
    }
	
    public void setPais(Pais pais){
	this.pais = pais;
	this.pais.addEstado(this);
    }
	
    public void addMunicipio(Municipio municipio){
	this.municipios.add(municipio);
    }
}
