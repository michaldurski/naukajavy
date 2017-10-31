

import java.io.FileOutputStream;
import java.io.IOException;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class Dokument {
	private String tytul;
	private String tresc;

	public Dokument(String tytul, String tresc) {
		this.tytul = tytul;
		this.tresc = tresc;
	}

	public String saveMitopdf() {
		return tytul + " " + tresc;
	}

	public void saveMeToPDF(String index) throws IOException, DocumentException {
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(index + "_" + getTytul() + ".pdf"));
		document.open();
		document.add(new Paragraph(getTresc()));
		document.close();
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTresc(String tresc) {
		this.tresc = tresc;
	}

	public String getTresc() {
		return tresc;
	}
}
