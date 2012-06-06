package net.uch.matriculaonline.mapping;

/**
 * TbCatalogo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TbCatalogo implements java.io.Serializable {

	// Fields

	private Integer catId;
	private String catCodigoGrupo;
	private String catCodigoElemento;
	private String catDescripcionElemento;
	private String catValor;
	private String catActivo;

	// Constructors

	/** default constructor */
	public TbCatalogo() {
	}

	/** minimal constructor */
	public TbCatalogo(Integer catId) {
		this.catId = catId;
	}

	/** full constructor */
	public TbCatalogo(Integer catId, String catCodigoGrupo,
			String catCodigoElemento, String catDescripcionElemento,
			String catValor, String catActivo) {
		this.catId = catId;
		this.catCodigoGrupo = catCodigoGrupo;
		this.catCodigoElemento = catCodigoElemento;
		this.catDescripcionElemento = catDescripcionElemento;
		this.catValor = catValor;
		this.catActivo = catActivo;
	}

	// Property accessors

	public Integer getCatId() {
		return this.catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public String getCatCodigoGrupo() {
		return this.catCodigoGrupo;
	}

	public void setCatCodigoGrupo(String catCodigoGrupo) {
		this.catCodigoGrupo = catCodigoGrupo;
	}

	public String getCatCodigoElemento() {
		return this.catCodigoElemento;
	}

	public void setCatCodigoElemento(String catCodigoElemento) {
		this.catCodigoElemento = catCodigoElemento;
	}

	public String getCatDescripcionElemento() {
		return this.catDescripcionElemento;
	}

	public void setCatDescripcionElemento(String catDescripcionElemento) {
		this.catDescripcionElemento = catDescripcionElemento;
	}

	public String getCatValor() {
		return this.catValor;
	}

	public void setCatValor(String catValor) {
		this.catValor = catValor;
	}

	public String getCatActivo() {
		return this.catActivo;
	}

	public void setCatActivo(String catActivo) {
		this.catActivo = catActivo;
	}

}