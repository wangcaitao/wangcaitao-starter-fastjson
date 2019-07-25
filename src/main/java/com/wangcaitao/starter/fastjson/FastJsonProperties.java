package com.wangcaitao.starter.fastjson;

import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * fastjson 配置
 *
 * @author wangcaitao
 */
@Data
@ConfigurationProperties(prefix = "fastjson")
public class FastJsonProperties {

    /**
     * serializerFeatures
     */
    private SerializerFeature[] serializerFeatures;
}
