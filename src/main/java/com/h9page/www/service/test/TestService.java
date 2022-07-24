package com.h9page.www.service.test;

import com.h9page.www.dto.test.TestDto;
import com.h9page.www.entity.test.Test;
import com.h9page.www.repository.test.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public TestDto getTestOne() {
    Optional<Test> optTest = testRepository.findById(1L);
        return optTest.map(test -> TestDto
                .builder()
                .id(test.getId())
                .title(test.getTitle())
                .descrption(test.getDescrption())
                .build()
        ).orElse(null);
    }
}
