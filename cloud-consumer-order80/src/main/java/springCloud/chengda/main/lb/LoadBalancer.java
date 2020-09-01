package springCloud.chengda.main.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 自定义负载均衡接口
 */
@Component
public interface LoadBalancer {
    //收集服务器总共有多少台能够提供服务的机器，并放到list里面
    ServiceInstance getInstances(List<ServiceInstance> serviceInstances);
}
