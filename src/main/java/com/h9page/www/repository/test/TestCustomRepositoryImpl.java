package com.h9page.www.repository.test;

import com.h9page.www.entity.test.QTest;
import com.h9page.www.entity.test.Test;
import com.querydsl.jpa.impl.JPAQueryFactory;

import java.util.List;

public class TestCustomRepositoryImpl implements TestCustomRepository{
    private final JPAQueryFactory jpaQueryFactory;

    QTest qTest = QTest.test;

    public TestCustomRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    public List<Test> findAllCustome() {
        return jpaQueryFactory.selectFrom(qTest)
                .fetch();
    }
}
