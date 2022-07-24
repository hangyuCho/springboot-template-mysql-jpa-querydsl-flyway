package com.h9page.www.dto.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor

public class TestDto implements Serializable {
    private final Long id;
    private final String title;
    private final String descrption;
}
