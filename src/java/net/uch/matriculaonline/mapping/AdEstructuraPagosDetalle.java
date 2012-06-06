package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.Set;

/**
 * AdEstructuraPagosDetalle entity.
 *
 * @author MyEclipse Persistence Tools
 */
public class AdEstructuraPagosDetalle implements java.io.Serializable {

    // Fields
    private Integer estpagdetId;
    private AdEstructuraPagos adEstructuraPagos;
    private String estpagdetNombre;
    private Integer conpagId;
    private Date estpagdetFechaPago;
    private Float estpagdetMonto;
    private String estpagdetActivo;
    private java.util.Set<AdAlumnoTarifa> adAlumnoTarifas;

    // Constructors
    /**
     * default constructor
     */
    public AdEstructuraPagosDetalle() {
    }

    /**
     * minimal constructor
     */
    public AdEstructuraPagosDetalle( Integer estpagdetId,
            AdEstructuraPagos adEstructuraPagos ) {
        this.estpagdetId = estpagdetId;
        this.adEstructuraPagos = adEstructuraPagos;
    }

    /**
     * full constructor
     */
    public AdEstructuraPagosDetalle( Integer estpagdetId,
            AdEstructuraPagos adEstructuraPagos, String estpagdetNombre,
            Integer conpagId, Date estpagdetFechaPago, Float estpagdetMonto,
            String estpagdetActivo ) {
        this.estpagdetId = estpagdetId;
        this.adEstructuraPagos = adEstructuraPagos;
        this.estpagdetNombre = estpagdetNombre;
        this.conpagId = conpagId;
        this.estpagdetFechaPago = estpagdetFechaPago;
        this.estpagdetMonto = estpagdetMonto;
        this.estpagdetActivo = estpagdetActivo;
    }

    // Property accessors
    public Integer getEstpagdetId() {
        return this.estpagdetId;
    }

    public void setEstpagdetId( Integer estpagdetId ) {
        this.estpagdetId = estpagdetId;
    }

    public AdEstructuraPagos getAdEstructuraPagos() {
        return this.adEstructuraPagos;
    }

    public void setAdEstructuraPagos( AdEstructuraPagos adEstructuraPagos ) {
        this.adEstructuraPagos = adEstructuraPagos;
    }

    public String getEstpagdetNombre() {
        return this.estpagdetNombre;
    }

    public void setEstpagdetNombre( String estpagdetNombre ) {
        this.estpagdetNombre = estpagdetNombre;
    }

    public Integer getConpagId() {
        return this.conpagId;
    }

    public void setConpagId( Integer conpagId ) {
        this.conpagId = conpagId;
    }

    public Date getEstpagdetFechaPago() {
        return this.estpagdetFechaPago;
    }

    public void setEstpagdetFechaPago( Date estpagdetFechaPago ) {
        this.estpagdetFechaPago = estpagdetFechaPago;
    }

    public Float getEstpagdetMonto() {
        return this.estpagdetMonto;
    }

    public void setEstpagdetMonto( Float estpagdetMonto ) {
        this.estpagdetMonto = estpagdetMonto;
    }

    public String getEstpagdetActivo() {
        return this.estpagdetActivo;
    }

    public void setEstpagdetActivo( String estpagdetActivo ) {
        this.estpagdetActivo = estpagdetActivo;
    }

    public Set<AdAlumnoTarifa> getAdAlumnoTarifas() {
        return adAlumnoTarifas;
    }

    public void setAdAlumnoTarifas( Set<AdAlumnoTarifa> adAlumnoTarifas ) {
        this.adAlumnoTarifas = adAlumnoTarifas;
    }
}