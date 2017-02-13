package br.cin.ufpe.nlp.api.vectors;

import java.io.File;

public interface VectorVocabService {
	/**
	 * Generate a {@link VectorVocab} from a <code>vectorFile</code>. If
	 * <code>indexName</code> is not null, will try to reuse index with given
	 * name if it exists.
	 * 
	 * @param vectorFile
	 *            a text file with vectors. First line is a header with the
	 *            number of words in the file followed by space, followed by the
	 *            size of the vectors. Then follows lines with the word,
	 *            followed by space, followed by the vectors
	 * @param indexName
	 *            a name that will be used for the directory of the index
	 *            generated on the disk
	 * @return the corresponding {@link VectorVocab}
	 */
	public VectorVocab loadVectorVocab(File vectorFile, String indexPath, boolean normalizeVectors);
}
