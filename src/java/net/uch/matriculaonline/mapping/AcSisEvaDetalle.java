package net.uch.matriculaonline.mapping;

import java.util.HashSet;
import java.util.Set;

/**
 * AcSisEvaDetalle entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class AcSisEvaDetalle implements java.io.Serializable {

	// Fields

	private Integer sisevaDetalleId;
	private AcSisEvaluacion acSisEvaluacion;
	private String sisevaDetalleCodigo;
	private String sisevaDetalleNombre;
	private Integer sisevaDetallePeso;
	private String sisevaDetalleActivo;
	private String sisevaDetalleSusti;
	private Set acSisEvaPersonalizados = new HashSet(0);

	// Constructors

	/** default constructor */
	public AcSisEvaDetalle() {
	}

	/** minimal constructor */
	public AcSisEvaDetalle(Integer sisevaDetalleId,
			AcSisEvaluacion acSisEvaluacion) {
		this.sisevaDetalleId = sisevaDetalleId;
		this.acSisEvaluacion = acSisEvaluacion;
	}

	/** full constructor */
	public AcSisEvaDetalle(Integer sisevaDetalleId,
			AcSisEvaluacion acSisEvaluacion, String sisevaDetalleCodigo,
			String sisevaDetalleNombre, Integer sisevaDetallePeso,
			String sisevaDetalleActivo, String sisevaDetalleSusti,
			Set acSisEvaPersonalizados) {
		this.sisevaDetalleId = sisevaDetalleId;
		this.acSisEvaluacion = acSisEvaluacion;
		this.sisevaDetalleCodigo = sisevaDetalleCodigo;
		this.sisevaDetalleNombre = sisevaDetalleNombre;
		this.sisevaDetallePeso = sisevaDetallePeso;
		this.sisevaDetalleActivo = sisevaDetalleActivo;
		this.sisevaDetalleSusti = sisevaDetalleSusti;
		this.acSisEvaPersonalizados = acSisEvaPersonalizados;
	}

	// Property accessors

	public Integer getSisevaDetalleId() {
		return this.sisevaDetalleId;
	}

	public void setSisevaDetalleId(Integer sisevaDetalleId) {
		this.sisevaDetalleId = sisevaDetalleId;
	}

	public AcSisEvaluacion getAcSisEvaluacion() {
		return this.acSisEvaluacion;
	}

	public void setAcSisEvaluacion(AcSisEvaluacion acSisEvaluacion) {
		this.acSisEvaluacion = acSisEvaluacion;
	}

	public String getSisevaDetalleCodigo() {
		return this.sisevaDetalleCodigo;
	}

	public void setSisevaDetalleCodigo(String sisevaDetalleCodigo) {
		this.sisevaDetalleCodigo = sisevaDetalleCodigo;
	}

	public String getSisevaDetalleNombre() {
		return this.sisevaDetalleNombre;
	}

	public void setSisevaDetalleNombre(String sisevaDetalleNombre) {
		this.sisevaDetalleNombre = sisevaDetalleNombre;
	}

	public Integer getSisevaDetallePeso() {
		return this.sisevaDetallePeso;
	}

	public void setSisevaDetallePeso(Integer sisevaDetallePeso) {
		this.sisevaDetallePeso = sisevaDetallePeso;
	}

	public String getSisevaDetalleActivo() {
		return this.sisevaDetalleActivo;
	}

	public void setSisevaDetalleActivo(String sisevaDetalleActivo) {
		this.sisevaDetalleActivo = sisevaDetalleActivo;
	}

	public String getSisevaDetalleSusti() {
		return this.sisevaDetalleSusti;
	}

	public void setSisevaDetalleSusti(String sisevaDetalleSusti) {
		this.sisevaDetalleSusti = sisevaDetalleSusti;
	}

	public Set getAcSisEvaPersonalizados() {
		return this.acSisEvaPersonalizados;
	}

	public void setAcSisEvaPersonalizados(Set acSisEvaPersonalizados) {
		this.acSisEvaPersonalizados = acSisEvaPersonalizados;
	}

}