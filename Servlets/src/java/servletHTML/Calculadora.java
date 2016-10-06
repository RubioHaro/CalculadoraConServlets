/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletHTML;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;

public class Calculadora extends HttpServlet {

    int Numero1;
    int Numero2;
    String opc;
    float Resultado;

    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        Numero1 = Integer.parseInt(peticion.getParameter("Numero1"));
        Numero2 = Integer.parseInt(peticion.getParameter("Numero2"));
        opc = peticion.getParameter("opc");

        switch (opc) {
            case "+":
                Resultado = Numero1 + Numero2;
                break;
            case "-":
                Resultado = Numero1 - Numero2;
                break;
            case "*":
                Resultado = Numero1 * Numero2;
                break;
            case "/":
                Resultado = (float)Numero1 / Numero2;
                break;

        }

        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Resultado</title>"
                + "<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n"
                + "        <link href=\"css/Estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>"
                + "</head>");
        out.println("<body>"
                + "<div class=\"container\">\n" +
"            <div class=\"panel panel-default\">\n" +
"                <div class=\"panel-body\">\n" +
"                    <div class=\"form-group\">\n" +
"                        <div class=\"text-center\">"+Numero1 + " " + opc + " " +Numero2 + " = "+ Resultado+"</div>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"        <script src=\"js/bootstrap.min.js\"></script>\n" +
"        <script src=\"js/jquery2.min.js\"></script>"
                + "");
        out.close();
    }
}
