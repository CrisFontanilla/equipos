package clases;
import java.util.*;

public abstract class Equipo {
	protected List<Jugador> jugadores = new ArrayList<Jugador>();
	private Jugador entrenador;
	
	public Equipo(List<Jugador> jugadores, Jugador entrenador) 
	{
		super();
		this.jugadores=jugadores;
		this.entrenador=entrenador;
	}
	
	public abstract boolean adicionarJugador(Jugador jugador);
}
