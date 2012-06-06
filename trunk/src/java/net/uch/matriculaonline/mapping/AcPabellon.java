package net.uch.matriculaonline.mapping;

import java.util.HashSet;
import java.util.Set;

/**
 * AcPabellon entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcPabellon implements java.io.Serializable {

	// Fields

	private Integer pabId;
	private AcLocal acLocal;
	private String pabNombre;
	private String pabDescripcion;
	private String pabActivo;
	private Set acAulas = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcPabellon() {
	}

	/** minimal constructor */
	public AcPabellon(Integer pabId, AcLocal acLocal) {
		this.pabId = pabId;
		this.acLocal = acLocal;
	}

	/** full constructor */
	public AcPabellon(Integer pabId, AcLocal acLocal, String pabNombre,
			String pabDescripcion, String pabActivo, Set acAulas) {
		this.pabId = pabId;
		this.acLocal = acLocal;
		this.pabNombre = pabNombre;
		this.pabDescripcion = pabDescripcion;
		this.pabActivo = pabActivo;
		this.acAulas = acAulas;
	}

	// Property accessors

	public Integer getPabId() {
		return this.pabId;
	}

	public void setPabId(Integer pabId) {
		this.pabId = pabId;
	}

	public AcLocal getAcLocal() {
		return this.acLocal;
	}

	public void setAcLocal(AcLocal acLocal) {
		this.acLocal = acLocal;
	}

	public String getPabNombre() {
		return this.pabNombre;
	}

	public void setPabNombre(String pabNombre) {
		this.pabNombre = pabNombre;
	}

	public String getPabDescripcion() {
		return this.pabDescripcion;
	}

	public void setPabDescripcion(String pabDescripcion) {
		this.pabDescripcion = pabDescripcion;
	}

	public String getPabActivo() {
		return this.pabActivo;
	}

	public void setPabActivo(String pabActivo) {
		this.pabActivo = pabActivo;
	}

	public Set getAcAulas() {
		return this.acAulas;
	}

	public void setAcAulas(Set acAulas) {
		this.acAulas = acAulas;
	}

}