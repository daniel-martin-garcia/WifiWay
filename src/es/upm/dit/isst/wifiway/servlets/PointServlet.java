package es.upm.dit.isst.wifiway.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.*;


import es.upm.dit.isst.wifiway.dao.UserDAOImplementation;
import es.upm.dit.isst.wifiway.dao.model.*;
import es.upm.dit.isst.wifiway.dao.*;


@WebServlet("/PointServlet")
public class PointServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//double latitud = Double.parseDouble(req.getParameter("latitud"));
		//double longitud = Double.parseDouble(req.getParameter("longitud"));
		
		String point = req.getParameter("point");
		System.out.println(point);
		String[] parts = point.split("\\(");
		double longitud = Double.parseDouble(parts[0]); 
		double latitud = Double.parseDouble(parts[1]);
		//String latitud = "123";
		
		//ponemos bien las coordenadas (decimales)
		
		//Point point = PointDAOImplementation.getInstance().get(longitud, latitud);
		
		
		
		
		/*if (null == point) {
			//PETICION A LA BASE DE DATOS
		}

		else {
			//req.getSession().setAttribute("", );
			resp.sendRedirect(req.getContextPath() + "/.jsp");
		}*/
		System.out.println(longitud);
		System.out.println(latitud);
		   
		Wifi wifi = new Wifi();
		
		wifi.setSsid("Movistar V00001");
		wifi.setMAC("00:00:00:00:00:01");
		wifi.setType("OpenEnc1");   
      
		//Wifi wifis[] = new Wifi[1];
		
		String wifis = "[" + wifi.toString() +"]";
		   
		System.out.print(wifis);
		req.getSession().setAttribute("longitud", longitud);
		req.getSession().setAttribute("latitud", latitud);
		req.getSession().setAttribute("wifis", wifis);
		
		resp.sendRedirect(req.getContextPath() + "/Point.jsp");
		return;
		
	}
	
}


