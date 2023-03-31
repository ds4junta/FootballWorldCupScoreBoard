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
	
	//Vamos a comprobar que tras iniciar el partido el resultado es de 0-0
	@Test
	public void iniciarPartido() {
		//Given
		Game partido = new Game("Brasil", "Argentina");
		
		//When
		tablaResultados.gameAdd(partido);
		//Then
		
		assertEquals("0-0", partido.gameScore());
		tablaResultados.partidosEnJuego();
	}
	

}
