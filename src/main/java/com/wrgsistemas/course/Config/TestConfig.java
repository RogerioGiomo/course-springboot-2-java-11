package com.wrgsistemas.course.Config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wrgsistemas.course.entities.Category;
import com.wrgsistemas.course.entities.Order;
import com.wrgsistemas.course.entities.User;
import com.wrgsistemas.course.entities.enums.OrderStatus;
import com.wrgsistemas.course.repositories.CategoryRepository;
import com.wrgsistemas.course.repositories.OrderRepository;
import com.wrgsistemas.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));

		User u1 = new User(1L, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(2L, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
		Order o1 = new Order(1L, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID, u1);
		Order o2 = new Order(2L, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITTING_PAYMENT, u2);
		Order o3 = new Order(3L, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.WAITTING_PAYMENT, u1);
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
				

	}
	
}