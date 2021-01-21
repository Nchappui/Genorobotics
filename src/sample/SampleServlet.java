package sample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/addsample")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SampleDao sampleDao;
	
	public void init() {
		sampleDao = new SampleDao();
	}
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String storingLocation = request.getParameter("storingLocation");
		  String sampleSequencer = request.getParameter("sampleSequencer");
		  String sampleStocker = request.getParameter("sampleStocker");
		  String sampleUploader = request.getParameter("sampleUploader");
		  String sampleIdentifier = request.getParameter("sampleIdentifier");
		  String sampleCollector = request.getParameter("sampleCollector");
		  String sampleExtractor = request.getParameter("sampleExtractor");
		  String sampleAmplifier = request.getParameter("sampleAmplifier");
		  String sequencingMethodName = request.getParameter("sequencingMethodName");
		  String amplificationMethodName = request.getParameter("amplificationMethodName");
		  String extractionMethodName = request.getParameter("extractionMethodName");
		  String specimenStoringID = request.getParameter("specimenStoringID");
		  String sequencingTimestamp = request.getParameter("sequencingTimestamp");
		  String amplificationTimestamp = request.getParameter("amplificationTimestamp");
		  String extractionTimestamp = request.getParameter("extractionTimestamp");
		  String primerCodes = request.getParameter("primerCodes");
		  String readDirection = request.getParameter("readDirection");
		  String sequenceLength = request.getParameter("sequenceLength");
		  String marker = request.getParameter("marker");
		  String primerDescription = request.getParameter("primerDescription");
		  String sequenceData = request.getParameter("sequenceData");
		  String baseCallingFile = request.getParameter("baseCallingFile");
	
		  SampleBean sampleBean = new SampleBean();
		  sampleBean.setStoringLocation(storingLocation);
		  sampleBean.setSampleSequencer(sampleSequencer);
		  sampleBean.setSampleStocker(sampleStocker);
		  sampleBean.setSampleUploader(sampleUploader);
		  sampleBean.setSampleIdentifier(sampleIdentifier);
		  sampleBean.setSampleCollector(sampleCollector);
		  sampleBean.setSampleExtractor(sampleExtractor);
		  sampleBean.setSampleAmplifier(sampleAmplifier);
		  sampleBean.setSequencingMethodName(sequencingMethodName);
		  sampleBean.setAmplificationMethodName(amplificationMethodName);
		  sampleBean.setExtractionMethodName(extractionMethodName);
		  sampleBean.setSpecimenStoringID(specimenStoringID);
		  sampleBean.setSequencingTimestamp(sequencingTimestamp);
		  sampleBean.setAmplificationTimestamp(amplificationTimestamp);
		  sampleBean.setExtractionTimestamp(extractionTimestamp);
		  sampleBean.setPrimerCodes(primerCodes);
		  sampleBean.setReadDirection(readDirection);
		  sampleBean.setSequenceLength(sequenceLength);
		  sampleBean.setMarker(marker);
		  sampleBean.setPrimerDescription(primerDescription);
		  sampleBean.setSequenceData(sequenceData);
		  sampleBean.setBaseCallingFile(baseCallingFile);
		  

			try {
				if(sampleDao.registerSample(sampleBean)!=0) {
					response.sendRedirect("validatedSample.jsp");
				}else {
					response.sendRedirect("addSample.jsp");
				}
				
				
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
	}

}
