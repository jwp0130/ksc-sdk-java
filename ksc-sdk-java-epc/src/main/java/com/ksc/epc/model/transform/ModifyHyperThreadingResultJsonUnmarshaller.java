package com.ksc.epc.model.transform;

import com.ksc.epc.model.ModifyHyperThreadingResult;
import com.fasterxml.jackson.core.JsonToken;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;
import com.ksc.transform.ListUnmarshaller;
import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

/**
 * ModifyHyperThreadingResult Json Unmarshaller
 */
public class ModifyHyperThreadingResultJsonUnmarshaller implements Unmarshaller<ModifyHyperThreadingResult, JsonUnmarshallerContext> {
    @Override
    public ModifyHyperThreadingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ModifyHyperThreadingResult modifyHyperThreadingResult = new ModifyHyperThreadingResult();
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
                    modifyHyperThreadingResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                    }
                if (context.testExpression("Return", targetDepth)) {
                    context.nextToken();
                    modifyHyperThreadingResult.setReturn(context.getUnmarshaller(Boolean.class).unmarshall(context));
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
        return modifyHyperThreadingResult;
    }

    private static ModifyHyperThreadingResultJsonUnmarshaller instance;

    public static ModifyHyperThreadingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyHyperThreadingResultJsonUnmarshaller();
        return instance;
    }
}
