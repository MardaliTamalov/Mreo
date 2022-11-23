Create table owner(
    owner_id int8 generated by default as identity,
    owner_name varchar (30),
    owner_surname varchar (30),
    owner_dataOB date,
    owner_numberDL varchar(30),
    primary key (owner_id));

insert into owner(owner_name,owner_surname, owner_dataOB, owner_numberDL)
values ('Vasiliy','Popov','1985-05-08','DSA454HG84'),
       ('Evgeniy','Ivanov','1986-11-07','ASS855ZA85'),
       ('Maksim','Pupkin','1987-08-30','OIU474OP41'),
       ('Ivan','Medvedev','1988-05-04','GYH939HJ39'),
       ('Dmitriy','Egorov','1990-09-02','JUY585FT874'),
       ('Aleksey','Vasilenko','1991-03-01','JUY585KI28'),
       ('Igor','Polanko','1992-08-04','POL175KU25'),
       ('Viktoriya','Lebedeva','1993-05-08','OIU638HY55'),
       ('Anna','Koroleva','1994-02-07','ERF274HH47'),
       ('Ekaterina','Kirienko','1995-06-06','VCF325WE88');
Create table car(
    car_id int8 generated by default as identity,
    car_brand varchar(30),
    car_model varchar(30),
    car_release_year int4,
    car_vin_number varchar(30),
    owner_id int8,
    primary key (car_id));
insert into car(car_brand, car_model, car_release_year, car_vin_number, owner_id)
 values ('Toyota','Yaris','2005','LKO5458546887',1),
        ('Bmw','X5','2010','JUY8946545545',2),
        ('ВАЗ', '2170', '2016', 'BGY5645454554',1),
        ('RENO', 'MEGANE', '2020', 'VGF5141565745',6),
        ('Pejo', 'B', '2018', 'CFD8578444545',9),
        ('Mersedes', 'Cls', '2019', 'TRE5544448418',9),
        ('Kia', 'Optima','2015' ,'SDA5654645645',4),
        ('Lada', 'Largus', '2018', 'AQW4536568955',7),
        ('Lada', 'Granta','2013','NMJ9999985445',8),
        ('Honda', 'CX', '2011','POF3556545445',2);

