package pl.coderslab.controller;

import pl.coderslab.model.Solution;
import pl.coderslab.model.SolutionDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class HomeServlet extends HttpServlet {

    private SolutionDao solutionDao = new SolutionDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int solutionLimit = Integer.parseInt(getServletContext().getInitParameter("number-solutions"));
        List<Solution> solutions = solutionDao.findRecent(solutionLimit);
        request.setAttribute("solutions", solutions);
        getServletContext().getRequestDispatcher("/index.jsp")
                .forward(request, response);
    }
}
