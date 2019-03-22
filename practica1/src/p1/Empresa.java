/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Sergio
 */
@Entity
@Table(name = "empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e")
    , @NamedQuery(name = "Empresa.findByNif", query = "SELECT e FROM Empresa e WHERE e.nif = :nif")})
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nif")
    private Integer nif;
    @Basic(optional = false)
    @Lob
    @Column(name = "nombre_empresa")
    private String nombreEmpresa;
    @JoinTable(name = "acontecimientospersonas", joinColumns = {
        @JoinColumn(name = "nif", referencedColumnName = "nif")}, inverseJoinColumns = {
        @JoinColumn(name = "NombrePersona", referencedColumnName = "DNI")})
    @ManyToMany
    private Collection<Personas> personasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nif")
    private Collection<Personas> personasCollection1;

    public Empresa() {
    }

    public Empresa(Integer nif) {
        this.nif = nif;
    }

    public Empresa(Integer nif, String nombreEmpresa) {
        this.nif = nif;
        this.nombreEmpresa = nombreEmpresa;
    }

    public Integer getNif() {
        return nif;
    }

    public void setNif(Integer nif) {
        this.nif = nif;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @XmlTransient
    public Collection<Personas> getPersonasCollection() {
        return personasCollection;
    }

    public void setPersonasCollection(Collection<Personas> personasCollection) {
        this.personasCollection = personasCollection;
    }

    @XmlTransient
    public Collection<Personas> getPersonasCollection1() {
        return personasCollection1;
    }

    public void setPersonasCollection1(Collection<Personas> personasCollection1) {
        this.personasCollection1 = personasCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nif != null ? nif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.nif == null && other.nif != null) || (this.nif != null && !this.nif.equals(other.nif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "p1.Empresa[ nif=" + nif + " ]";
    }
    
}
