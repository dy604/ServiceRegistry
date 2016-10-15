package demo.msa.framework.registry;

/**
 * 服务注册表
 * Created by root on 10/14/16.
 */
public interface ServiceRegistry {

    /**
     * 注册服务信息
     * @param serviceName    服务名称
     * @param serviceAddress 服务地址
     */
    void registry(String serviceName, String serviceAddress);
}
