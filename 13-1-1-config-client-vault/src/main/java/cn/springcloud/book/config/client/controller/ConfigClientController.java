package cn.springcloud.book.config.client.controller;


import cn.springcloud.book.config.client.config.ConfigInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zzf
 * @date: 2018/1/8
 * @time: 15:47
 * @description : do some thing
 */
@RefreshScope
@RestController
@RequestMapping("configConsumer")
public class ConfigClientController {

    @Value("${foo}")
    private String foo;

    @Autowired
    private ConfigInfoProperties configInfoValue;

    @RequestMapping("/getConfigInfo")
    public String getConfigInfo(){
//        return configInfoValue.getConfig();
        return foo;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
