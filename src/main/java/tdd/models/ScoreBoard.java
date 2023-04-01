/**
 * 
 */
package tdd.models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author David
 *
 */
public class ScoreBoard {

	private List<Game> resultados;

	/**
	 * 
	 */
	public ScoreBoard() {
		resultados = new ArrayList<Game>();
	}

	public void gameAdd(Game partido) {
		resultados.add(partido);

	}

	public void partidosEnJuego() {
		System.out.println("******RESULTADOS******");
		for (Game game : resultados) {
			System.out.println(game.getTeam1() + " " + game.getTeam1Score() + " - " + game.getTeam2Score() + " "
					+ game.getTeam2());
		}

	}

	public Game obtenerPrimerPartido() {
		Game partido = null;
		if (resultados.size() > 0) {
			partido = resultados.get(0);
		}
		return partido;
	}

	public void quitarFinalizados() {
		for (Game game : resultados) {
			if(game.getEstado()==1) {
				resultados.remove(game);
			}
		}
		
	}

	public int numeroPartidos() {
		return resultados.size();
	}

}
