package com.djj.design.test.template;

import java.util.List;

public class line {


    /**
     * eid : 14520567
     * note : null
     * toAnchorId : MDL0TQRC
     * creator : 5b937545e4b006fc4fa1e733
     * extraPlugMap : null
     * flowTemplateId : 5cac469e3f18921c5ce211be
     * fromAnchorId : 9SA0DR34
     * updateTime : 1554794142982
     * rules : [{"ruleList":[{"ruleExpress":{"widgetDescObject":null,"widgetDescType":"","valueList":null,"ruleList":null,"isDetailedWidget":true,"operationName":"大于","formWidgetCodeId":"_S_INT_LEAVE_DETAILED|_S_INT_LEAVE_DAYS","operation":"bt","value":"7","widgetType":"detailedWidget"}}]},{"ruleLogic":{"ruleList":null,"name":"或者","type":"or"}},{"ruleList":[{"ruleExpress":{"widgetDescObject":null,"widgetDescType":"self","valueList":null,"ruleList":null,"isDetailedWidget":false,"operationName":"为部门负责人","formWidgetCodeId":"_S_APPLY","operation":"dept_boss","value":"","widgetType":"personSelectWidget"}},{"ruleLogic":{"ruleList":null,"name":"且","type":"and"}},{"ruleExpress":{"widgetDescObject":null,"widgetDescType":"","valueList":null,"ruleList":null,"isDetailedWidget":true,"operationName":"大于或等于","formWidgetCodeId":"_S_INT_LEAVE_DETAILED|_S_INT_LEAVE_DAYS","operation":"bte","value":"3","widgetType":"detailedWidget"}}]},{"ruleLogic":{"ruleList":null,"name":"或者","type":"or"}},{"ruleList":[{"ruleExpress":{"widgetDescObject":null,"widgetDescType":"self","valueList":["1559e954-30c9-4f09-9791-37cb7c6c91fb"],"ruleList":null,"isDetailedWidget":false,"operationName":"所属角色 包含","formWidgetCodeId":"_S_APPLY","operation":"role_include","value":"1559e954-30c9-4f09-9791-37cb7c6c91fb|%E7%89%B9%E5%AE%9A%E5%B2%97%E4%BD%8D","widgetType":"personSelectWidget"}},{"ruleLogic":{"ruleList":null,"name":"且","type":"and"}},{"ruleExpress":{"widgetDescObject":null,"widgetDescType":"","valueList":null,"ruleList":null,"isDetailedWidget":true,"operationName":"大于或等于","formWidgetCodeId":"_S_INT_LEAVE_DETAILED|_S_INT_LEAVE_DAYS","operation":"bte","value":"3","widgetType":"detailedWidget"}}]},{"ruleLogic":{"ruleList":null,"name":"或者","type":"or"}},{"ruleList":[{"ruleExpress":{"widgetDescObject":null,"widgetDescType":"selfDirector","valueList":["5b62b791e4b06d22e8b0e8f4"],"ruleList":null,"isDetailedWidget":false,"operationName":"不包含","formWidgetCodeId":"_S_APPLY","operation":"not_include","value":"5b62b791e4b06d22e8b0e8f4|%E5%A7%9A%E8%BE%89%E5%BE%B7","widgetType":"personSelectWidget"}}]}]
     * sort : 1
     * nodeType : sequenseFlow
     * baseRule : null
     * pluginNames : []
     * codeId : 76D5JGPO
     * createTime : 1554794142982
     * name :
     * updator : 5b937545e4b006fc4fa1e733
     * from : 7B56OQL1
     * id : 5cac469e3f18921c5ce211d6
     * to : 7EESV596
     * elementType : sequense
     */

    private String eid;
    private Object note;
    private String toAnchorId;
    private String creator;
    private Object extraPlugMap;
    private String flowTemplateId;
    private String fromAnchorId;
    private long updateTime;
    private int sort;
    private String nodeType;
    private Object baseRule;
    private String codeId;
    private long createTime;
    private String name;
    private String updator;
    private String from;
    private String id;
    private String to;
    private String elementType;
    private List<RulesBean> rules;
    private List<?> pluginNames;


    public static class RulesBean {
        /**
         * ruleList : [{"ruleExpress":{"widgetDescObject":null,"widgetDescType":"","valueList":null,"ruleList":null,"isDetailedWidget":true,"operationName":"大于","formWidgetCodeId":"_S_INT_LEAVE_DETAILED|_S_INT_LEAVE_DAYS","operation":"bt","value":"7","widgetType":"detailedWidget"}}]
         * ruleLogic : {"ruleList":null,"name":"或者","type":"or"}
         */

        private RuleLogicBean ruleLogic;
        private List<RuleListBean> ruleList;


        public static class RuleLogicBean {
            /**
             * ruleList : null
             * name : 或者
             * type : or
             */
            private Object ruleList;
            private String name;
            private String type;

        }

        public static class RuleListBean {
            /**
             * ruleExpress : {"widgetDescObject":null,"widgetDescType":"","valueList":null,"ruleList":null,"isDetailedWidget":true,"operationName":"大于","formWidgetCodeId":"_S_INT_LEAVE_DETAILED|_S_INT_LEAVE_DAYS","operation":"bt","value":"7","widgetType":"detailedWidget"}
             */

            private RuleExpressBean ruleExpress;

            public static class RuleExpressBean {
                /**
                 * widgetDescObject : null
                 * widgetDescType :
                 * valueList : null
                 * ruleList : null
                 * isDetailedWidget : true
                 * operationName : 大于
                 * formWidgetCodeId : _S_INT_LEAVE_DETAILED|_S_INT_LEAVE_DAYS
                 * operation : bt
                 * value : 7
                 * widgetType : detailedWidget
                 */

                private Object widgetDescObject;
                private String widgetDescType;
                private Object valueList;
                private Object ruleList;
                private boolean isDetailedWidget;
                private String operationName;
                private String formWidgetCodeId;
                private String operation;
                private String value;
                private String widgetType;


            }
        }
    }
}
