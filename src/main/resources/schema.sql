--DROP TABLE DEPARTAMENT CASCADE CONSTRAINTS;
--DROP TABLE PRACOWNIK CASCADE CONSTRAINTS;
--DROP TABLE ZLECENIE CASCADE CONSTRAINTS;
--DROP TABLE PROJEKT CASCADE CONSTRAINTS;
--DROP TABLE POZIOM_ZAROBKOW CASCADE CONSTRAINTS;

CREATE TABLE departament
(nr_departamentu number(2) AUTO_INCREMENT CONSTRAINT kl_glowny_dep PRIMARY KEY,
 nazwa varchar(15) not null,
 lokalizacja varchar(30) not null);


CREATE TABLE pracownik
(id_pracownika number(4) AUTO_INCREMENT CONSTRAINT kl_glowny_prac PRIMARY KEY,
 nazwisko varchar(13),
 stanowisko varchar(17),
 id_kierownika number(4),
 data_zatrudnienia date,
 pensja number(7,2),
 premia number(7,2),
 nr_departamentu number(2) CONSTRAINT kl_obcy_prac REFERENCES departament(nr_departamentu));


CREATE TABLE poziom_zarobkow
(nr_przedzialu number(1) AUTO_INCREMENT constraint kl_glowny_poziom primary key,
 dolna_granica number(5),
 gorna_granica number(5));

CREATE TABLE projekt
(nr_projektu number(3) AUTO_INCREMENT constraint kl_glowny_proj primary key,
 nazwa varchar(30),
 budzet number(5),
 data_rozpoczecia date,
 data_zakonczenia date);

CREATE TABLE zlecenie
(id_pracownika number(4) references pracownik(id_pracownika),
 nr_projektu number(3) references projekt(nr_projektu),
 ilosc_godzin number(3),
 stawka_za_godzine number(4),
 data_rozpoczecia date,
 data_zakonczenia date,
 constraint kl_glowny_zlec primary key(id_pracownika,nr_projektu));
