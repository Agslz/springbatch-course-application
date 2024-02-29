package com.batch.config;

import com.batch.steps.ItemReaderStep;
import org.springframework.context.annotation.Bean;

public class BatchConfiguration {

    @Bean
    public ItemReaderStep itemReaderStep(){
        return new ItemReaderStep();
    }


}
