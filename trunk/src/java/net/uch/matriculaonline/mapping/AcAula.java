package net.uch.matriculaonline.mapping;

import java.util.HashSet;
import java.util.Set;

/**
 * AcAula entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcAula implements java.io.Serializable {

	// Fields

	private Integer aulId;
	private AcPabellon acPabellon;
	private String aulDes;
	private Integer aulCap;
	private String aulActivo;
	private Set acHorarios = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcAula() {
	}

	/** minimal constructor */
	public AcAula(Integer aulId, AcPabellon acPabellon, String aulDes,
			Integer aulCap, String aulActivo) {
		this.aulId = aulId;
		this.acPabellon = acPabellon;
		this.aulDes = aulDes;
		this.aulCap = aulCap;
		this.aulActivo = aulActivo;
	}

	/** full constructor */
	public AcAula(Integer aulId, AcPabellon acPabellon, String aulDes,
			Integer aulCap, String aulActivo, Set acHorarios ) {
		this.aulId = aulId;
		this.acPabellon = acPabellon;
		this.aulDes = aulDes;
		this.aulCap = aulCap;
		this.aulActivo = aulActivo;
		this.acHorarios = acHorarios;
	}

	// Property accessors

	public Integer getAulId() {
		return this.aulId;
	}

	public void setAulId(Integer aulId) {
		this.aulId = aulId;
	}

	public AcPabellon getAcPabellon() {
		return this.acPabellon;
	}

	public void setAcPabellon(AcPabellon acPabellon) {
		this.acPabellon = acPabellon;
	}

	public String getAulDes() {
		return this.aulDes;
	}

	public void setAulDes(String aulDes) {
		this.aulDes = aulDes;
	}

	public Integer getAulCap() {
		return this.aulCap;
	}

	public void setAulCap(Integer aulCap) {
		this.aulCap = aulCap;
	}

	public String getAulActivo() {
		return this.aulActivo;
	}

	public void setAulActivo(String aulActivo) {
		this.aulActivo = aulActivo;
	}

	public Set getAcHorarios() {
		return this.acHorarios;
	}

	public void setAcHorarios(Set acHorarios) {
		this.acHorarios = acHorarios;
	}

}