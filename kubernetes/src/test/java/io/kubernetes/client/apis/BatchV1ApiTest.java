/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.6.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.apis;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.V1APIResourceList;
import io.kubernetes.client.models.V1DeleteOptions;
import io.kubernetes.client.models.V1Job;
import io.kubernetes.client.models.V1JobList;
import io.kubernetes.client.models.V1Status;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BatchV1Api
 */
@Ignore
public class BatchV1ApiTest {

    private final BatchV1Api api = new BatchV1Api();

    
    /**
     * 
     *
     * create a Job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedJobTest() throws ApiException {
        String namespace = null;
        V1Job body = null;
        String pretty = null;
        V1Job response = api.createNamespacedJob(namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of Job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedJobTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String fieldSelector = null;
        String labelSelector = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionNamespacedJob(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a Job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteNamespacedJob(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIResourcesTest() throws ApiException {
        V1APIResourceList response = api.getAPIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind Job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listJobForAllNamespacesTest() throws ApiException {
        String fieldSelector = null;
        String labelSelector = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1JobList response = api.listJobForAllNamespaces(fieldSelector, labelSelector, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind Job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedJobTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String fieldSelector = null;
        String labelSelector = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1JobList response = api.listNamespacedJob(namespace, pretty, fieldSelector, labelSelector, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified Job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        V1Job response = api.patchNamespacedJob(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified Job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedJobStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        V1Job response = api.patchNamespacedJobStatus(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified Job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1Job response = api.readNamespacedJob(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified Job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedJobStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        V1Job response = api.readNamespacedJobStatus(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified Job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedJobTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1Job body = null;
        String pretty = null;
        V1Job response = api.replaceNamespacedJob(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified Job
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedJobStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1Job body = null;
        String pretty = null;
        V1Job response = api.replaceNamespacedJobStatus(name, namespace, body, pretty);

        // TODO: test validations
    }
    
}
