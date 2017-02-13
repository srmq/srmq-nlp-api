package br.cin.ufpe.nlp.api.transform;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public interface DocumentProcessorOneToN {
	public void processDocument(Reader inputDocument, Writer[] outputDocuments) throws IOException;
}
