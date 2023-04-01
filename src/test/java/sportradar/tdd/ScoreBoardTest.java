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
	
	//Comprobar que tras iniciar el partido el resultado es de 0-0
	@Test
	public void iniciarPartido() {
		
		System.out.println("Test iniciarPartido()");
		//Given
		Game partido = new Game("Brasil", "Argentina");
		
		//When
		tablaResultados.gameAdd(partido);
		//Then
		
		assertEquals("0-0", partido.gameScore());
		tablaResultados.partidosEnJuego();
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	
	//Comprobar que tras finalizar el partido, el partido desaparece de la tabla de resultados
		@Test
		public void finalizarPartido() {
			System.out.println("Test finalizarPartido()");
			//Given
			Game partido = null;
			
			//When
			partido = tablaResultados.obtenerPrimerPartido();
			if(partido!=null) {
				partido.setEstado(1);
			}
			
			tablaResultados.quitarFinalizados();
			
			//Then
			assertEquals(0, tablaResultados.numeroPartidos());
			tablaResultados.partidosEnJuego();
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	

}
