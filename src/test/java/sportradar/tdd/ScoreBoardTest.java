/**
 * 
 */
package sportradar.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tdd.models.Game;
import tdd.models.ScoreBoard;

/**
 * @author David
 *
 */
public class ScoreBoardTest {

	ScoreBoard tablaResultados = new ScoreBoard();

	// Comprobar que tras iniciar el partido el resultado es de 0-0
	@Test
	public void iniciarPartido() {

		System.out.println("Test iniciarPartido()");
		// Given
		Game partido = new Game("Brasil", "Argentina");

		// When
		tablaResultados.gameAdd(partido);
		// Then

		assertEquals("0-0", partido.gameScore());
		tablaResultados.partidosEnJuego();
	}

	// Comprobar que tras finalizar el partido, el partido desaparece de la tabla de
	// resultados
	@Test
	public void finalizarPartido() {
		System.out.println("Test finalizarPartido()");
		// Given
		Game partido = null;

		// When
		partido = tablaResultados.obtenerPrimerPartido();
		if (partido != null) {
			partido.setEstado(1);
		}

		tablaResultados.quitarFinalizados();

		// Then
		assertEquals(0, tablaResultados.numeroPartidos());
		tablaResultados.partidosEnJuego();
	}

	// Comprobar que tras actualizar el resultado del partido, la tabla de
	// marcadores se encuentra actualizada
	@Test
	public void actualizarResultado() {
		System.out.println("Test actualizarResultado()");
		// Given
		Game partido = new Game("Francia", "Portugal");
		Game partidoAux = null;

		// When

		// se inserta partido
		tablaResultados.gameAdd(partido);

		// se busca partido a actualizar
		partidoAux = tablaResultados.obtenerPartido(0);
		if (partidoAux != null) {
			partidoAux.actualizaResultados(4, 2);
		}

		// Then
		assertEquals("4-2", partido.gameScore());
		tablaResultados.partidosEnJuego();
	}

	// Comprobar que tras insertar partidos y actualizar el resultado del partido,
	// la tabla queda ordenada por goles totales y en caso de empate por fecha más
	// actual de insercion
	@Test
	public void ordenarClasificacion() {
		System.out.println("Test ordenarClasificacion()");
		// Given
		Game p1 = new Game("Alemania", "Inglaterra");
		Game p2 = new Game("Argentina", "Ecuador");
		Game p3 = new Game("Chile", "Belgica");
		Game p4 = new Game("Brasil", "Japon");
		Game p5 = new Game("Espa\u00f1a", "Escocia");
		Game pAux = null;

		// When

		// se inserta partido
		tablaResultados.gameAdd(p1);
		tablaResultados.gameAdd(p2);
		tablaResultados.gameAdd(p3);
		tablaResultados.gameAdd(p4);
		tablaResultados.gameAdd(p5);

		// se actualizan marcadores de forma ramdon
		tablaResultados.actualizarResultados();

		System.out.println("Tabla de marcadores sin ordenar");
		tablaResultados.partidosEnJuego();
	
		
		// se ordena la tabla de resultados por goles y fecha de insercion
		tablaResultados.ordenarClasificacion();

		// Then
		System.out.println("Tabla de marcadores ordenada");
		tablaResultados.partidosEnJuego();
	}

}
