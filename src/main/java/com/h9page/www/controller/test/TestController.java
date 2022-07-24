package com.h9page.www.controller.test;

import com.h9page.www.dto.test.TestDto;
import com.h9page.www.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    public ResponseEntity<TestDto> getOne() {
        return ResponseEntity.ok().body(testService.getTestOne());
    }

}
