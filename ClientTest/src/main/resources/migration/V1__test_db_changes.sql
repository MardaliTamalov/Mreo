create table test(
    test_id int8 GENERATED by default as identity,
    test varchar(30),
    primary key (test_id);
)

insert into test(test)
    values ('test')