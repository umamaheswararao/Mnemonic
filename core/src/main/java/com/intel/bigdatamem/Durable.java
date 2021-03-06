package com.intel.bigdatamem;

/**
 *
 *
 */


public interface Durable {

	public void initializeAfterCreate();
	
	public void initializeAfterRestore();
	
	public void setupGenericInfo(EntityFactoryProxy[] efproxies, GenericField.GType[] gftypes);
	
	public void cancelAutoReclaim();

	public void registerAutoReclaim();
	
	public long getNonVolatileHandler();
	
	public boolean autoReclaim();

	public void destroy() throws RetrieveNonVolatileEntityError;
}
