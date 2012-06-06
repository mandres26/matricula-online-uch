package net.uch.matriculaonline.mapping;

import java.util.HashSet;
import java.util.Set;

/**
 * AcLocal entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcLocal implements java.io.Serializable {

	// Fields

	private Integer locId;
	private String locDes;
	private String locActivo;
	private Set acPabellons = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcLocal() {
	}

	/** minimal constructor */
	public AcLocal(Integer locId, String locActivo) {
		this.locId = locId;
		this.locActivo = locActivo;
	}

	/** full constructor */
	public AcLocal(Integer locId, String locDes, String locActivo,
			Set acPabellons ) {
		this.locId = locId;
		this.locDes = locDes;
		this.locActivo = locActivo;
		this.acPabellons = acPabellons;
	}

	// Property accessors

	public Integer getLocId() {
		return this.locId;
	}

	public void setLocId(Integer locId) {
		this.locId = locId;
	}

	public String getLocDes() {
		return this.locDes;
	}

	public void setLocDes(String locDes) {
		this.locDes = locDes;
	}

	public String getLocActivo() {
		return this.locActivo;
	}

	public void setLocActivo(String locActivo) {
		this.locActivo = locActivo;
	}

	public Set getAcPabellons() {
		return this.acPabellons;
	}

	public void setAcPabellons(Set acPabellons) {
		this.acPabellons = acPabellons;
	}

}