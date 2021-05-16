package pe.Ventas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "pe.Ventas.VentasDao")
public class VentasImp implements VentasDao {

	@Override
	public List<String> detalleventa(int id, String fechai, String fechaf) {
		  List<String> lista = new ArrayList<String>();
	        Connection con = null;
	    String codan=" ";
	        String url = "jdbc:mysql://localhost:3306/phpxml";

	        try {

	            con = DriverManager.getConnection(url, "root", "root");
	            String sql = "select v.fecha,v.numdoc,d.precio,d.cantidad,p.nombreprod"
	                    + " from venta v, detalle d , producto p"
	                    + " where v.idcliente='" + id + "' and v.fecha between '" + fechai + "' and '" + fechaf + "'and d.idventa=v.idventa and p.idproducto=d.idproducto; ";
	                   
	            PreparedStatement peticion = con.prepareStatement(sql);
	            ResultSet rs = peticion.executeQuery();

	            while (rs.next()) {
	                
	                if(!rs.getString("numdoc").equals(codan)){
	                  
	                    lista.add("Venta :  " + rs.getString("fecha") + "  nroDoc: " + rs.getString("numdoc") );
	                     lista.add("                Detalle: Precio" + rs.getString("precio") + " Cantidad:" + rs.getString("cantidad") +
	                        " Producto: " + rs.getString("nombreprod"));
	                }else{
	                     lista.add("                Detalle: Precio" + rs.getString("precio") + " Cantidad:" + rs.getString("cantidad") +
	                        " Producto: " + rs.getString("nombreprod"));
	                }
	                
	                 codan = rs.getString("numdoc");
	            }

	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        return lista;
	}



}
