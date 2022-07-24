create table test
(
    id         bigint auto_increment,
    title      varchar(200) null,
    descrption varchar(500) null,
    constraint test_pk
        primary key (id)
);
