package com.jyh.constant;

/**
 * @author jyh
 * @date 2019/12/30
 * @description
 */

public class ResultConstant {

    /**
     * 返回消息
     */
    public static final class Message {

        public static final String SUCCESS_MESSAGE = "业务处理成功";

        public static final String ERROR_MESSAGE = "业务处理失败";

        public static final String ERROR_1MISS_PARAM = "业务缺少参数";
    }

    /**
     * 返回码
     */
    public static final class Code {

        /**
         * 成功
         */
        public static final int SUCCESS = 200;

        /**
         * 失败
         */
        public static final int ERROR = 400;

    }

}
