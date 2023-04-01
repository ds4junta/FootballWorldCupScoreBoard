/**
 * 
 */
package tdd.models;

/**
 * @author David
 *
 */
public class Game {

	private String team1;

	private String team2;

	// estado puede tomar los valores 0 (iniciado) y 1 (terminado)
	private int estado;

	private int team1Score;

	private int team2Score;

	private int totalScore;

	/**
	 * @param homeTeam
	 * @param awayTeam
	 */
	public Game(String homeTeam, String awayTeam) {
		this.setTeam1(homeTeam);
		this.setTeam2(awayTeam);
		this.setTeam1Score(0);
		this.setTeam2Score(0);
		this.setEstado(0);
	}

	/**
	 * @return the team1
	 */
	public String getTeam1() {
		return team1;
	}

	/**
	 * @param team1 the team1 to set
	 */
	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	/**
	 * @return the team2
	 */
	public String getTeam2() {
		return team2;
	}

	/**
	 * @param team2 the team2 to set
	 */
	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	/**
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * @return the team1Score
	 */
	public int getTeam1Score() {
		return team1Score;
	}

	/**
	 * @param team1Score the team1Score to set
	 */
	public void setTeam1Score(int team1Score) {
		this.team1Score = team1Score;
	}

	/**
	 * @return the team2Score
	 */
	public int getTeam2Score() {
		return team2Score;
	}

	/**
	 * @param team2Score the team2Score to set
	 */
	public void setTeam2Score(int team2Score) {
		this.team2Score = team2Score;
	}

	/**
	 * @return the totalScore
	 */
	public int getTotalScore() {
		return totalScore;
	}

	/**
	 * @param totalScore the totalScore to set
	 */
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public String gameScore() {
		return getTeam1Score()+"-"+getTeam2Score();
	}

	public void actualizaResultados(int team1Sc, int team2Sc) {
		this.setTeam1Score(team1Sc);
		this.setTeam2Score(team2Sc);
		
	}

}
