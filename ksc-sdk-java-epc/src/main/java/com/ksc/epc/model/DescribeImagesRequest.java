package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DescribeImagesRequestMarshaller;
import lombok.Data;
import com.ksc.model.Filter;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribeImages.
 * </p>
 */
@Data
public class DescribeImagesRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeImagesRequest> {

    /**
     * 过滤器
     */
    private com.ksc.internal.SdkInternalList<Filter> filters;
    /**
     * 镜像ID
     */
    private com.ksc.internal.SdkInternalList<String> imageIds;
    /**
     * 单次调用可返回的最大条目数量.
     */
    private String maxResults;
    /**
     * 获取另一页返回结果的 token.
     */
    private String nextToken;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribeImagesRequest that = (DescribeImagesRequest) o;
        if (filters != null ? !filters.equals(that.filters) : that.filters != null)
            return false;
        if (imageIds != null ? !imageIds.equals(that.imageIds) : that.imageIds != null)
            return false;
        if (maxResults != null ? !maxResults.equals(that.maxResults) : that.maxResults != null)
            return false;
        if (nextToken != null ? !nextToken.equals(that.nextToken) : that.nextToken != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (filters != null ? filters.hashCode() : 0);
        result = 31 * result + (imageIds != null ? imageIds.hashCode() : 0);
        result = 31 * result + (maxResults != null ? maxResults.hashCode() : 0);
        result = 31 * result + (nextToken != null ? nextToken.hashCode() : 0);
        return result;
    }

    public void addFilters(Filter... filters) {
		if (this.filters == null) {
			this.filters = new com.ksc.internal.SdkInternalList<Filter>();
		}
		for (Filter filter : filters) {
			this.filters.add(filter);
		}
	}
        public void addImageIds(String... imageIds){
            if (this.imageIds == null) {
                this.imageIds = new com.ksc.internal.SdkInternalList<String>();
            }
            for(String value : imageIds){
                this.imageIds.add(value);
            }
        }

    @Override
    public Request<DescribeImagesRequest> getDryRunRequest() {
        Request<DescribeImagesRequest> request = new DescribeImagesRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribeImagesRequest clone() {
        return (DescribeImagesRequest) super.clone();
    }
}

