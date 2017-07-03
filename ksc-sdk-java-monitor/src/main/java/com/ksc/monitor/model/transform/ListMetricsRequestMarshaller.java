package com.ksc.monitor.model.transform;

import java.io.ByteArrayInputStream;

import com.ksc.DefaultRequest;
import com.ksc.KscClientException;
import com.ksc.Request;
import com.ksc.http.HttpMethodName;
import com.ksc.monitor.model.ListMetricsRequest;
import com.ksc.transform.Marshaller;
import com.ksc.util.StringUtils;

public class ListMetricsRequestMarshaller
		implements Marshaller<Request<ListMetricsRequest>, ListMetricsRequest> {

	@Override
	public Request<ListMetricsRequest> marshall(ListMetricsRequest listMetricsRequest) {
		// TODO Auto-generated method stub
		if (listMetricsRequest == null) {
			throw new KscClientException("Invalid argument passed to marshall(...)");
		}
		Request<ListMetricsRequest> request = new DefaultRequest<ListMetricsRequest>(
				listMetricsRequest, "monitor");
		request.addParameter("Action", "ListMetrics");
		String version = listMetricsRequest.getVersion();
		if (org.apache.commons.lang.StringUtils.isBlank(version)) {
			version = "2010-05-23";
		}
		System.out.println(version);
		if (version.equalsIgnoreCase("2017-07-01")){
			byte[] content = listMetricsRequest.getData().getBytes();
			request.addHeader("Content-Type", "application/json");
			request.setContent(new ByteArrayInputStream(content));
			request.addHeader("Content-Length", Integer.toString(content.length));
			request.setHttpMethod(HttpMethodName.POST);
		}else{
			request.setHttpMethod(HttpMethodName.GET);			
		}	
		request.addParameter("Version", version);
		if (listMetricsRequest.getInstanceId() != null) {
			request.addParameter("InstanceID", StringUtils.fromString(listMetricsRequest.getInstanceId()));
		}
		if (listMetricsRequest.getMetricName() != null) {
			request.addParameter("MetricName", StringUtils.fromString(listMetricsRequest.getMetricName()));
		}
		if (listMetricsRequest.getNamespace() != null) {
			request.addParameter("Namespace", StringUtils.fromString(listMetricsRequest.getNamespace()));
		}
		if (listMetricsRequest.getPageIndex() != null) {
			request.addParameter("PageIndex", StringUtils.fromInteger(listMetricsRequest.getPageIndex()));
		}
		if (listMetricsRequest.getPageSize() != null) {
			request.addParameter("PageSize", StringUtils.fromInteger(listMetricsRequest.getPageSize()));
		}
		return request;
	}

}
