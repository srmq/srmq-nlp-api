package br.cin.ufpe.nlp.api.transform;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public interface DocumentProcessorNToOne {
	public void processDocument(Reader[] inputDocuments, Writer outputDocument) throws IOException;
}
