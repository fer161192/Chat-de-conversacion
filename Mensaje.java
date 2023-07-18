package paquete_chat;
import java.util.Date;

public class Mensaje {
	private String contenido_mensaje;
	private final Date fechaEnvio;
	private final Usuario remitente;
	private final Usuario destinatario;

	public Mensaje (String texto_ingresado,Usuario remitente_entregado,Usuario destinatario_entregado)
	{
		this.contenido_mensaje = texto_ingresado;
		this.fechaEnvio = new Date();
		this.remitente = remitente_entregado;
		this.destinatario = destinatario_entregado;
	}

	public String getContenido_mensaje() {
		return this.contenido_mensaje;
	}

	public void setContenido_mensaje(String texto) {
		this.contenido_mensaje = texto;
	}
	
	public Date getFechaEnvio() {
		return this.fechaEnvio;
	}
	
	public Usuario getRemitente() {
		return this.remitente;
	}
	
	public Usuario getDestinatario() {
		return this.destinatario;
	}
}
