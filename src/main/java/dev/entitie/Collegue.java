package dev.entitie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "collegue")
public class Collegue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String pseudo;
	@Column
	private String urlImage;
	@Column
	public int score;

	public Collegue() {

	}

	public Collegue(String pseudo, String urlImage, int score) {
		super();
		this.pseudo = pseudo;
		this.urlImage = urlImage;
		this.score = score;
	}

	public int getId() {
		return id;
	}
  
	public void setId(int id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

}
