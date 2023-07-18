package paquete_chat;
import java.util.ArrayList;

public class Chat {
	private ArrayList<Usuario> lista_usuarios;
	
	public Chat() {
		this.lista_usuarios = new ArrayList<Usuario>();
	}
	
	public void agregarUsuario(Usuario usuario_ingresado) {
		this.lista_usuarios.add(usuario_ingresado);
	}
	
	public Usuario getUsuarioPorNombre(String nombre_ingresado) {
		
		Usuario auxiliar_usuario = null;
		for (int i = 0; i<this.lista_usuarios.size();i++) {
			if (this.lista_usuarios.get(i).getNombre_usuario().equals(nombre_ingresado)) {
				auxiliar_usuario = this.lista_usuarios.get(i);
				break;
			}
		}
		return(auxiliar_usuario);
	}
	
	public ArrayList<Mensaje> getHistorialConversacion(Usuario usuario1,Usuario usuario2) {
		
		ArrayList<Mensaje> historial = new ArrayList<Mensaje>();
		boolean encontrado = false;
		int j = 0;
		for (int i = 0; i<usuario1.getMensajes_enviados().size(); i++) {
			if (usuario1.getMensajes_enviados().get(i).getDestinatario().equals(usuario2)) {
				historial.add(usuario1.getMensajes_enviados().get(i));
				encontrado = false;
				while ((j<usuario2.getMensajes_enviados().size()) && (encontrado == false)) {
					if (usuario2.getMensajes_enviados().get(j).getDestinatario().equals(usuario1)) {
						historial.add(usuario2.getMensajes_enviados().get(j));
						encontrado = true;
					}
					j++;
				}
			}
		}
		return(historial);
	}
}
