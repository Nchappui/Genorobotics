package specimen;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import specimen.SpecimenBean.*;

/**
 * Servlet implementation class SpecimenServlet
 */
@WebServlet("/addspecimen")
public class SpecimenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SpecimenDao specimenDao;

	public void init() {
		specimenDao = new SpecimenDao();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String specimenExtraInfos = request.getParameter("specimenExtraInfos");
		String specimenMeasurementType = request.getParameter("specimenMeasurementType");
		String specimenImage = request.getParameter("specimenImage");
		String specimenImageTimestamp = request.getParameter("specimenImageTimestamp");
		String specimenImageDescription = request.getParameter("specimenImageDescription");
		String specimenImageCopyright = request.getParameter("specimenImageCopyright");
		String specimenHost = request.getParameter("specimenHost");
		String specimenSexString = request.getParameter("specimenSex");
		Sexes specimenSex = Sexes.valueOf(specimenSexString);
		String specimenLifeStageString = request.getParameter("specimenLifeStage");
		LifeStages specimenLifeStage= LifeStages.valueOf(specimenLifeStageString);
		String specimenReproductionString = request.getParameter("specimenReproduction");
		ReproductionTypes specimenReproduction = ReproductionTypes.valueOf(specimenReproductionString);
		String specimenCollectionMethodName = request.getParameter("specimenCollectionMethodName");
		String specimenTaxonomicMethodName = request.getParameter("specimenTaxonomicMethodName");
		String specimenTaxonomicTimestamp = request.getParameter("specimenTaxonomicTimestamp");
		String specimenCollectionTimestamp = request.getParameter("specimenCollectionTimestamp");
		String specimenTaxonomyDomain = request.getParameter("specimenTaxonomyDomain");
		String specimenTaxonomyKingdom = request.getParameter("specimenTaxonomyKingdom");
		String specimenTaxonomyPhylum = request.getParameter("specimenTaxonomyPhylum");
		String specimenTaxonomyClass = request.getParameter("specimenTaxonomyClass");
		String specimenTaxonomyOrder = request.getParameter("specimenTaxonomyOrder");
		String specimenTaxonomyFamily = request.getParameter("specimenTaxonomyFamily");
		String specimenTaxonomyGenus = request.getParameter("specimenTaxonomyGenus");
		String specimenTaxonomySpecies = request.getParameter("specimenTaxonomySpecies");
		String specimenCollectionAreaContinent = request.getParameter("specimenCollectionAreaContinent");
		String specimenCollectionAreaCountry = request.getParameter("specimenCollectionAreaCountry");
		String specimenCollectionAreaState= request.getParameter("specimenCollectionAreaState");
		String specimenCollectionAreaRegion = request.getParameter("specimenCollectionAreaRegion");
		String specimenCollectionAreaSector = request.getParameter("specimenCollectionAreaSector");
		String specimenElevation = request.getParameter("specimenElevation");
		String specimenGPSX = request.getParameter("specimenGPSX");
		String specimenGPSY = request.getParameter("specimenGPSY");

		SpecimenBean specimenBean = new SpecimenBean();
		specimenBean.setExtraInfos(specimenExtraInfos);
		specimenBean.setMeasurementType(specimenMeasurementType);
		specimenBean.setImage(specimenImage);
		specimenBean.setImageTimestamp(specimenImageTimestamp);
		specimenBean.setImageDescription(specimenImageDescription);
		specimenBean.setImageCopyright(specimenImageCopyright);
		specimenBean.setHost(specimenHost);
		specimenBean.setSex(specimenSex);
		specimenBean.setLifeStage(specimenLifeStage);
		specimenBean.setReproduction(specimenReproduction);
		specimenBean.setCollectionMethodName(specimenCollectionMethodName);
		specimenBean.setTaxonomicMethodName(specimenTaxonomicMethodName);
		specimenBean.setTaxonomicTimestamp(specimenTaxonomicTimestamp);
		specimenBean.setCollectionTimestamp(specimenCollectionTimestamp);
		String taxonomy = specimenTaxonomyDomain+"; "+specimenTaxonomyKingdom+"; "+specimenTaxonomyPhylum +"; "+ specimenTaxonomyClass +"; "+
				specimenTaxonomyOrder +"; "+ specimenTaxonomyFamily +"; "+ specimenTaxonomyGenus +"; "+ specimenTaxonomySpecies;
		specimenBean.setCollectionTaxonomy(taxonomy);
		String collection = specimenCollectionAreaContinent+"; "+ specimenCollectionAreaCountry+"; "+ specimenCollectionAreaState+"; "+
				specimenCollectionAreaRegion+"; "+ specimenCollectionAreaSector;
		specimenBean.setCollectionArea(collection);
		specimenBean.setCollectionElevation(specimenElevation);
		specimenBean.setCollectionGPSX(specimenGPSX);
		specimenBean.setCollectionGPSY(specimenGPSY);

		try {
			if(specimenDao.registerSpecimen(specimenBean)!=0) {
				response.sendRedirect("validatedSpecimen.jsp");
			}else {
				response.sendRedirect("addSpecimen.jsp");
			}


		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
