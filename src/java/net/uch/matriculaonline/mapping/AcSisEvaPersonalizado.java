package net.uch.matriculaonline.mapping;

import java.util.HashSet;
import java.util.Set;

/**
 * AcSisEvaPersonalizado entity.
 *
 * @author MyEclipse Persistence Tools
 */
public class AcSisEvaPersonalizado implements java.io.Serializable {

    // Fields
    private Integer sisevaPerId;
    private AcSisEvaDetalle acSisEvaDetalle;
    private String sisevaPerNombre;
    private String sisevaPerExaSemana;
    private AcCursoAperturado acCursoApe;
    private String sisevaCodigo;
    private String sisevaPerPeso;
    private Short sisevaPerOrden;
    private String sisevaPerActivo;
    private String sisevaPerAluTipo;
    private Set acImportacionNotases = new HashSet( 0 );
    private Set acNotas = new HashSet( 0 );

    // Constructors
    /**
     * default constructor
     */
    public AcSisEvaPersonalizado() {
    }

    /**
     * minimal constructor
     */
    public AcSisEvaPersonalizado( Integer sisevaPerId,
            AcSisEvaDetalle acSisEvaDetalle, Integer curapeId, AcCursoAperturado acCursoApe ) {
        this.sisevaPerId = sisevaPerId;
        this.acSisEvaDetalle = acSisEvaDetalle;
        this.acCursoApe = acCursoApe;
    }

    /**
     * full constructor
     */
    public AcSisEvaPersonalizado( Integer sisevaPerId,
            AcSisEvaDetalle acSisEvaDetalle, AcCursoAperturado acCursoApe, String sisevaPerNombre,
            String sisevaPerExaSemana, Integer curapeId, String sisevaCodigo,
            String sisevaPerPeso, Short sisevaPerOrden, String sisevaPerActivo,
            String sisevaPerAluTipo, Set acImportacionNotases, Set acNotas ) {
        this.sisevaPerId = sisevaPerId;
        this.acSisEvaDetalle = acSisEvaDetalle;
        this.sisevaPerNombre = sisevaPerNombre;
        this.sisevaPerExaSemana = sisevaPerExaSemana;
        this.acCursoApe = acCursoApe;
        this.sisevaCodigo = sisevaCodigo;
        this.sisevaPerPeso = sisevaPerPeso;
        this.sisevaPerOrden = sisevaPerOrden;
        this.sisevaPerActivo = sisevaPerActivo;
        this.sisevaPerAluTipo = sisevaPerAluTipo;
        this.acImportacionNotases = acImportacionNotases;
        this.acNotas = acNotas;
    }

    // Property accessors
    public Integer getSisevaPerId() {
        return this.sisevaPerId;
    }

    public void setSisevaPerId( Integer sisevaPerId ) {
        this.sisevaPerId = sisevaPerId;
    }

    public AcSisEvaDetalle getAcSisEvaDetalle() {
        return this.acSisEvaDetalle;
    }

    public void setAcSisEvaDetalle( AcSisEvaDetalle acSisEvaDetalle ) {
        this.acSisEvaDetalle = acSisEvaDetalle;
    }

    public String getSisevaPerNombre() {
        return this.sisevaPerNombre;
    }

    public void setSisevaPerNombre( String sisevaPerNombre ) {
        this.sisevaPerNombre = sisevaPerNombre;
    }

    public String getSisevaPerExaSemana() {
        return this.sisevaPerExaSemana;
    }

    public void setSisevaPerExaSemana( String sisevaPerExaSemana ) {
        this.sisevaPerExaSemana = sisevaPerExaSemana;
    }

    public AcCursoAperturado getAcCurApe() {
        return this.acCursoApe;
    }

    public void setAcCurApe( AcCursoAperturado acCurApe ) {
        this.acCursoApe = acCurApe;
    }

    public String getSisevaCodigo() {
        return this.sisevaCodigo;
    }

    public void setSisevaCodigo( String sisevaCodigo ) {
        this.sisevaCodigo = sisevaCodigo;
    }

    public String getSisevaPerPeso() {
        return this.sisevaPerPeso;
    }

    public void setSisevaPerPeso( String sisevaPerPeso ) {
        this.sisevaPerPeso = sisevaPerPeso;
    }

    public Short getSisevaPerOrden() {
        return this.sisevaPerOrden;
    }

    public void setSisevaPerOrden( Short sisevaPerOrden ) {
        this.sisevaPerOrden = sisevaPerOrden;
    }

    public String getSisevaPerActivo() {
        return this.sisevaPerActivo;
    }

    public void setSisevaPerActivo( String sisevaPerActivo ) {
        this.sisevaPerActivo = sisevaPerActivo;
    }

    public String getSisevaPerAluTipo() {
        return this.sisevaPerAluTipo;
    }

    public void setSisevaPerAluTipo( String sisevaPerAluTipo ) {
        this.sisevaPerAluTipo = sisevaPerAluTipo;
    }

    public Set getAcImportacionNotases() {
        return this.acImportacionNotases;
    }

    public void setAcImportacionNotases( Set acImportacionNotases ) {
        this.acImportacionNotases = acImportacionNotases;
    }

    public Set getAcNotas() {
        return this.acNotas;
    }

    public void setAcNotas( Set acNotas ) {
        this.acNotas = acNotas;
    }
}