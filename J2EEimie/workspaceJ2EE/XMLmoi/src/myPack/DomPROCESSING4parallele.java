package myPack;

import java.io.File;
import java.text.Normalizer;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

//TODO inclure la ligne de DTD mettre
//pr modifier, open puis close
public class DomPROCESSING4parallele {
	private static void treatExistingChild() {

		Node nNode = nList.item(temp);
		System.out.println("\nCurrent Element :" + nNode.getNodeName());
		short typee = nNode.getNodeType();
		switch (typee) {

		case Node.ELEMENT_NODE:

			Element eElement = (Element) nNode;
			// System.out.println("Student roll no : " +
			// eElement.getAttribute("rollno"));
			// System.out.println(
			// "etagere : " +
			// eElement.getElementsByTagName("etag�re").item(0).getTextContent());

			System.out.println("etag�re : " + eElement.getElementsByTagName("etag�re").item(0).getNodeName());
			String badBalise = eElement.getElementsByTagName("etag�re").item(0).getNodeName();
			String goodBalise = enleveAccents(badBalise);
			System.out.println("goodBalise=" + goodBalise);
			// System.out.println(
			// "Last Name : " +
			// eElement.getElementsByTagName("lastname").item(0).getTextContent());
			// System.out.println(
			// "Nick Name : " +
			// eElement.getElementsByTagName("nickname").item(0).getTextContent());
			// System.out.println("Marks : " +
			// eElement.getElementsByTagName("marks").item(0).getTextContent());
			//

			// root element
			Element rootElement = docTo.createElement(eElement.getNodeName());
			System.out.println("getNodeName=" + eElement.getNodeName());
			docTo.appendChild(rootElement);

			// Element carname1 = docTo.createElement("carname");
			// Attr attrType1 = docTo.createAttribute("type");
			// attrType1.setValue("sports");
			// carname1.setAttributeNode(attrType1);
			// carname1.appendChild(docTo.createTextNode("Ferrari
			// 202"));
			// rootElement.appendChild(carname1);

		}

		transformer.transform(source, result);
		// Output to console for testing
		StreamResult consoleResult = new StreamResult(System.out);
		transformer.transform(source, consoleResult);
	}

	NodeList nList;
	File inputFile;
	DocumentBuilderFactory dbFactory;

	public static void main(String[] args) {
		DomPROCESSING4parallele dp = new DomPROCESSING4parallele();

		try {
			dp.inputFile = new File("bibliotheque.xml");
			dp.dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document docFrom = dBuilder.parse(inputFile);
			docFrom.getDocumentElement().normalize();
			System.out.println("Root element :" + docFrom.getDocumentElement().getNodeName());
			dp.nList = docFrom.getElementsByTagName("bibliotheque");
			System.out.println("----------------------------");

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			Document docTo = dBuilder.newDocument();
			DOMSource source = new DOMSource(docTo);
			StreamResult result = new StreamResult(new File("bibliothequePROCESSED.xml"));

			for (int temp = 0; temp < nList.getLength(); temp++) {
				treatExistingChild();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// http://stackoverflow.com/questions/15190656/easy-way-to-remove-utf-8-accents-from-a-string
	/** remplace les e accent aigu par e **/
	private static String enleveAccents(String badBalise) {
		System.out.println("DomPROCESSING3genere1Elemt.java ");
		// String newString = badBalise.replace('e', 'a');

		//
		String newString = Normalizer.normalize(badBalise, Normalizer.Form.NFD);
		newString = newString.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		System.out.println("old string=" + badBalise);
		System.out.println("new string=" + newString);
		return newString;
	}
}