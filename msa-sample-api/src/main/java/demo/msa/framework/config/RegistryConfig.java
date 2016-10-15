package demo.msa.framework.config;

import demo.msa.framework.registry.ServiceRegistry;
import demo.msa.framework.registry.ServiceRegistryImpl;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类，需要读取application.properties配置文件中的registry.servers配置项，
 * 并将其传入ServiceRegistryImpl的构造方法
 * Created by root on 10/14/16.
 * 当Spring应用上下文初始化时，将读取application.properties配置文件中的registry.servers配置项，
 * 并调用setServers()方法，从而初始化servers成员变量
 */
@Configuration  //配置类
@ConfigurationProperties(prefix = "registry")
public class RegistryConfig {

    private String servers;

    @Bean
    public ServiceRegistry serviceRegistry() {
        return new ServiceRegistryImpl(servers);
    }

    public void setServers(String servers) {
        this.servers = servers;
    }
}
