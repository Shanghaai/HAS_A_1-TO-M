package beans;

import java.util.Set;

public class Actor {
	
	private String actorName;
	private int aid;
	private Set Movies;
	
	public Actor() {
		// TODO Auto-generated constructor stub
	}
	
	public void setMovies(Set setMovies) {
		this.Movies = setMovies;
	}
	
	public Set getMovies() {
		return Movies;
	}

	public String getactorName() {
		return actorName;
	}
	public void setactorName(String name) {
		this.actorName = name;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
}
