package hr.vvg.java.web.servleti;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hr.vvg.java.web.klase.Korisnik;
import hr.vvg.java.web.klase.Projekt;
import hr.vvg.java.web.klase.Zadatak;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		ServletContext sc = getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/JSP/index.jsp");
		
		request.setAttribute("listaKorisnika", getKorisnik());
		request.setAttribute("listaProjekta", getProjekt());
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		request.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String korisnik = request.getParameter("korsinik");
		String projekt = request.getParameter("projekt");
		String opisZadatka = request.getParameter("opisZadatka");
		String trajanjeZadatka = request.getParameter("trajanjeZadatka");
		
		Korisnik korisnikProperty = getKorisnik().get(Integer.valueOf(korisnik) - 1);
		Projekt projektProperty = getProjekt().get(Integer.valueOf(projekt) - 1);
		int trajanjeZadatkaProperty = Integer.valueOf(trajanjeZadatka);
		
		request.setAttribute("zadatak", new Zadatak(korisnikProperty, projektProperty, opisZadatka, trajanjeZadatkaProperty));
		
		ServletContext sc = getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher("/WEB-INF/JSP/forward.jsp");
		
		rd.forward(request, response);
		
	}
	
	private List<Korisnik> getKorisnik () {
		List<Korisnik> listaKorisnika = new ArrayList<>();
		
		listaKorisnika.add(new Korisnik(1, "inovak", "Ivan", "Novak"));
		listaKorisnika.add(new Korisnik(2, "kkurz", "Kristian", "Kurz"));
		
		return listaKorisnika;
		
	}
	
	private List<Projekt> getProjekt () {
		List<Projekt> listaProjekta = new ArrayList<>();
		
		listaProjekta.add(new Projekt(1, "Programiranje Jave", "Vanitas"));
		listaProjekta.add(new Projekt(2, "Ice Blasting", "TUR"));
		
		return listaProjekta;
	}

}
