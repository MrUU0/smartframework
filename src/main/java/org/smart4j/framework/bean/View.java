package org.smart4j.framework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回视图对象
 * @author WZ
 * @Class View
 * @create 2017-08-12
 **/
public class View {
    /**
     * 视图路径
     */
    private String path;
    /**
     * 模型数据
     */
    private Map<String, Object> model;

    public View(String path){
        this.path = path;
        model = new HashMap<String, Object>();
    }

    /**
     * 添加 模型 属性
     * @param key
     * @param value
     * @return
     */
    public View addModel(String key, Object value){
        model.put(key, value);
        return this;
    }

    public String getPath(){
        return this.path;
    }
    public Map<String, Object> getModel(){
        return this.model;
    }
}
