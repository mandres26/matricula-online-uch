package net.uch.matriculaonline.mapping;

/**
 * AdClientes entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AdClientes implements java.io.Serializable {

	// Fields

	private Integer cliId;
	private String cliRuc;
	private String cliRazonSocial;
	private String cliDireccion;
	private String cliTelefono;
	private String cliMail;
	private String cliTipo;
	private String cliActivo;
	private String cliAppaterno;
	private String cliApmaterno;
	private String cliNombres;

	// Constructors

	/** default constructor */
	public AdClientes() {
	}

	/** minimal constructor */
	public AdClientes(Integer cliId) {
		this.cliId = cliId;
	}

	/** full constructor */
	public AdClientes(Integer cliId, String cliRuc, String cliRazonSocial,
			String cliDireccion, String cliTelefono, String cliMail,
			String cliTipo, String cliActivo, String cliAppaterno,
			String cliApmaterno, String cliNombres) {
		this.cliId = cliId;
		this.cliRuc = cliRuc;
		this.cliRazonSocial = cliRazonSocial;
		this.cliDireccion = cliDireccion;
		this.cliTelefono = cliTelefono;
		this.cliMail = cliMail;
		this.cliTipo = cliTipo;
		this.cliActivo = cliActivo;
		this.cliAppaterno = cliAppaterno;
		this.cliApmaterno = cliApmaterno;
		this.cliNombres = cliNombres;
	}

	// Property accessors

	public Integer getCliId() {
		return this.cliId;
	}

	public void setCliId(Integer cliId) {
		this.cliId = cliId;
	}

	public String getCliRuc() {
		return this.cliRuc;
	}

	public void setCliRuc(String cliRuc) {
		this.cliRuc = cliRuc;
	}

	public String getCliRazonSocial() {
		return this.cliRazonSocial;
	}

	public void setCliRazonSocial(String cliRazonSocial) {
		this.cliRazonSocial = cliRazonSocial;
	}

	public String getCliDireccion() {
		return this.cliDireccion;
	}

	public void setCliDireccion(String cliDireccion) {
		this.cliDireccion = cliDireccion;
	}

	public String getCliTelefono() {
		return this.cliTelefono;
	}

	public void setCliTelefono(String cliTelefono) {
		this.cliTelefono = cliTelefono;
	}

	public String getCliMail() {
		return this.cliMail;
	}

	public void setCliMail(String cliMail) {
		this.cliMail = cliMail;
	}

	public String getCliTipo() {
		return this.cliTipo;
	}

	public void setCliTipo(String cliTipo) {
		this.cliTipo = cliTipo;
	}

	public String getCliActivo() {
		return this.cliActivo;
	}

	public void setCliActivo(String cliActivo) {
		this.cliActivo = cliActivo;
	}

	public String getCliAppaterno() {
		return this.cliAppaterno;
	}

	public void setCliAppaterno(String cliAppaterno) {
		this.cliAppaterno = cliAppaterno;
	}

	public String getCliApmaterno() {
		return this.cliApmaterno;
	}

	public void setCliApmaterno(String cliApmaterno) {
		this.cliApmaterno = cliApmaterno;
	}

	public String getCliNombres() {
		return this.cliNombres;
	}

	public void setCliNombres(String cliNombres) {
		this.cliNombres = cliNombres;
	}

}