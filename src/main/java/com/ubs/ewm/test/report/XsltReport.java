package com.ubs.ewm.test.report;

import java.io.File;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import net.sf.saxon.TransformerFactoryImpl;

import com.ubs.ewm.test.base.Base;

public class XsltReport extends Base {

	public static void transformXslt(String sourcePath, String xsltPath) {
		String resultPath = outputDir + "/index.html";

		TransformerFactory tFactory = new TransformerFactoryImpl();
		try {
			Transformer transformer = tFactory.newTransformer(new StreamSource(new File(xsltPath)));

			transformer.setParameter("testNgXslt.outputDir", outputDir);

			File file = new File(resultPath);
			transformer.transform(new StreamSource(new File(sourcePath)), new StreamResult(file));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
