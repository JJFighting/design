package com.djj.design.test.template;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.stream.Collectors;

public class TemlateDTO {


    public static String rules=" [{\"ruleList\":[{\"ruleExpress\":{\"widgetDescType\":\"\",\"isDetailedWidget\":true,\"operationName\":\"大于\",\"formWidgetCodeId\":\"_S_INT_LEAVE_DETAILED|_S_INT_LEAVE_DAYS\",\"operation\":\"bt\",\"value\":\"7\",\"widgetType\":\"detailedWidget\"}}]},{\"ruleLogic\":{\"name\":\"或者\",\"type\":\"or\"}},{\"ruleList\":[{\"ruleExpress\":{\"widgetDescType\":\"self\",\"isDetailedWidget\":false,\"operationName\":\"为部门负责人\",\"formWidgetCodeId\":\"_S_APPLY\",\"operation\":\"dept_boss\",\"value\":\"\",\"widgetType\":\"personSelectWidget\"}},{\"ruleLogic\":{\"name\":\"且\",\"type\":\"and\"}},{\"ruleExpress\":{\"widgetDescType\":\"\",\"isDetailedWidget\":true,\"operationName\":\"大于或等于\",\"formWidgetCodeId\":\"_S_INT_LEAVE_DETAILED|_S_INT_LEAVE_DAYS\",\"operation\":\"bte\",\"value\":\"3\",\"widgetType\":\"detailedWidget\"}}]},{\"ruleLogic\":{\"name\":\"或者\",\"type\":\"or\"}},{\"ruleList\":[{\"ruleExpress\":{\"widgetDescType\":\"self\",\"valueList\":[\"1559e954-30c9-4f09-9791-37cb7c6c91fb\"],\"isDetailedWidget\":false,\"operationName\":\"所属角色 包含\",\"formWidgetCodeId\":\"_S_APPLY\",\"operation\":\"role_include\",\"value\":\"1559e954-30c9-4f09-9791-37cb7c6c91fb|%E7%89%B9%E5%AE%9A%E5%B2%97%E4%BD%8D\",\"widgetType\":\"personSelectWidget\"}},{\"ruleLogic\":{\"name\":\"且\",\"type\":\"and\"}},{\"ruleExpress\":{\"widgetDescType\":\"\",\"isDetailedWidget\":true,\"operationName\":\"大于或等于\",\"formWidgetCodeId\":\"_S_INT_LEAVE_DETAILED|_S_INT_LEAVE_DAYS\",\"operation\":\"bte\",\"value\":\"3\",\"widgetType\":\"detailedWidget\"}}]},{\"ruleLogic\":{\"name\":\"或者\",\"type\":\"or\"}},{\"ruleList\":[{\"ruleExpress\":{\"widgetDescType\":\"selfDirector\",\"valueList\":[\"5b62b791e4b06d22e8b0e8f4\"],\"isDetailedWidget\":false,\"operationName\":\"不包含\",\"formWidgetCodeId\":\"_S_APPLY\",\"operation\":\"not_include\",\"value\":\"5b62b791e4b06d22e8b0e8f4|%E5%A7%9A%E8%BE%89%E5%BE%B7\",\"widgetType\":\"personSelectWidget\"}}]}]";

    public static void main(String[] args){
        JSONArray jsonArray = JSON.parseArray(rules);
        System.out.println(jsonArray);
        System.out.println("--------------");
        jsonArray= jsonArray.stream().filter(object -> {
            JSONObject jsonObject= (JSONObject) object;
            boolean ruleList = jsonObject.containsKey("ruleList");
            return ruleList;
        }).collect(Collectors.toCollection(JSONArray::new));
        System.out.println(jsonArray);
}

}

