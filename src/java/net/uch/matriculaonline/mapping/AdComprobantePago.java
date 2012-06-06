package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AdComprobantePago entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AdComprobantePago implements java.io.Serializable {

	// Fields

	private Integer compagId;
	private String compagNro;
	private Float compagMonto;
	private Date compagFecha;
	private Integer compagCliente;
	private String compagClienteTipo;
	private String compagUsado;
	private String compagProcedencia;
	private Date compagCreacion;
	private String compagActivo;
	private String compagDes;
	private Integer compagAlu;
	private String compagTipo;
	private String compagTipDoc;
	private String compagAluTipo;
	private Date compagVoucherFecha;
	private String compagVoucherCodAgencia;
	private String compagVoucherNroOperacion;
	private String compagEstadoCancelacion;
	private Date compagFechaCancelacion;
	private Double compagDscto;
	private Set adDevTranses = new HashSet(0);
	private Set adPagos = new HashSet(0);

	// Constructors

	/** default constructor */
	public AdComprobantePago() {
	}

	/** minimal constructor */
	public AdComprobantePago(Integer compagId, Integer compagCliente) {
		this.compagId = compagId;
		this.compagCliente = compagCliente;
	}

	/** full constructor */
	public AdComprobantePago(Integer compagId, String compagNro,
			Float compagMonto, Date compagFecha, Integer compagCliente,
			String compagClienteTipo, String compagUsado,
			String compagProcedencia, Date compagCreacion, String compagActivo,
			String compagDes, Integer compagAlu, String compagTipo,
			String compagTipDoc, String compagAluTipo, Date compagVoucherFecha,
			String compagVoucherCodAgencia, String compagVoucherNroOperacion,
			String compagEstadoCancelacion, Date compagFechaCancelacion,
			Double compagDscto, Set adDevTranses, Set adPagos) {
		this.compagId = compagId;
		this.compagNro = compagNro;
		this.compagMonto = compagMonto;
		this.compagFecha = compagFecha;
		this.compagCliente = compagCliente;
		this.compagClienteTipo = compagClienteTipo;
		this.compagUsado = compagUsado;
		this.compagProcedencia = compagProcedencia;
		this.compagCreacion = compagCreacion;
		this.compagActivo = compagActivo;
		this.compagDes = compagDes;
		this.compagAlu = compagAlu;
		this.compagTipo = compagTipo;
		this.compagTipDoc = compagTipDoc;
		this.compagAluTipo = compagAluTipo;
		this.compagVoucherFecha = compagVoucherFecha;
		this.compagVoucherCodAgencia = compagVoucherCodAgencia;
		this.compagVoucherNroOperacion = compagVoucherNroOperacion;
		this.compagEstadoCancelacion = compagEstadoCancelacion;
		this.compagFechaCancelacion = compagFechaCancelacion;
		this.compagDscto = compagDscto;
		this.adDevTranses = adDevTranses;
		this.adPagos = adPagos;
	}

	// Property accessors

	public Integer getCompagId() {
		return this.compagId;
	}

	public void setCompagId(Integer compagId) {
		this.compagId = compagId;
	}

	public String getCompagNro() {
		return this.compagNro;
	}

	public void setCompagNro(String compagNro) {
		this.compagNro = compagNro;
	}

	public Float getCompagMonto() {
		return this.compagMonto;
	}

	public void setCompagMonto(Float compagMonto) {
		this.compagMonto = compagMonto;
	}

	public Date getCompagFecha() {
		return this.compagFecha;
	}

	public void setCompagFecha(Date compagFecha) {
		this.compagFecha = compagFecha;
	}

	public Integer getCompagCliente() {
		return this.compagCliente;
	}

	public void setCompagCliente(Integer compagCliente) {
		this.compagCliente = compagCliente;
	}

	public String getCompagClienteTipo() {
		return this.compagClienteTipo;
	}

	public void setCompagClienteTipo(String compagClienteTipo) {
		this.compagClienteTipo = compagClienteTipo;
	}

	public String getCompagUsado() {
		return this.compagUsado;
	}

	public void setCompagUsado(String compagUsado) {
		this.compagUsado = compagUsado;
	}

	public String getCompagProcedencia() {
		return this.compagProcedencia;
	}

	public void setCompagProcedencia(String compagProcedencia) {
		this.compagProcedencia = compagProcedencia;
	}

	public Date getCompagCreacion() {
		return this.compagCreacion;
	}

	public void setCompagCreacion(Date compagCreacion) {
		this.compagCreacion = compagCreacion;
	}

	public String getCompagActivo() {
		return this.compagActivo;
	}

	public void setCompagActivo(String compagActivo) {
		this.compagActivo = compagActivo;
	}

	public String getCompagDes() {
		return this.compagDes;
	}

	public void setCompagDes(String compagDes) {
		this.compagDes = compagDes;
	}

	public Integer getCompagAlu() {
		return this.compagAlu;
	}

	public void setCompagAlu(Integer compagAlu) {
		this.compagAlu = compagAlu;
	}

	public String getCompagTipo() {
		return this.compagTipo;
	}

	public void setCompagTipo(String compagTipo) {
		this.compagTipo = compagTipo;
	}

	public String getCompagTipDoc() {
		return this.compagTipDoc;
	}

	public void setCompagTipDoc(String compagTipDoc) {
		this.compagTipDoc = compagTipDoc;
	}

	public String getCompagAluTipo() {
		return this.compagAluTipo;
	}

	public void setCompagAluTipo(String compagAluTipo) {
		this.compagAluTipo = compagAluTipo;
	}

	public Date getCompagVoucherFecha() {
		return this.compagVoucherFecha;
	}

	public void setCompagVoucherFecha(Date compagVoucherFecha) {
		this.compagVoucherFecha = compagVoucherFecha;
	}

	public String getCompagVoucherCodAgencia() {
		return this.compagVoucherCodAgencia;
	}

	public void setCompagVoucherCodAgencia(String compagVoucherCodAgencia) {
		this.compagVoucherCodAgencia = compagVoucherCodAgencia;
	}

	public String getCompagVoucherNroOperacion() {
		return this.compagVoucherNroOperacion;
	}

	public void setCompagVoucherNroOperacion(String compagVoucherNroOperacion) {
		this.compagVoucherNroOperacion = compagVoucherNroOperacion;
	}

	public String getCompagEstadoCancelacion() {
		return this.compagEstadoCancelacion;
	}

	public void setCompagEstadoCancelacion(String compagEstadoCancelacion) {
		this.compagEstadoCancelacion = compagEstadoCancelacion;
	}

	public Date getCompagFechaCancelacion() {
		return this.compagFechaCancelacion;
	}

	public void setCompagFechaCancelacion(Date compagFechaCancelacion) {
		this.compagFechaCancelacion = compagFechaCancelacion;
	}

	public Double getCompagDscto() {
		return this.compagDscto;
	}

	public void setCompagDscto(Double compagDscto) {
		this.compagDscto = compagDscto;
	}

	public Set getAdDevTranses() {
		return this.adDevTranses;
	}

	public void setAdDevTranses(Set adDevTranses) {
		this.adDevTranses = adDevTranses;
	}

	public Set getAdPagos() {
		return this.adPagos;
	}

	public void setAdPagos(Set adPagos) {
		this.adPagos = adPagos;
	}

}