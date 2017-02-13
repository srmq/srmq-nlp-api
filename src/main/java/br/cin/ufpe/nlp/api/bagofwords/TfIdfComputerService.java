package br.cin.ufpe.nlp.api.bagofwords;

import java.io.IOException;
import java.nio.file.Path;

public interface TfIdfComputerService {
	public TfIdfInfo computeTfIdfRecursively(Path path) throws IOException;
}
