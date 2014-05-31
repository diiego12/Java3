package diego.cuenta.controladores;

import diego.proyecto1.Perro;
import diego.proyecto1.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletRegistro extends HttpServlet {

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Perro p = new Perro();
        p.setNombre("Snoopy");
        Persona nm = new Persona();
        nm.setPerro(p);
        request.setAttribute("registro", nm);
        RequestDispatcher despachador = request.getRequestDispatcher("/registro.jsp");
        despachador.forward(request, response);
    }
}
    