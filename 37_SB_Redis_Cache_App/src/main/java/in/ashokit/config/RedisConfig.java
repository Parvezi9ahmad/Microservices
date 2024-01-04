package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import in.ashokit.model.Book;

@Configuration
public class RedisConfig {

	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		
		JedisConnectionFactory jcf = new JedisConnectionFactory();
		
		return jcf;
	}
	
	@Bean
	public RedisTemplate<String,Book> redisTemplate(){
		RedisTemplate<String,Book> redisTemplate=new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		
		return redisTemplate;
		
	}
}
