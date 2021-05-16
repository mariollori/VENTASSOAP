package pe.Ventas;

import java.util.List;
import java.util.Scanner;

public class ClienteService {
	public static void main(String[] args) {
		VentasImpService vent= new VentasImpService();
		VentasDao cliente= vent.getVentasImpPort();
		Scanner tec = new Scanner(System.in);
        System.out.print("ID del cliente: ");
        int id;
        id = tec.nextInt();
        System.out.print("Fecha inicial: ");
        String fechai = tec.next();
        System.out.print("Fecha final: ");
        String fechaf = tec.next();
        
        List<String> total = cliente.detalleventa(id,fechai,fechaf);
        for (int i = 0; i < total.size(); i++) {
            System.out.println(total.get(i).toString());
        }
	

		}
}
