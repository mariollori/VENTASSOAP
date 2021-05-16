package pe.Ventas;

import javax.xml.ws.Endpoint;

public class VentasPublic {

	public static void main(String[] args) {
	 Endpoint.publish("http://localhost:1416/Ventas", new VentasImp());

	}

}
