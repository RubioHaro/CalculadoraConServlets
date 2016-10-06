 //Primer   Servlet.
//Muy   sencillo.
package servletHTML;

import java.io.*;
import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet(name = "ServletHolaMundo", urlPatterns = {"/ServletHolaMundo"})
public class ServletHolaMundo extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = new PrintWriter(res.getOutputStream());
        out.println("<html>");
        out.println("<head><title>HolaMundoServlet</title>"
                + "<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n"
                + "        <link href=\"css/Estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>"
                + "</head>");
        out.println("<body>"
                + "<div class=\"container\">\n" +
"            <div class=\"panel panel-default\">\n" +
"                <div class=\"panel-body\">\n" +
"                    <div class=\"form-group\">\n" +
"                        <div class=\"text-center\">Hola   Mundo   desde   el   servidor WEB</div>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"        <script src=\"js/bootstrap.min.js\"></script>\n" +
"        <script src=\"js/jquery2.min.js\"></script>"
                + "");
        out.close();
    }

    public String getServletInfo() {
        return "Crea   una   página   HTML   que   dice   HolaMundo";
    }
}
