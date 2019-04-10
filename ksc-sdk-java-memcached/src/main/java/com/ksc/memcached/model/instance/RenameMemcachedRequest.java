package com.ksc.memcached.model.instance;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.memcached.transform.instance.RenameMemcachedMarshaller;
import com.ksc.model.DryRunSupportedRequest;

import java.io.Serializable;


public class RenameMemcachedRequest extends KscWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<RenameMemcachedRequest> {
    private String cacheId;
    private String name;

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Request<RenameMemcachedRequest> getDryRunRequest() {
        Request<RenameMemcachedRequest> request = new RenameMemcachedMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
}
