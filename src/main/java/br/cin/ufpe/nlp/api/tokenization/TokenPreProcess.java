package br.cin.ufpe.nlp.api.tokenization;

public interface TokenPreProcess {
	/**
	 * Pre process a token
	 * @param token the token to pre process
	 * @return the preprocessed token
	 */
	public String preProcess(String token);

}
