/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.prograiv.agenda.controller;



import com.google.gson.Gson;
import cr.ac.una.prograiv.agenda.bl.TelefonosBL;
import cr.ac.una.prograiv.agenda.domain.Telefonos;



import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author der12
 */
@WebServlet(name = "TelefonosServlet", urlPatterns = {"/TelefonosServlet"})
public class TelefonosServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
       try {
            //String para guardar el JSON generaro por al libreria GSON
            String json;
            
            //Se crea el objeto Telefono
            Telefonos f = new Telefonos();

            //Se crea el objeto de la logica de negocio
            TelefonosBL pBL = new TelefonosBL();

            //Se hace una pausa para ver el modal
            Thread.sleep(1000);
            
            
            //**********************************************************************
            //se toman los datos de la session
            //**********************************************************************
            HttpSession session = request.getSession();
            
            //**********************************************************************
            //se consulta cual accion se desea realizar
            //**********************************************************************
            String accion = request.getParameter("accion");
            switch (accion) {
                case "consultarTelefonos":
                    json = new Gson().toJson(pBL.findAll(Telefonos.class.getName()));
                    out.print(json);
                    break;
                case "eliminarTelefono":
                    
                        f.setPkTelefono(Integer.parseInt(request.getParameter("idTelefono")));
                    
                        //Se elimina el objeto
                        pBL.delete(f);

                        //Se imprime la respuesta con el response
                        out.print("El telefono fue eliminada correctamente");
                 
                    break;
                    
                case "consultarTelefonosByID":
                    //se consulta la persona por ID
                    f = pBL.findById(Integer.parseInt(request.getParameter("idTelefono")));
                    
                    //se pasa la informacion del objeto a formato JSON
                    json = new Gson().toJson(f);
                    out.print(json);
                    break;
                    
                    
                case "agregarTelefono": case "modificarTelefonos":

                    //Se llena el objeto con los datos enviados por AJAX por el metodo post
                    f.setPkTelefono(Integer.parseInt(request.getParameter("telefono")));
                    f.setPkFkCedula(Integer.parseInt(request.getParameter("cedula")));
                    f.setDescripcion(request.getParameter("descripcion"));
                   

                
                   

              
                    if(accion.equals("agregarPersona")){ //es insertar personas
                        //Se guarda el objeto
                        pBL.save(f);

                        //Se imprime la respuesta con el response
                        out.print("C~La persona fue ingresada correctamente");
                        
                    }else{//es modificar persona
                        //Se guarda el objeto
                        pBL.merge(f);

                        //Se imprime la respuesta con el response
                        out.print("C~La persona fue modificada correctamente");
                    }
                    
                    break;
                    
                default:
                    out.print("E~No se indico la acción que se desea realizare");
                    break;
            }

        } catch (NumberFormatException e) {
            out.print("E~" + e.getMessage());
        } catch (Exception e) {
            out.print("E~" + e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
