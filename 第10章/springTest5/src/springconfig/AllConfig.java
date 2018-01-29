package springconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { SpringConfig1.class, SpringConfig2.class })
public class AllConfig {
}
