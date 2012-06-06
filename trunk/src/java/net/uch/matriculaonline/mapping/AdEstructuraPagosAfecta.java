package net.uch.matriculaonline.mapping;

/**
 * AdEstructuraPagosAfecta entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AdEstructuraPagosAfecta implements java.io.Serializable {

	// Fields

	private Integer estpagdetafeId;
	private AdEstructuraPagos adEstructuraPagos;
	private String estpagdetafeTipo;
	private String estpagdetafeDes;
	private String estpagdetafeActivo;

	// Constructors

	/** default constructor */
	public AdEstructuraPagosAfecta() {
	}

	/** minimal constructor */
	public AdEstructuraPagosAfecta(Integer estpagdetafeId) {
		this.estpagdetafeId = estpagdetafeId;
	}

	/** full constructor */
	public AdEstructuraPagosAfecta(Integer estpagdetafeId,
			AdEstructuraPagos adEstructuraPagos, String estpagdetafeTipo,
			String estpagdetafeDes, String estpagdetafeActivo) {
		this.estpagdetafeId = estpagdetafeId;
		this.adEstructuraPagos = adEstructuraPagos;
		this.estpagdetafeTipo = estpagdetafeTipo;
		this.estpagdetafeDes = estpagdetafeDes;
		this.estpagdetafeActivo = estpagdetafeActivo;
	}

	// Property accessors

	public Integer getEstpagdetafeId() {
		return this.estpagdetafeId;
	}

	public void setEstpagdetafeId(Integer estpagdetafeId) {
		this.estpagdetafeId = estpagdetafeId;
	}

	public AdEstructuraPagos getAdEstructuraPagos() {
		return this.adEstructuraPagos;
	}

	public void setAdEstructuraPagos(AdEstructuraPagos adEstructuraPagos) {
		this.adEstructuraPagos = adEstructuraPagos;
	}

	public String getEstpagdetafeTipo() {
		return this.estpagdetafeTipo;
	}

	public void setEstpagdetafeTipo(String estpagdetafeTipo) {
		this.estpagdetafeTipo = estpagdetafeTipo;
	}

	public String getEstpagdetafeDes() {
		return this.estpagdetafeDes;
	}

	public void setEstpagdetafeDes(String estpagdetafeDes) {
		this.estpagdetafeDes = estpagdetafeDes;
	}

	public String getEstpagdetafeActivo() {
		return this.estpagdetafeActivo;
	}

	public void setEstpagdetafeActivo(String estpagdetafeActivo) {
		this.estpagdetafeActivo = estpagdetafeActivo;
	}

}