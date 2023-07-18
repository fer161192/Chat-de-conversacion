package paquete_chat;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Usuario gabriel = new Usuario("Gabriel");
		Usuario fernando = new Usuario("Fernando");
		Usuario luciano = new Usuario("Luciano");
		Usuario walda = new Usuario("Walda");
		Usuario walter = new Usuario("Walter");
		
		Chat objeto_chat = new Chat();
		objeto_chat.agregarUsuario(walda);
		objeto_chat.agregarUsuario(luciano);
		objeto_chat.agregarUsuario(fernando);
		objeto_chat.agregarUsuario(gabriel);
		//Conversacion entre gabriel y walda
		gabriel.enviarMensaje("Hola walda, como andas?", walda);
		walda.enviarMensaje("Hola gabriel, todo bien y vos?", gabriel);
		gabriel.enviarMensaje("Bien bien, saludos a fernando!!!!", walda);
		//Conversacion entre fernando y walda
		fernando.enviarMensaje("ehhh ma, guardame una porcion de tarta", walda);
		walda.enviarMensaje("okey hijo, te lo dejo para la noche?", fernando);
		fernando.enviarMensaje("si ma", walda);
		walda.enviarMensaje("okey hijo, cuidate", fernando);
		//Coonversacion entre luciano y walda
		luciano.enviarMensaje("ehhh ma, me prestas 5 mil pesos?", walda);
		walda.enviarMensaje("okey hijo, te lo dejo para hoy?", luciano);
		
		//Buscar un usuario por su nombre
		System.out.println("El usuario "+objeto_chat.getUsuarioPorNombre("Walda").getNombre_usuario()+" ha sido encontrado.");
		
		//Buscar historial de conversacion
		
		ArrayList<Mensaje> historial_conversacion1 = objeto_chat.getHistorialConversacion(luciano, walda);
		System.out.println("El historial de conversaciones 1 es: ");
		for (int i = 0; i<historial_conversacion1.size(); i++) {
			System.out.println(historial_conversacion1.get(i).getContenido_mensaje());
		}
		
		ArrayList<Mensaje> historial_conversacion2 = objeto_chat.getHistorialConversacion(gabriel, walda);
		System.out.println("El historial de conversaciones 2 es: ");
		for (int j = 0; j<historial_conversacion2.size(); j++) {
			System.out.println(historial_conversacion2.get(j).getContenido_mensaje());
		}
		
		ArrayList<Mensaje> historial_conversacion3 = objeto_chat.getHistorialConversacion(fernando, walda);
		System.out.println("El historial de conversaciones 3 es: ");
		for (int j = 0; j<historial_conversacion3.size(); j++) {
			System.out.println(historial_conversacion3.get(j).getContenido_mensaje());
		}
		
	}

}
