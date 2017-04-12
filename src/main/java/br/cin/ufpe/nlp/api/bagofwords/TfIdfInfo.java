package br.cin.ufpe.nlp.api.bagofwords;

import java.util.Collection;

public interface TfIdfInfo {
	public long totalNumberOfDocs();
	public int docAppearedIn(String word);
	public Collection<String> getVocabWords();
    /**
     * Returns the index of a given word
     * @param word the index of a given word
     * @return the index of a given word or -1
     * if not found
     */
    int indexOf(String word);
    /**
     * Returns the word contained at the given index or null
     * @param index the index of the word to get
     * @return the word at the given index
     */
    String wordAtIndex(int index);
    
    @Deprecated
    public Collection<Long> getIndices();
    
    
}
