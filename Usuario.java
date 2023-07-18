package paquete_chat;
import java.util.ArrayList;

public class Usuario {
	private String nombre_usuario;
	private ArrayList<Mensaje> mensajes_enviados;
	private ArrayList<Mensaje> mensajes_recibidos;
	
	public Usuario(String nombre_ingresado) {
		this.nombre_usuario = nombre_ingresado;
		this.mensajes_enviados = new ArrayList<Mensaje>();
		this.mensajes_recibidos = new ArrayList<Mensaje>();
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	
	public ArrayList<Mensaje> getMensajes_enviados(){
		return this.mensajes_enviados;
	}
	
	public ArrayList<Mensaje> getMensajes_recibidos(){
		return this.mensajes_recibidos;
	}
	
	private void agregarMensajeRecibido(Mensaje mensaje_ingresado) {
		this.mensajes_recibidos.add(mensaje_ingresado);
	}
	
	private void agregarMensajeEnviado(Mensaje mensaje_ingresado) {
		this.mensajes_enviados.add(mensaje_ingresado);
	}
	
	public void enviarMensaje(String texto_ingresado, Usuario destinatario_ingresado) {
		Mensaje mensaje = new Mensaje(texto_ingresado,this,destinatario_ingresado);
		this.agregarMensajeEnviado(mensaje);
		destinatario_ingresado.agregarMensajeRecibido(mensaje);
	}
}
