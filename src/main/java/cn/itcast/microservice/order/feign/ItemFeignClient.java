package cn.itcast.microservice.order.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.itcast.microservice.order.pojo.Item;

@FeignClient(value = "itcast-microservice-item") // 申明这是一个Feign客户端，并且指明服务id
public interface ItemFeignClient {

	// 这里定义了类似于SpringMVC用法的方法，就可以进行RESTful的调用了
	@RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
	public Item queryItemById(@PathVariable("id") Long id);

}
