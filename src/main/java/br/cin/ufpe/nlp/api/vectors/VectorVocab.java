package br.cin.ufpe.nlp.api.vectors;

public interface VectorVocab {
	public float[] embeddingFor(String word);
	public boolean contains(String word);
	public int numWords();
	public int embedSize();
}
