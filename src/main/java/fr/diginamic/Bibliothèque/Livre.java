package fr.diginamic.Bibliothèque;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LIVRE")
public class Livre {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="TITRE")
	private String titre;
	
	@Column(name="AUTEUR")
	private String auteur;
	
	/** Constructeur
	 * 
	 */
	public Livre() {
	
	}
	
	

	/** Constructeur
	 * @param id
	 * @param titre
	 * @param auteur
	 */
	public Livre(Integer id, String titre, String auteur) {
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
	}



	
	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + "]";
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



	/** Getter pour titre
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}



	/** Setter pour titre
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}



	/** Getter pour auteur
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}



	/** Setter pour auteur
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	
	
}
