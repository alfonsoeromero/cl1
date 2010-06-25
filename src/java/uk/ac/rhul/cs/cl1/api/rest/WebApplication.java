package uk.ac.rhul.cs.cl1.api.rest;

import uk.ac.rhul.cs.cl1.api.ClusterONEResult;
import uk.ac.rhul.cs.cl1.api.EntityStore;
import uk.ac.rhul.cs.cl1.api.InMemoryEntityStore;

/**
 * Class that represents the Cluster ONE web interface as a whole
 * 
 * @author tamas
 *
 */
public class WebApplication {
	private static EntityStore<String> datasetStore =
		new InMemoryEntityStore<String>();
	private static EntityStore<ClusterONEResult> resultStore =
		new InMemoryEntityStore<ClusterONEResult>();
	
	/**
	 * Returns the encapsulated dataset store instance.
	 */
	public static EntityStore<String> getDatasetStore() {
		return datasetStore;
	}
	
	/**
	 * Returns the encapsulated result store instance.
	 */
	public static EntityStore<ClusterONEResult> getResultStore() {
		return resultStore;
	}
}