package com.office.automation.bases.others;

import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.apache.ibatis.session.*;

import java.util.Map;

/**
 * Created by zhangfan on 2017/1/20.
 */
public class CustomMapResultHandler<K, V> implements org.apache.ibatis.session.ResultHandler {

    private final Map<K, V> mappedResults;
    private final String mapKey;
    private final String mapValue;
    private final ObjectFactory objectFactory;
    private final ObjectWrapperFactory objectWrapperFactory;

    public CustomMapResultHandler(String mapKey, String mapValue,
                                  ObjectFactory objectFactory,
                                  ObjectWrapperFactory objectWrapperFactory) {
        this.mapValue = mapValue;
        this.objectFactory = objectFactory;
        this.objectWrapperFactory = objectWrapperFactory;
        this.mappedResults = objectFactory.create(Map.class);
        this.mapKey = mapKey;
    }

    public void handleResult(ResultContext context) {
        Object obj = context.getResultObject();
        final MetaObject mo = MetaObject.forObject(obj, objectFactory, objectWrapperFactory);
        final K key = (K) mo.getValue(mapKey);
        final V value = (V) mo.getValue(mapValue);
        mappedResults.put(key, value);
    }

    public Map<K, V> getMappedResults() {
        return mappedResults;
    }
}
