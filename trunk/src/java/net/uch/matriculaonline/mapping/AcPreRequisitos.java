package net.uch.matriculaonline.mapping;

/**
 * AcPreRequisitos entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcPreRequisitos implements java.io.Serializable {

	// Fields

	private Integer preReqId;
	private AcPlanCurso acPlanCursoByPlancurIdRequisito;
	private AcPlanCurso acPlanCursoByPlancurId;
	private String preReqActivo;

	// Constructors

	/** default constructor */
	public AcPreRequisitos() {
	}

	/** minimal constructor */
	public AcPreRequisitos(Integer preReqId, AcPlanCurso acPlanCursoByPlancurId) {
		this.preReqId = preReqId;
		this.acPlanCursoByPlancurId = acPlanCursoByPlancurId;
	}

	/** full constructor */
	public AcPreRequisitos(Integer preReqId,
			AcPlanCurso acPlanCursoByPlancurIdRequisito,
			AcPlanCurso acPlanCursoByPlancurId, String preReqActivo) {
		this.preReqId = preReqId;
		this.acPlanCursoByPlancurIdRequisito = acPlanCursoByPlancurIdRequisito;
		this.acPlanCursoByPlancurId = acPlanCursoByPlancurId;
		this.preReqActivo = preReqActivo;
	}

	// Property accessors

	public Integer getPreReqId() {
		return this.preReqId;
	}

	public void setPreReqId(Integer preReqId) {
		this.preReqId = preReqId;
	}

	public AcPlanCurso getAcPlanCursoByPlancurIdRequisito() {
		return this.acPlanCursoByPlancurIdRequisito;
	}

	public void setAcPlanCursoByPlancurIdRequisito(
			AcPlanCurso acPlanCursoByPlancurIdRequisito) {
		this.acPlanCursoByPlancurIdRequisito = acPlanCursoByPlancurIdRequisito;
	}

	public AcPlanCurso getAcPlanCursoByPlancurId() {
		return this.acPlanCursoByPlancurId;
	}

	public void setAcPlanCursoByPlancurId(AcPlanCurso acPlanCursoByPlancurId) {
		this.acPlanCursoByPlancurId = acPlanCursoByPlancurId;
	}

	public String getPreReqActivo() {
		return this.preReqActivo;
	}

	public void setPreReqActivo(String preReqActivo) {
		this.preReqActivo = preReqActivo;
	}

}