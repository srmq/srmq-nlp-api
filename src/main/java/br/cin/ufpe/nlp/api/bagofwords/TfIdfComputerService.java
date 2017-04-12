package br.cin.ufpe.nlp.api.bagofwords;

import java.io.IOException;
import java.nio.file.Path;

public interface TfIdfComputerService {
	public TfIdfInfo computeTfIdfRecursively(Path path) throws IOException;
	public TfIdfInfo computeTfIdfRecursively(Path path, boolean useSimpleTokenizer) throws IOException;
}
