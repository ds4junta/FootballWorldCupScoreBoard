/**
 * 
 */
package tdd.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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
		System.out.println("");
		System.out.println("");
		System.out.println("");
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
			if (game.getEstado() == 1) {
				resultados.remove(game);
			}
		}

	}

	public int numeroPartidos() {
		return resultados.size();
	}

	public Game obtenerPartido(int i) {
		Game partido = null;
		if (resultados.size() > i) {
			partido = resultados.get(i);
		}
		return partido;
	}

	public void actualizarPartido(int i, Game partidoAct) {
		resultados.set(i, partidoAct);
	}

	public void actualizarResultados() {
		Random rand = new Random();
		int upperbound = 7;

		for (Game game : resultados) {
			int t1Sc = rand.nextInt(upperbound);
			int t2Sc = rand.nextInt(upperbound);
			game.actualizaResultados(t1Sc, t2Sc);
		}

	}

	public void ordenarClasificacion() {
		Collections.sort(resultados, Game.TotalScAndInsertDateComparator);

	}

}
