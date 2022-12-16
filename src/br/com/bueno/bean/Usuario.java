/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.bueno.bean;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "usuario", catalog = "adminfile", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome = :nome"),
    @NamedQuery(name = "Usuario.findByLogin", query = "SELECT u FROM Usuario u WHERE u.login = :login"),
    @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha"),
    @NamedQuery(name = "Usuario.verificaLogin", query = "SELECT u FROM Usuario u WHERE u.login =  :login and u.senha =  :senha "),
    @NamedQuery(name = "Usuario.findByAcessoTotal", query = "SELECT u FROM Usuario u WHERE u.acessoTotal = :acessoTotal")})

    public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_USUARIO", nullable = false)
    private Integer idUsuario;
    @Column(name = "NOME", length = 255)
    private String nome;
    @Column(name = "LOGIN", length = 255)
    private String login;
    @Column(name = "SENHA", length = 255)
    private String senha;
    @Column(name = "ACESSO_TOTAL")
    private Character acessoTotal;
    @OneToMany(mappedBy = "idUsuario")
    private Collection<Nivelacesso> nivelacessoCollection;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Character getAcessoTotal() {
        return acessoTotal;
    }

    public void setAcessoTotal(Character acessoTotal) {
        this.acessoTotal = acessoTotal;
    }

    public Collection<Nivelacesso> getNivelacessoCollection() {
        return nivelacessoCollection;
    }

    public void setNivelacessoCollection(Collection<Nivelacesso> nivelacessoCollection) {
        this.nivelacessoCollection = nivelacessoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bueno.bean.Usuario[idUsuario=" + idUsuario + "]";
    }

}
