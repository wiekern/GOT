package servlets;

import crud.BenutzerHelper;
import crud.BewertungHelper;
import entities.Playliste;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Yafei on 14/01/2017.
 */
@WebServlet(name = "BenutzerServlet", urlPatterns = {"/benutzer"})
public class BenutzerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String loginKennung = request.getParameter("loginKennung");
        BenutzerHelper benutzerHelper = new BenutzerHelper();
        List results = benutzerHelper.getAllByLoginkennung(loginKennung);
        if (results != null && results.size() > 0) {
//                response.getWriter().write(((Object [])results.get(0)).length + "");

            Playliste playliste = (Playliste) ((Object [])results.get(0))[1];
//                response.getWriter().write(playliste.getEpisoden().size() + "");
//                response.getWriter().write(playliste.getEpisoden().get(0).getStaffel() + "");
            request.setAttribute("playliste", playliste);
        } else {
            response.getWriter().write("Error");
            return;
        }

        BewertungHelper bewertungHelper = new BewertungHelper();
        List ratingResults = bewertungHelper.getAllByBenutzer(loginKennung);
        if (ratingResults != null && ratingResults.size() > 0) {
            request.setAttribute("bewertungen", ratingResults);
        } else {

        }

        request.getRequestDispatcher("/templates/benutzer.ftl").forward(request, response);

    }
}