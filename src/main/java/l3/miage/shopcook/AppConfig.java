package l3.miage.shopcook;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
     @Bean
   public ModelMapper modelMapper() {
      ModelMapper modelMapper = new ModelMapper();
      return modelMapper;
   }
}
