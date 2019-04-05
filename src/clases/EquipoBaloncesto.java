package clases;

public class EquipoBaloncesto extends Equipo {
public static final int MAXIMO = 10;
/**
* Adiciona un nuevo jugador al equipo, si no se ha llegado al máximo.
* @param jugador el nuevo jugador que se adicionará
* @return boolean indicando si se pudo adicionar o no
*/
@Override
public boolean adicionarJugador(Jugador jugador) {
if (jugadores.size() < MAXIMO) {
return super.adicionarJugador(jugador);
}
else {
return false;
}
}
} 