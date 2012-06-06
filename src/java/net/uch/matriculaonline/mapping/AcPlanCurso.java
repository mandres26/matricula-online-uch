package net.uch.matriculaonline.mapping;

import java.util.HashSet;
import java.util.Set;

/**
 * AcPlanCurso entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcPlanCurso implements java.io.Serializable {

	// Fields

	private Integer plancurId;
	private AcCurso acCurso;
	private AcPlancurricular acPlancurricular;
	private String plancurCiclo;
	private String plancurCredito;
	private String plancurTipo;
	private String plancurActivo;
	private String plancurCodigo;
	private Set acContenidoTematicos = new HashSet(0);
	private Set acEquivalencias = new HashSet(0);
	private Set acPreRequisitosesForPlancurIdRequisito = new HashSet(0);
	private Set acPreRequisitosesForPlancurId = new HashSet(0);
	private Set acCursoAperturados = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcPlanCurso() {
	}

	/** minimal constructor */
	public AcPlanCurso(Integer plancurId, AcCurso acCurso,
			AcPlancurricular acPlancurricular) {
		this.plancurId = plancurId;
		this.acCurso = acCurso;
		this.acPlancurricular = acPlancurricular;
	}

	/** full constructor */
	public AcPlanCurso(Integer plancurId, AcCurso acCurso,
			AcPlancurricular acPlancurricular, String plancurCiclo,
			String plancurCredito, String plancurTipo, String plancurActivo,
			String plancurCodigo, Set acContenidoTematicos,
			Set acEquivalencias, Set acPreRequisitosesForPlancurIdRequisito,
			Set acPreRequisitosesForPlancurId, Set acCursoAperturados) {
		this.plancurId = plancurId;
		this.acCurso = acCurso;
		this.acPlancurricular = acPlancurricular;
		this.plancurCiclo = plancurCiclo;
		this.plancurCredito = plancurCredito;
		this.plancurTipo = plancurTipo;
		this.plancurActivo = plancurActivo;
		this.plancurCodigo = plancurCodigo;
		this.acContenidoTematicos = acContenidoTematicos;
		this.acEquivalencias = acEquivalencias;
		this.acPreRequisitosesForPlancurIdRequisito = acPreRequisitosesForPlancurIdRequisito;
		this.acPreRequisitosesForPlancurId = acPreRequisitosesForPlancurId;
		this.acCursoAperturados = acCursoAperturados;
	}

	// Property accessors

	public Integer getPlancurId() {
		return this.plancurId;
	}

	public void setPlancurId(Integer plancurId) {
		this.plancurId = plancurId;
	}

	public AcCurso getAcCurso() {
		return this.acCurso;
	}

	public void setAcCurso(AcCurso acCurso) {
		this.acCurso = acCurso;
	}

	public AcPlancurricular getAcPlancurricular() {
		return this.acPlancurricular;
	}

	public void setAcPlancurricular(AcPlancurricular acPlancurricular) {
		this.acPlancurricular = acPlancurricular;
	}

	public String getPlancurCiclo() {
		return this.plancurCiclo;
	}

	public void setPlancurCiclo(String plancurCiclo) {
		this.plancurCiclo = plancurCiclo;
	}

	public String getPlancurCredito() {
		return this.plancurCredito;
	}

	public void setPlancurCredito(String plancurCredito) {
		this.plancurCredito = plancurCredito;
	}

	public String getPlancurTipo() {
		return this.plancurTipo;
	}

	public void setPlancurTipo(String plancurTipo) {
		this.plancurTipo = plancurTipo;
	}

	public String getPlancurActivo() {
		return this.plancurActivo;
	}

	public void setPlancurActivo(String plancurActivo) {
		this.plancurActivo = plancurActivo;
	}

	public String getPlancurCodigo() {
		return this.plancurCodigo;
	}

	public void setPlancurCodigo(String plancurCodigo) {
		this.plancurCodigo = plancurCodigo;
	}

	public Set getAcContenidoTematicos() {
		return this.acContenidoTematicos;
	}

	public void setAcContenidoTematicos(Set acContenidoTematicos) {
		this.acContenidoTematicos = acContenidoTematicos;
	}

	public Set getAcEquivalencias() {
		return this.acEquivalencias;
	}

	public void setAcEquivalencias(Set acEquivalencias) {
		this.acEquivalencias = acEquivalencias;
	}

	public Set getAcPreRequisitosesForPlancurIdRequisito() {
		return this.acPreRequisitosesForPlancurIdRequisito;
	}

	public void setAcPreRequisitosesForPlancurIdRequisito(
			Set acPreRequisitosesForPlancurIdRequisito) {
		this.acPreRequisitosesForPlancurIdRequisito = acPreRequisitosesForPlancurIdRequisito;
	}

	public Set getAcPreRequisitosesForPlancurId() {
		return this.acPreRequisitosesForPlancurId;
	}

	public void setAcPreRequisitosesForPlancurId(
			Set acPreRequisitosesForPlancurId) {
		this.acPreRequisitosesForPlancurId = acPreRequisitosesForPlancurId;
	}

	public Set getAcCursoAperturados() {
		return this.acCursoAperturados;
	}

	public void setAcCursoAperturados(Set acCursoAperturados) {
		this.acCursoAperturados = acCursoAperturados;
	}

}