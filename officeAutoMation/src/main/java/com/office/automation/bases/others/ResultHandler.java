package com.office.automation.bases.others;

import org.apache.ibatis.session.ResultContext;

/**
 * Created by zhangfan on 2017/1/20.
 */
public interface ResultHandler {
    void handleResult(ResultContext resultContext);
}
