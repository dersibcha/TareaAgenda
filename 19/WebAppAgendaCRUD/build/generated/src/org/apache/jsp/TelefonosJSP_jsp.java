package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TelefonosJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Telefonos</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("\n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        <!-- Estilos de la página -->\n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        <link href=\"css/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        <!-- Script's de UTILERIAS -->\n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        <script src=\"js/utils.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        <!-- Script's de PERSONAS -->\n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        <!-- Modal del BootsTrap para mostrar mensajes                  -->\n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog modal-sm\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4 class=\"modal-title\" id=\"myModalTitle\">Modal Header</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\" id=\"myModalMessage\">\n");
      out.write("                        <p>This is a small modal.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <!-- ********************************************************** -->\n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        <!-- Modal del BootsTrap para mostrar el formulario de insertar -->\n");
      out.write("        <!-- o modificar\n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        <div class=\"modal fade\" id=\"myModalFormulario\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog modal-lg\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4 class=\"modal-title\" id=\"myModalTitle\">Insertar / Modificar Telefonos\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"modal-body\" id=\"myModalMessage\">\n");
      out.write("                        <form role=\"form\" onsubmit=\"return false;\" id=\"formTelefonos\">\n");
      out.write("                            <div class=\"form-group\" id=\"groupCedula\">\n");
      out.write("                                <label for=\"cedula\">Cedula:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"cedula\" autofocus=\"true\" placeholder=\"Cedula\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\" id=\"groupTelefono\">\n");
      out.write("                                <label for=\"nombre\">Telefono:</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"telefono\" placeholder=\"Telefono\" >\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\" id=\"groupDescripcion\">\n");
      out.write("                                <label for=\"descripcion\">Primer Apellido</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"descripcion\" placeholder=\"Descripciono\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"hidden\" value=\"agregarTelefono\" id=\"telefonosAction\"/>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\" id=\"enviar\">Guardar</button>\n");
      out.write("                                <button type=\"reset\" class=\"btn btn-danger\" id=\"cancelar\">Cancelar</button>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group height25\" >\n");
      out.write("                                <div class=\"alert alert-success hiddenDiv\" id=\"mesajeResult\">\n");
      out.write("                                    <strong id=\"mesajeResultNeg\">Info!</strong> \n");
      out.write("                                    <span id=\"mesajeResultText\">This alert box could indicate a neutral informative change or action.</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        <!-- ********************************************************** -->\n");
      out.write("        \n");
      out.write("         <div class=\"container\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("                <h1>Agenda <small>Sistema para la administración de contáctos</small></h1>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- ********************************************************** -->\n");
      out.write("            <!-- PANEL SUPERIOR -->\n");
      out.write("            <!-- ********************************************************** -->\n");
      out.write("            \n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <!-- ********************************************************** -->\n");
      out.write("                        <!-- COLUMNA DEL MENU -->\n");
      out.write("                        <!-- ********************************************************** -->\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <div class=\"dropdown\">\n");
      out.write("                                <button class=\"btn btn-primary dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\">Menú Principal\n");
      out.write("                                    <span class=\"caret\"></span></button>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    \n");
      out.write("                                    <li><a href=\"PersonasJSP.jsp\">Mantenimiento Personas</a></li>\n");
      out.write("                                    <li><a href=\"#\">Mantenimiento Teléfonos</a></li>\n");
      out.write("                                    <li><a href=\"#\">Mantenimiento Direcciones</a></li>\n");
      out.write("                                    <li class=\"divider\"></li>\n");
      out.write("                        utton type=\"button\" class=\"btn btn-info centered\" data-toggle=\"modal\" data-target=\"#myModalSesion\" id=\"btMostarSesion\">Mostrar datos de la sesión</button>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- ********************************************************** -->\n");
      out.write("                        <!-- COLUMNA DEL BOTON DE CERRAR SESION -->\n");
      out.write("                        <!-- ********************************************************** -->\n");
      out.write("                        <div class=\"col-md-4\" style=\"text-align: right;\">\n");
      out.write("                            <a class=\"btn btn-warning\" href=\"Logout\" role=\"button\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-log-out\" aria-hidden=\"true\"></span>\n");
      out.write("                                Cerrar Sesión\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- ********************************************************** -->\n");
      out.write("            <!-- PANEL DEL MANTENIMIENTO DE PERSONAS -->\n");
      out.write("            <!-- ********************************************************** -->\n");
      out.write("            \n");
      out.write("            <div class=\"panel panel-primary\">\n");
      out.write("                <div class=\"panel-heading\"><h3>Mantenimiento de Telefonos</h3></div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <center>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary centered\" data-toggle=\"modal\" data-target=\"#myModalFormulario\" id=\"btMostarForm\">Insertar Telefono</button>\n");
      out.write("                    </center><br>\n");
      out.write("                    <!-- ********************************************************** -->\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <form role=\"form\" onsubmit=\"return false;\" id=\"formTelefonos\" class=\"form-horizontal centered\">\n");
      out.write("                            <div class=\"form-group\" id=\"groupCedula\">\n");
      out.write("                                <div class=\"col-sm-4\" style=\"text-align: right; vertical-align: middle;\">\n");
      out.write("                                    <p><b>Buscar por cedula de la persona:</b></p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Digite la cedula de la persona\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-info centered\" data-toggle=\"modal\" data-target=\"#myModalFormulario\" id=\"btMostarForm\">\n");
      out.write("                                        Buscar <span class=\"glyphicon glyphicon-search\"></span>\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- ********************************************************** -->\n");
      out.write("\n");
      out.write("                    <table class=\"table table-hover table-condensed\" id=\"tablaTelefonos\"></table>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-footer\">Nota: Acciones validas dependeran del rol del usuario</div>\n");
      out.write("            </div>\n");
      out.write("        </div>            <li><a href=\"Logout\">Cerrar Sesión</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- ********************************************************** -->\n");
      out.write("                        <!-- COLUMNA DEL MENU -->\n");
      out.write("                        <!-- ********************************************************** -->\n");
      out.write("                        <div class=\"col-md-4\" style=\"text-align: center\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-info centered\" data-toggle=\"modal\" data-target=\"#myModalSesion\" id=\"btMostarSesion\">Mostrar datos de la sesión</button>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- ********************************************************** -->\n");
      out.write("                        <!-- COLUMNA DEL BOTON DE CERRAR SESION -->\n");
      out.write("                        <!-- ********************************************************** -->\n");
      out.write("                        <div class=\"col-md-4\" style=\"text-align: right;\">\n");
      out.write("                            <a class=\"btn btn-warning\" href=\"Logout\" role=\"button\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-log-out\" aria-hidden=\"true\"></span>\n");
      out.write("                                Cerrar Sesión\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("           \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
