package com.github.fourteam.pikachu.week1.imesung.domain.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeneralCustomer implements SuperCustomer {
    private static Logger logger = LoggerFactory.getLogger(GeneralCustomer.class);

    public GeneralCustomer() {
        logger.info("해당 고객은 일반 고객입니다.");
    }

    @Override
    public int custGubun() {
        return 1;
    }
}
