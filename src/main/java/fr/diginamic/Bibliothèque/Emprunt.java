package fr.diginamic.Bibliothèque;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "EMPRUNT")
public class Emprunt {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name = "DATE_DEBUT")
	private Date date_debut;
	
	@Column(name = "DELAI")
	private Integer delai;
	
	@Column(name = "DATE_FIN")
	private Date date_fin;
	
	
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;
	
	@ManyToMany
	@JoinTable(name = "COMPO",
			joinColumns = @JoinColumn(name="ID_EMP", referencedColumnName="ID"),
			inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName="ID")
	)
	private Set<Livre> livres;
	public Set<Livre> getLivres(){
		return livres;
	}
	
	
	
	/** Constructeur
	 * 
	 */
	public Emprunt() {
	}


	/** Constructeur
	 * @param id
	 * @param date_debut
	 * @param delai
	 * @param date_fin
	 */
	public Emprunt(Integer id, Date date_debut, Integer delai, Date date_fin) {
		this.id = id;
		this.date_debut = date_debut;
		this.delai = delai;
		this.date_fin = date_fin;
	}



	/** Getter pour id
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}



	/** Setter pour id
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}



	/** Getter pour date_debut
	 * @return the date_debut
	 */
	public Date getDate_debut() {
		return date_debut;
	}



	/** Setter pour date_debut
	 * @param date_debut the date_debut to set
	 */
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}



	/** Getter pour delai
	 * @return the delai
	 */
	public Integer getDelai() {
		return delai;
	}



	/** Setter pour delai
	 * @param delai the delai to set
	 */
	public void setDelai(Integer delai) {
		this.delai = delai;
	}



	/** Getter pour date_fin
	 * @return the date_fin
	 */
	public Date getDate_fin() {
		return date_fin;
	}



	/** Setter pour date_fin
	 * @param date_fin the date_fin to set
	 */
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}




	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", date_debut=" + date_debut + ", delai=" + delai + ", date_fin=" + date_fin + "]";
	}
	
	
	

}
