# wangcaitao-starter-fastjson

fastjson 代替 spring-boot 默认的 jackson 解析 json

## 使用

1. 引入依赖
    ```xml
    <dependency>
        <groupId>com.wangcaitao</groupId>
        <artifactId>wangcaitao-starter-fastjson</artifactId>
        <versiion>4.0.0</version>
    </dependency>
    ```

1. 配置
    ```yaml
    fastjson:
      serializer-features:
        - prettyformat
        - writedateusedateformat
    ```