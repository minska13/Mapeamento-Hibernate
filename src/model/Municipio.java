package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Yasmin
 */
@Entity
@Table
public class Municipio {
    @Id
    @GeneratedValue
    @Column
    private Integer idMunicipio;
    
    @Column
    private String nome;
    
    @Column
    private Estado estado;

    public Integer getIdMunicipio() {
	return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
	this.idMunicipio = idMunicipio;
    }

    public String getNome() {
    	return nome;
    }

    public void setNome(String nome) {
    	this.nome = nome;
    }

    public Estado getEstado() {
	return estado;
    }

    public void setEstado(Estado estado) {
	this.estado = estado;
	this.estado.addMunicipio(this);
    }
}
