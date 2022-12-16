/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.bueno.bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author nb
 */
@Entity
@Table(name = "nivelacesso", catalog = "adminfile", schema = "")
@NamedQueries({
    @NamedQuery(name = "Nivelacesso.findAll", query = "SELECT n FROM Nivelacesso n"),
    @NamedQuery(name = "Nivelacesso.findByIdNivelacesso", query = "SELECT n FROM Nivelacesso n WHERE n.idNivelacesso = :idNivelacesso"),
    @NamedQuery(name = "Nivelacesso.findByCodFuncionario", query = "SELECT n FROM Nivelacesso n WHERE n.codFuncionario = :codFuncionario"),
    @NamedQuery(name = "Nivelacesso.findByModulo", query = "SELECT n FROM Nivelacesso n WHERE n.modulo = :modulo")})
public class Nivelacesso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_NIVELACESSO", nullable = false)
    private Integer idNivelacesso;
    @Column(name = "COD_FUNCIONARIO")
    private Integer codFuncionario;
    @Column(name = "MODULO", length = 255)
    private String modulo;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuario idUsuario;

    public Nivelacesso() {
    }

    public Nivelacesso(Integer idNivelacesso) {
        this.idNivelacesso = idNivelacesso;
    }

    public Integer getIdNivelacesso() {
        return idNivelacesso;
    }

    public void setIdNivelacesso(Integer idNivelacesso) {
        this.idNivelacesso = idNivelacesso;
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNivelacesso != null ? idNivelacesso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nivelacesso)) {
            return false;
        }
        Nivelacesso other = (Nivelacesso) object;
        if ((this.idNivelacesso == null && other.idNivelacesso != null) || (this.idNivelacesso != null && !this.idNivelacesso.equals(other.idNivelacesso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bueno.bean.Nivelacesso[idNivelacesso=" + idNivelacesso + "]";
    }

}
