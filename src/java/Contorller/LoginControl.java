
package Contorller;

import Model.DAO.PersonDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginControl", urlPatterns = {"/LoginControl"})
public class LoginControl extends HttpServlet {

     public void Pot(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, NoSuchAlgorithmException {
        response.setContentType("text/html"); // by this we show our output type
        PrintWriter writer = response.getWriter();

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        if (PersonDAO.check(name,password)){
            System.out.println("you're welcome");
            RequestDispatcher requestDispatcher= request.getRequestDispatcher("SuccessPage.jsp");
            requestDispatcher.forward(request,response);
        }else {
            System.out.println("Try again");
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("ErrorPage.jsp");
            requestDispatcher.forward(request,response);
        }

    }

}
