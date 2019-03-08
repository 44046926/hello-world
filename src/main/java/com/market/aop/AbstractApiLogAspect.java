package com.market.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractApiLogAspect {
    private static Logger logger = LoggerFactory.getLogger(AbstractApiLogAspect.class);

    public AbstractApiLogAspect() {
    }

    public abstract void apiLogAop();

//    @Around("apiLogAop()")
//    public Object aroundApi(ProceedingJoinPoint point) throws Throwable {
//        return this.log(point);
//    }
//
//    private Object log(ProceedingJoinPoint point) throws Throwable {
//        DateTime startTime = new DateTime();
//        DateTime endTime = null;
//        Interval interval = null;
//        Object response = null;
//
//        try {
//            response = point.proceed();
//        } catch (Exception var8) {
//            endTime = new DateTime();
//            interval = new Interval(startTime, endTime);
//            logger.error("Call API {}.{} () Request => {}, RT:{} ms, Error => {}", new Object[]{point.getSignature().getDeclaringTypeName(), point.getSignature().getName(), this.argsToString((Object)point.getArgs()), interval.toDurationMillis(), var8.getStackTrace()});
//            logger.error("", var8);
//            throw var8;
//        }
//
//        endTime = new DateTime();
//        interval = new Interval(startTime, endTime);
//        logger.debug("Call API {}.{} () Request => {}, RT:{} ms, Response => {}", new Object[]{point.getSignature().getDeclaringTypeName(), point.getSignature().getName(), this.argsToString((Object)point.getArgs()), interval.toDurationMillis(), this.argsToString(response)});
//
//        try {
//            RestResponse restResponse = (RestResponse)response;
//            logger.info("Call API {}.{} () Request => {}, RT:{} ms, Response => {}", new Object[]{point.getSignature().getDeclaringTypeName(), point.getSignature().getName(), this.argsToString((Object)point.getArgs()), interval.toDurationMillis(), this.argsToString(restResponse)});
//        } catch (Exception var7) {
//            logger.info("Call API {}.{} () Request => {}, RT:{} ms, Response => {}", new Object[]{point.getSignature().getDeclaringTypeName(), point.getSignature().getName(), this.argsToString((Object)point.getArgs()), interval.toDurationMillis(), this.argsToString(response)});
//        }
//
//        return response;
//    }
//
//    private String argsToString(Object object) {
//        try {
//            return JSON.toJSONString(object);
//        } catch (Exception var3) {
//            return String.valueOf(object);
//        }
//    }
//
//    private String argsToString(RestResponse restResponse) {
//        return "{\"reultCode\":" + restResponse.getResultCode() + ",\"resultMsg\":" + restResponse.getResultMsg() + "}";
//    }
}