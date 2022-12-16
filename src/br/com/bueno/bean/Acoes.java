

package br.com.bueno.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "acoes", catalog = "adminfile", schema = "")
@NamedQueries({
    @NamedQuery(name = "Acoes.findAll", query = "SELECT a FROM Acoes a"),
    @NamedQuery(name = "Acoes.findByIdAcao", query = "SELECT a FROM Acoes a WHERE a.idAcao = :idAcao"),
    @NamedQuery(name = "Acoes.findByCaminhoAnalise", query = "SELECT a FROM Acoes a WHERE a.caminhoAnalise = :caminhoAnalise"),
    @NamedQuery(name = "Acoes.findByNomeArquivo", query = "SELECT a FROM Acoes a WHERE a.nomeArquivo = :nomeArquivo"),
    @NamedQuery(name = "Acoes.findByTamanhoKb", query = "SELECT a FROM Acoes a WHERE a.tamanhoKb = :tamanhoKb"),
    @NamedQuery(name = "Acoes.findByDataCriacao", query = "SELECT a FROM Acoes a WHERE a.dataCriacao = :dataCriacao"),
    @NamedQuery(name = "Acoes.findByHashArquivo", query = "SELECT a FROM Acoes a WHERE a.hashArquivo = :hashArquivo"),
    @NamedQuery(name = "Acoes.findByCaminhoSaida", query = "SELECT a FROM Acoes a WHERE a.caminhoSaida = :caminhoSaida"),
    @NamedQuery(name = "Acoes.findByAcao", query = "SELECT a FROM Acoes a WHERE a.acao = :acao"),
    @NamedQuery(name = "Acoes.findByDataAcao", query = "SELECT a FROM Acoes a WHERE a.dataAcao = :dataAcao"),
    @NamedQuery(name = "Acoes.findBetweenRelCriacao", query = "SELECT a FROM Acoes a WHERE a.dataCriacao  BETWEEN :dataIniCr AND :dataFimCr"),
    @NamedQuery(name = "Acoes.findBetweenRelAcao", query = "SELECT a FROM Acoes a WHERE a.dataAcao  BETWEEN :dataAcaoIni AND :dataAcaoFim"),
    @NamedQuery(name = "Acoes.findByHoraAcao", query = "SELECT a FROM Acoes a WHERE a.horaAcao = :horaAcao"),
    @NamedQuery(name = "Acoes.findByHoraCriacao", query = "SELECT a FROM Acoes a WHERE a.horaCriacao = :horaCriacao"),
    @NamedQuery(name = "Acoes.findByUsuarioAcao", query = "SELECT a FROM Acoes a WHERE a.usuarioAcao = :usuarioAcao")})

    public class Acoes implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ACAO", nullable = false)
    private Integer idAcao;
    @Column(name = "CAMINHO_ANALISE", length = 255)
    private String caminhoAnalise;
    @Column(name = "NOME_ARQUIVO", length = 255)
    private String nomeArquivo;
    @Column(name = "TAMANHO_KB", length = 255)
    private String tamanhoKb;
    @Column(name = "DATA_CRIACAO")
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;
    @Column(name = "HASH_ARQUIVO", length = 255)
    private String hashArquivo;
    @Column(name = "CAMINHO_SAIDA", length = 255)
    private String caminhoSaida;
    @Column(name = "ACAO", length = 255)
    private String acao;
    @Column(name = "DATA_ACAO")
    @Temporal(TemporalType.DATE)
    private Date dataAcao;
    @Column(name = "HORA_ACAO", length = 255)
    private String horaAcao;
    @Column(name = "HORA_CRIACAO", length = 255)
    private String horaCriacao;
    @Column(name = "USUARIO_ACAO", length = 255)
    private String usuarioAcao;

    public Acoes() {
    }

    public Acoes(Integer idAcao) {
        this.idAcao = idAcao;
    }

    public Integer getIdAcao() {
        return idAcao;
    }

    public void setIdAcao(Integer idAcao) {
        Integer oldIdAcao = this.idAcao;
        this.idAcao = idAcao;
        changeSupport.firePropertyChange("idAcao", oldIdAcao, idAcao);
    }

    public String getCaminhoAnalise() {
        return caminhoAnalise;
    }

    public void setCaminhoAnalise(String caminhoAnalise) {
        String oldCaminhoAnalise = this.caminhoAnalise;
        this.caminhoAnalise = caminhoAnalise;
        changeSupport.firePropertyChange("caminhoAnalise", oldCaminhoAnalise, caminhoAnalise);
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        String oldNomeArquivo = this.nomeArquivo;
        this.nomeArquivo = nomeArquivo;
        changeSupport.firePropertyChange("nomeArquivo", oldNomeArquivo, nomeArquivo);
    }

    public String getTamanhoKb() {
        return tamanhoKb;
    }

    public void setTamanhoKb(String tamanhoKb) {
        String oldTamanhoKb = this.tamanhoKb;
        this.tamanhoKb = tamanhoKb;
        changeSupport.firePropertyChange("tamanhoKb", oldTamanhoKb, tamanhoKb);
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        Date oldDataCriacao = this.dataCriacao;
        this.dataCriacao = dataCriacao;
        changeSupport.firePropertyChange("dataCriacao", oldDataCriacao, dataCriacao);
    }

    public String getHashArquivo() {
        return hashArquivo;
    }

    public void setHashArquivo(String hashArquivo) {
        String oldHashArquivo = this.hashArquivo;
        this.hashArquivo = hashArquivo;
        changeSupport.firePropertyChange("hashArquivo", oldHashArquivo, hashArquivo);
    }

    public String getCaminhoSaida() {
        return caminhoSaida;
    }

    public void setCaminhoSaida(String caminhoSaida) {
        String oldCaminhoSaida = this.caminhoSaida;
        this.caminhoSaida = caminhoSaida;
        changeSupport.firePropertyChange("caminhoSaida", oldCaminhoSaida, caminhoSaida);
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        String oldAcao = this.acao;
        this.acao = acao;
        changeSupport.firePropertyChange("acao", oldAcao, acao);
    }

    public Date getDataAcao() {
        return dataAcao;
    }

    public void setDataAcao(Date dataAcao) {
        Date oldDataAcao = this.dataAcao;
        this.dataAcao = dataAcao;
        changeSupport.firePropertyChange("dataAcao", oldDataAcao, dataAcao);
    }

    public String getHoraAcao() {
        return horaAcao;
    }

    public void setHoraAcao(String horaAcao) {
        String oldHoraAcao = this.horaAcao;
        this.horaAcao = horaAcao;
        changeSupport.firePropertyChange("horaAcao", oldHoraAcao, horaAcao);
    }

    public String getHoraCriacao() {
        return horaCriacao;
    }

    public void setHoraCriacao(String horaCriacao) {
        String oldHoraCriacao = this.horaCriacao;
        this.horaCriacao = horaCriacao;
        changeSupport.firePropertyChange("horaCriacao", oldHoraCriacao, horaCriacao);
    }

    public String getUsuarioAcao() {
        return usuarioAcao;
    }

    public void setUsuarioAcao(String usuarioAcao) {
        String oldUsuarioAcao = this.usuarioAcao;
        this.usuarioAcao = usuarioAcao;
        changeSupport.firePropertyChange("usuarioAcao", oldUsuarioAcao, usuarioAcao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAcao != null ? idAcao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acoes)) {
            return false;
        }
        Acoes other = (Acoes) object;
        if ((this.idAcao == null && other.idAcao != null) || (this.idAcao != null && !this.idAcao.equals(other.idAcao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bueno.bean.Acoes[idAcao=" + idAcao + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
