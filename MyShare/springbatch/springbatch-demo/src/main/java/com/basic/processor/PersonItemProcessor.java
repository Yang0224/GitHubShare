package com.basic.processor;

import com.basic.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * person中间处理器
 *
 * @author yangshaoping
 * @create 2017/8/24 16:44
 * @DESCRIPTION:
 * @since 1.0.0
 */
public class PersonItemProcessor implements ItemProcessor<Person, Person>{

    private Logger logger = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(final Person person) throws Exception {
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();

        Person p = new Person(firstName, lastName);
        logger.info("Converting (" + person + ") into (" + p + ")");

        return p;
    }
}