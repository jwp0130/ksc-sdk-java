package com.ksc.epc.model.transform;

import com.ksc.epc.model.DescribeEpcTrashesResult;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
import com.ksc.epc.model.Host;

/**
 * DescribeEpcTrashesResult Json Unmarshaller
 */
public class DescribeEpcTrashesResultJsonUnmarshaller implements Unmarshaller<DescribeEpcTrashesResult, JsonUnmarshallerContext> {
    @Override
    public DescribeEpcTrashesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeEpcTrashesResult describeEpcTrashesResult = new DescribeEpcTrashesResult();
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
        token = context.nextToken();
        if (token == VALUE_NULL)
        return null;
        while (true) {
            if (token == null)
            break;
            if (token == FIELD_NAME || token == START_OBJECT) {
                    if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                            describeEpcTrashesResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                    if (context.testExpression("HostSet", targetDepth)) {
                    context.nextToken();
                    describeEpcTrashesResult.setHostSet(new ListUnmarshaller<Host>(HostJsonUnmarshaller.getInstance()).unmarshall(context));
                    }
                    if (context.testExpression("TotalCount", targetDepth)) {
                    context.nextToken();
                            describeEpcTrashesResult.setTotalCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                    }
                    if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                            describeEpcTrashesResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                    }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                    }
            }
            token = context.nextToken();
        }
        return describeEpcTrashesResult;
    }

    private static DescribeEpcTrashesResultJsonUnmarshaller instance;

    public static DescribeEpcTrashesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeEpcTrashesResultJsonUnmarshaller();
        return instance;
    }
}
