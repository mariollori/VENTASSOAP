package pe.Ventas;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface VentasDao {
	@WebMethod
	public List<String> detalleventa(int id, String fechai,String fechaf);

}
