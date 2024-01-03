package in.ashokit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
@Component
public class MyFilter implements GlobalFilter {

	Logger logger=LoggerFactory.getLogger(MyFilter.class); 
	
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		logger.info("MyFIlter :: filter () method executed ...");
		
		ServerHttpRequest request = exchange.getRequest();
		return chain.filter(exchange);
	}

}
