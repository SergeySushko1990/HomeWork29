package ru.learnUp.learnupjava23;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import ru.learnUp.learnupjava23.dao.entity.Book;
import ru.learnUp.learnupjava23.dao.service.BookService;
import ru.learnUp.learnupjava23.dao.service.BookstoreService;
import ru.learnUp.learnupjava23.exceptions.NotEnoughBooksException;

@Slf4j
@SpringBootApplication
@EnableCaching
public class Learnupjava23Application {

    public static void main(String[] args) throws InterruptedException {

        ConfigurableApplicationContext context = SpringApplication.run(Learnupjava23Application.class, args);

    }
}
