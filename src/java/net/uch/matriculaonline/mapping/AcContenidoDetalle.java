package net.uch.matriculaonline.mapping;

/**
 * AcContenidoDetalle entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcContenidoDetalle implements java.io.Serializable {

	// Fields

	private Integer condetId;
	private AcContenidoTematico acContenidoTematico;
	private String condetContenido;
	private String condetSemana;

	// Constructors

	/** default constructor */
	public AcContenidoDetalle() {
	}

	/** minimal constructor */
	public AcContenidoDetalle(Integer condetId,
			AcContenidoTematico acContenidoTematico) {
		this.condetId = condetId;
		this.acContenidoTematico = acContenidoTematico;
	}

	/** full constructor */
	public AcContenidoDetalle(Integer condetId,
			AcContenidoTematico acContenidoTematico, String condetContenido,
			String condetSemana) {
		this.condetId = condetId;
		this.acContenidoTematico = acContenidoTematico;
		this.condetContenido = condetContenido;
		this.condetSemana = condetSemana;
	}

	// Property accessors

	public Integer getCondetId() {
		return this.condetId;
	}

	public void setCondetId(Integer condetId) {
		this.condetId = condetId;
	}

	public AcContenidoTematico getAcContenidoTematico() {
		return this.acContenidoTematico;
	}

	public void setAcContenidoTematico(AcContenidoTematico acContenidoTematico) {
		this.acContenidoTematico = acContenidoTematico;
	}

	public String getCondetContenido() {
		return this.condetContenido;
	}

	public void setCondetContenido(String condetContenido) {
		this.condetContenido = condetContenido;
	}

	public String getCondetSemana() {
		return this.condetSemana;
	}

	public void setCondetSemana(String condetSemana) {
		this.condetSemana = condetSemana;
	}

}