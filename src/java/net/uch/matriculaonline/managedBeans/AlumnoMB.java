/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.uch.matriculaonline.managedBeans;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.ImageIO;
import net.uch.matriculaonline.mapping.AcAlumno;
import net.uch.matriculaonline.mapping.AcAlumnoDato;
import net.uch.matriculaonline.util.CommonWeb;

/**
 *
 * @author USUARIO
 */
public class AlumnoMB {

    private AcAlumno m_alumno;
    private String m_sCodigo = "";
    private String m_sNombres = "";
    private String m_sApPaterno = "";
    private String m_sApMaterno = "";
    private String m_sCorreo = "";
    private String m_sDireccion = "";
    private String m_sNumFijo = "";
    private String m_sNumCelular = "";
    private String m_sGenero = "";
    private String m_sDocumento = "";

    /**
     * Creates a new instance of AlumnoMB
     */
    public AlumnoMB() {
        m_alumno = CommonWeb.traerAlumnoLogeado();
        if ( m_alumno != null ) {
            Object[] lstAlumnoDatos = m_alumno.getAcAlumnoDatos().toArray();
            if ( lstAlumnoDatos != null && lstAlumnoDatos.length > 0 && lstAlumnoDatos[0] != null ) {
                AcAlumnoDato alumnoDato = (AcAlumnoDato) lstAlumnoDatos[0];
                m_sCodigo = m_alumno.getAluCodigo();
                m_sApPaterno = m_alumno.getAluApmaterno();
                m_sApMaterno = m_alumno.getAluApmaterno();
                m_sNombres = m_alumno.getAluNombres();
                m_sGenero = CommonWeb.traerDescripcionCatalogo( alumnoDato.getAluDatoSexo() );
                m_sCorreo = m_alumno.getAluMail();
                m_sDireccion = alumnoDato.getAluDatoDireccion();
                m_sNumFijo = alumnoDato.getAluDatoTelefonoF();
                m_sNumCelular = alumnoDato.getAluDatoTelefonoC();
                m_sDocumento = alumnoDato.getAluDni();

            }
        }
    }

    public AcAlumno getAlumno() {
        return m_alumno;
    }

    public void setAlumno( AcAlumno alumno ) {
        this.m_alumno = alumno;
    }

    public String getApMaterno() {
        return m_sApMaterno;
    }

    public void setApMaterno( String sApMaterno ) {
        this.m_sApMaterno = sApMaterno;
    }

    public String getApPaterno() {
        return m_sApPaterno;
    }

    public void setApPaterno( String sApPaterno ) {
        this.m_sApPaterno = sApPaterno;
    }

    public String getCodigo() {
        return m_sCodigo;
    }

    public void setCodigo( String sCodigo ) {
        this.m_sCodigo = sCodigo;
    }

    public String getCorreo() {
        return m_sCorreo;
    }

    public void setCorreo( String sCorreo ) {
        this.m_sCorreo = sCorreo;
    }

    public String getDireccion() {
        return m_sDireccion;
    }

    public void setDireccion( String sDireccion ) {
        this.m_sDireccion = sDireccion;
    }

    public String getDocumento() {
        return m_sDocumento;
    }

    public void setDocumento( String sDocumento ) {
        this.m_sDocumento = sDocumento;
    }

    public String getGenero() {
        return m_sGenero;
    }

    public void setGenero( String sGenero ) {
        this.m_sGenero = sGenero;
    }

    public String getNombres() {
        return m_sNombres;
    }

    public void setNombres( String sNombres ) {
        this.m_sNombres = sNombres;
    }

    public String getNumCelular() {
        return m_sNumCelular;
    }

    public void setNumCelular( String sNumCelular ) {
        this.m_sNumCelular = sNumCelular;
    }

    public String getNumFijo() {
        return m_sNumFijo;
    }

    public void setNumFijo( String sNumFijo ) {
        this.m_sNumFijo = sNumFijo;
    }

    public void imagen( OutputStream out, Object data ) throws IOException, Exception {
        if ( m_alumno != null ) {
            java.sql.Blob alu_foto = m_alumno.getAluFoto();
            BufferedImage bufferedImage = ImageIO.read( alu_foto.getBinaryStream() );
            ImageIO.write( bufferedImage, "jpeg", out );
        }
    }
}
