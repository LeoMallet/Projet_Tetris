package metier;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.cache.annotation.Cacheable;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY	)
@Table(name="tetrimino")
public class Tetrimino {
		


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TET_ID")
	private int id;
	
	@Column(name="TET_NOM")
	private String nom;
		
	@Column(name="TET_COULEUR")
	private String couleur;
	
	@Column(name="TET_FORME")
	private String formeTetrimino;

	@OneToMany(mappedBy="tetrimino")
	private List<Coup> coups;
	
	private int[][] matriceTetrimino=new int[5][5];
	
	public int[][] getMatriceTetrimino(String formeTetrimino){
		String[] tab = formeTetrimino.split(";");
		for(int i=0;i<tab.length;i++) {
			tab[i]=tab[i].substring(1, tab.length);
			String[] tab2 = tab[i].split(",");
			int x = Integer.parseInt(tab2[0]);
			int y = Integer.parseInt(tab2[1]);
			this.matriceTetrimino[y][x]=1;
		}
		
		return matriceTetrimino;
	}
	
	public int[][] resizeMatrice(int max, int[][] matrice){
        int[][] matriceRetour = new int[max+1][max+1];
        
        for(int i=0;i<matriceRetour.length;i++) {
            for(int j=0;j<matriceRetour.length;j++)
                matriceRetour[i][j]=matrice[i][j];
        }
                
        return matriceRetour;
    }
	
	public int[][] rotation45deg(int[][] matriceEntree){
		int size = matriceEntree.length;
		int[][] matriceRetour = new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++)
				matriceRetour[i][j]=matriceEntree[size-1-j][i];
		}
		return matriceRetour;	
	}
	
	public List<Coup> getCoups() {
		return coups;
	}

	public void setCoups(List<Coup> coups) {
		this.coups = coups;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
//	public List<Coup> getCoups() {
//	return coups;
//	}
//
//	public void setCoups(List<Coup> coups) {
//	this.coups = coups;
//	}

	@Override
	public String toString() {
		return "Tetrimino n."+id+" nom=" + nom + ", couleur=" + couleur;
	}

}
