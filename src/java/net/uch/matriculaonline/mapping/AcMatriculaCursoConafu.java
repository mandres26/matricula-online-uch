package net.uch.matriculaonline.mapping;

/**
 * AcMatriculaCursoConafu entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcMatriculaCursoConafu implements java.io.Serializable {

	// Fields

	private Integer matcurId;
	private AcMatriculaConafu acMatriculaConafu;
	private AcSeccion acSeccion;
	private String matcurActivo;
	private String matcurObs;
	private String matcurEstado;

	// Constructors

	/** default constructor */
	public AcMatriculaCursoConafu() {
	}

	/** minimal constructor */
	public AcMatriculaCursoConafu(Integer matcurId,
			AcMatriculaConafu acMatriculaConafu, AcSeccion acSeccion) {
		this.matcurId = matcurId;
		this.acMatriculaConafu = acMatriculaConafu;
		this.acSeccion = acSeccion;
	}

	/** full constructor */
	public AcMatriculaCursoConafu(Integer matcurId,
			AcMatriculaConafu acMatriculaConafu, AcSeccion acSeccion,
			String matcurActivo, String matcurObs, String matcurEstado) {
		this.matcurId = matcurId;
		this.acMatriculaConafu = acMatriculaConafu;
		this.acSeccion = acSeccion;
		this.matcurActivo = matcurActivo;
		this.matcurObs = matcurObs;
		this.matcurEstado = matcurEstado;
	}

	// Property accessors

	public Integer getMatcurId() {
		return this.matcurId;
	}

	public void setMatcurId(Integer matcurId) {
		this.matcurId = matcurId;
	}

	public AcMatriculaConafu getAcMatriculaConafu() {
		return this.acMatriculaConafu;
	}

	public void setAcMatriculaConafu(AcMatriculaConafu acMatriculaConafu) {
		this.acMatriculaConafu = acMatriculaConafu;
	}

	public AcSeccion getAcSeccion() {
		return this.acSeccion;
	}

	public void setAcSeccion(AcSeccion acSeccion) {
		this.acSeccion = acSeccion;
	}

	public String getMatcurActivo() {
		return this.matcurActivo;
	}

	public void setMatcurActivo(String matcurActivo) {
		this.matcurActivo = matcurActivo;
	}

	public String getMatcurObs() {
		return this.matcurObs;
	}

	public void setMatcurObs(String matcurObs) {
		this.matcurObs = matcurObs;
	}

	public String getMatcurEstado() {
		return this.matcurEstado;
	}

	public void setMatcurEstado(String matcurEstado) {
		this.matcurEstado = matcurEstado;
	}

}