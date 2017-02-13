package br.cin.ufpe.nlp.api.tokenization;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public interface TokenizerFactory<T extends Tokenizer<?>> {
	public T createFromText(String text) throws IOException;

	public T createFromFile(String filename) throws IOException;

	public T createFromFile(File file) throws IOException;

	public T create(InputStream stream) throws IOException;

	public T create(InputStream stream, java.lang.String encoding) throws IOException;

	public T create(Reader reader)  throws IOException;
	
}
