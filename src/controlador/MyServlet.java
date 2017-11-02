package controlador;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eshop.model.DataManager;

import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
public void init(ServletConfig config) throws ServletException {
		
		System.out.println("*** initializing controller servlet.");
		super.init(config);

		DataManager dataManager = new DataManager();
		dataManager.setDbURL(config.getInitParameter("dbURL"));
		dataManager.setDbUserName(config.getInitParameter("dbUserName"));
		dataManager.setDbPassword(config.getInitParameter("dbPassword"));
		
		try { // load the database JDBC driver
			Class.forName(config.getInitParameter("jdbcDriver"));
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String param1 = request.getParameter("x");
		//String param2 = request.getParameter("y");
		//response.getWriter().append("Parametros:  x" + param1 +  " y : " + param2);
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String usuario = request.getParameter("id");
		String pasapalabra = request.getParameter("pwd");
		
		//Calendertimestamp = calendar.setTimeInMillis();
		
		
		//queremos una lista con los nombres de los parámetros (no sus valores, sólo sus nombres
		//lo hacemos con getParameterNames
		ArrayList<String> parameterNames = new ArrayList<String>();
		 Enumeration enumeration = request.getParameterNames();
		    while (enumeration.hasMoreElements()) {
		        String parameterName = (String) enumeration.nextElement();
		        parameterNames.add(parameterName);
		    }
		
		out.println("<html><body>");
		
		if("ank".equalsIgnoreCase(usuario) && "puerta".equalsIgnoreCase(pasapalabra)){
			
			out.println("Hola " + usuario + " bienvenido <br>");
			out.println("Sesión iniciada a las:" + usuario+"<br>");
			out.println("Los nombres de los parámetros son: " +parameterNames);
			
			
		} else{
			
			out.println("contraseña incorrecta");
		}
		
		out.println("</body></html>");
	}

}
