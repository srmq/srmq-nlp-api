package br.cin.ufpe.nlp.api.tokenization;

public interface Tokenizer<T> {
	/**
	 * An iterator for tracking whether
	 * more tokens are left in the iterator not
	 * @return whether there is anymore tokens
	 * to iterate over
	 */
	public boolean hasMoreTokens();
	
	/**
	 * The next token (word usually) in the string
	 * @return the next token in the string if any
	 */
	public T nextToken();
	
	/**
	 * Set the token pre process
	 * @param tokenPreProcessor the token pre processor to set
	 */
	void setTokenPreProcessor(TokenPreProcess tokenPreProcessor);
	

}
