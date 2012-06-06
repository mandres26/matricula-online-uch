package net.uch.matriculaonline.mapping;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AdAlumnoTarifa entity.
 *
 * @author MyEclipse Persistence Tools
 */
public class AdAlumnoTarifa implements java.io.Serializable {

    // Fields
    private Integer alutarId;
    private AcAlumno acAlumno;
    private AdConceptoPago adConceptoPago;
    private AdEstructuraPagosDetalle adEstructuraPagosDetalle;
//	private Integer estpagdetId;
    private Float alutarMonto;
    private Date alutarFechaPago;
    private Date alutarFechaProrroga;
    private String alutarEstado;
    private String alutarActivo;
    private String alutarAluTipo;
    private Integer mattalId;
    private Float alutarMontoCopy;
    private Set adProrrogas = new HashSet( 0 );

    // Constructors
    /**
     * default constructor
     */
    public AdAlumnoTarifa() {
    }

    /**
     * minimal constructor
     */
    public AdAlumnoTarifa( Integer alutarId, AdConceptoPago adConceptoPago,
            AcAlumno acAlumno ) {
        this.alutarId = alutarId;
        this.adConceptoPago = adConceptoPago;
        this.acAlumno = acAlumno;
    }

    /**
     * full constructor
     */
    public AdAlumnoTarifa( Integer alutarId, AdConceptoPago adConceptoPago,
            AdEstructuraPagosDetalle adEstPagDet, AcAlumno acAlumno, Float alutarMonto,
            Date alutarFechaPago, Date alutarFechaProrroga,
            String alutarEstado, String alutarActivo, String alutarAluTipo,
            Integer mattalId, Float alutarMontoCopy, Set adProrrogas ) {
        this.alutarId = alutarId;
        this.adConceptoPago = adConceptoPago;
        this.adEstructuraPagosDetalle = adEstPagDet;
        this.acAlumno = acAlumno;
        this.alutarMonto = alutarMonto;
        this.alutarFechaPago = alutarFechaPago;
        this.alutarFechaProrroga = alutarFechaProrroga;
        this.alutarEstado = alutarEstado;
        this.alutarActivo = alutarActivo;
        this.alutarAluTipo = alutarAluTipo;
        this.mattalId = mattalId;
        this.alutarMontoCopy = alutarMontoCopy;
        this.adProrrogas = adProrrogas;
    }

    // Property accessors
    public Integer getAlutarId() {
        return this.alutarId;
    }

    public void setAlutarId( Integer alutarId ) {
        this.alutarId = alutarId;
    }

    public AdConceptoPago getAdConceptoPago() {
        return this.adConceptoPago;
    }

    public void setAdConceptoPago( AdConceptoPago adConceptoPago ) {
        this.adConceptoPago = adConceptoPago;
    }

    public AdEstructuraPagosDetalle getAdEstructuraPagosDetalle() {
        return this.adEstructuraPagosDetalle;
    }

    public void setAdEstructuraPagosDetalle( AdEstructuraPagosDetalle adEstructuraPagosDetalle ) {
        this.adEstructuraPagosDetalle = adEstructuraPagosDetalle;
    }

    public AcAlumno getAcAlumno() {
        return this.acAlumno;
    }

    public void setAcAlumno( AcAlumno acAlumno ) {
        this.acAlumno = acAlumno;
    }

    public Float getAlutarMonto() {
        return this.alutarMonto;
    }

    public void setAlutarMonto( Float alutarMonto ) {
        this.alutarMonto = alutarMonto;
    }

    public Date getAlutarFechaPago() {
        return this.alutarFechaPago;
    }

    public void setAlutarFechaPago( Date alutarFechaPago ) {
        this.alutarFechaPago = alutarFechaPago;
    }

    public Date getAlutarFechaProrroga() {
        return this.alutarFechaProrroga;
    }

    public void setAlutarFechaProrroga( Date alutarFechaProrroga ) {
        this.alutarFechaProrroga = alutarFechaProrroga;
    }

    public String getAlutarEstado() {
        return this.alutarEstado;
    }

    public void setAlutarEstado( String alutarEstado ) {
        this.alutarEstado = alutarEstado;
    }

    public String getAlutarActivo() {
        return this.alutarActivo;
    }

    public void setAlutarActivo( String alutarActivo ) {
        this.alutarActivo = alutarActivo;
    }

    public String getAlutarAluTipo() {
        return this.alutarAluTipo;
    }

    public void setAlutarAluTipo( String alutarAluTipo ) {
        this.alutarAluTipo = alutarAluTipo;
    }

    public Integer getMattalId() {
        return this.mattalId;
    }

    public void setMattalId( Integer mattalId ) {
        this.mattalId = mattalId;
    }

    public Float getAlutarMontoCopy() {
        return this.alutarMontoCopy;
    }

    public void setAlutarMontoCopy( Float alutarMontoCopy ) {
        this.alutarMontoCopy = alutarMontoCopy;
    }

    public Set getAdProrrogas() {
        return this.adProrrogas;
    }

    public void setAdProrrogas( Set adProrrogas ) {
        this.adProrrogas = adProrrogas;
    }
}