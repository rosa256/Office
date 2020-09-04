--
INSERT INTO department (nr_departamentu, nazwa, lokalizacja) VALUES (1, 'Departament 1', 'Bialystok');
INSERT INTO department (nr_departamentu, nazwa, lokalizacja) VALUES (2, 'Departament 2', 'Olsztyn');
INSERT INTO department (nr_departamentu, nazwa, lokalizacja) VALUES (3, 'Departament 3', 'Suwalki');
INSERT INTO department (nr_departamentu, nazwa, lokalizacja) VALUES (4, 'Departament 4', 'Warszawa');
INSERT INTO department (nr_departamentu, nazwa, lokalizacja) VALUES (5, 'Departament 5', 'Gdansk');
--
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (1, 'Nazwisko1','SPRZEDAWCA',3,STR_TO_DATE("1980-12-17","%Y-%m-%d"),1000,300,1);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (2, 'Nazwisko2','SPRZEDAWCA',1,STR_TO_DATE("1981-02-20","%Y-%m-%d"),900,0,1);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (3, 'Nazwisko3','ANALITYK',4,STR_TO_DATE("1981-02-22","%Y-%m-%d"),1500,NULL,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (4, 'Nazwisko4','ANALITYK',6,STR_TO_DATE("1981-04-02","%Y-%m-%d"),2000,NULL,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (5, 'Nazwisko5','KSIEGOWY',6,STR_TO_DATE("1981-09-28","%Y-%m-%d"),3000,NULL,3);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (6, 'Nazwisko6','KSIEGOWY',10,STR_TO_DATE("1981-05-01","%Y-%m-%d"),4000,NULL,3);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (7, 'Nazwisko7','KSIEGOWY',6,STR_TO_DATE("1981-06-09","%Y-%m-%d"),3500,NULL,3);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (8, 'Nazwisko8','PRZEDSTAWICIEL',9,STR_TO_DATE("1987-04-19","%Y-%m-%d"),1200,400,1);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (9, 'Nazwisko9','PRZEDSTAWICIEL',10,STR_TO_DATE("1981-11-17","%Y-%m-%d"),1400,500,1);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (10, 'Nazwisko10','PREZES',NULL,STR_TO_DATE("1981-09-08","%Y-%m-%d"),5000,2000,4);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (11, 'Nazwisko11','INFORMATYK',12,STR_TO_DATE("1987-05-23","%Y-%m-%d"),3500,NULL,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (12, 'Nazwisko12','INFORMATYK',10,STR_TO_DATE("1981-12-03","%Y-%m-%d"),4000,NULL,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (13, 'Nazwisko13','ANALITYK',6,STR_TO_DATE("1981-12-03","%Y-%m-%d"),2000,NULL,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (14, 'Nazwisko14','SPRZEDAWCA',1,STR_TO_DATE("1982-01-23","%Y-%m-%d"),1000,400,1);

INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (15, 'Nazwisko15','SPRZEDAWCA',2,STR_TO_DATE("1982-01-23","%Y-%m-%d"),1000,400,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (16, 'Nazwisko16','SPRZEDAWCA',4,STR_TO_DATE("1982-01-23","%Y-%m-%d"),1000,400,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (17, 'Nazwisko17','SPRZEDAWCA',4,STR_TO_DATE("1982-01-23","%Y-%m-%d"),1000,400,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (18, 'Nazwisko18','SPRZEDAWCA',1,STR_TO_DATE("1982-01-23","%Y-%m-%d"),1000,400,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (19, 'Nazwisko19','SPRZEDAWCA',3,STR_TO_DATE("1982-01-23","%Y-%m-%d"),1000,400,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (20, 'Nazwisko20','SPRZEDAWCA',5,STR_TO_DATE("1982-01-23","%Y-%m-%d"),1000,400,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (21, 'Nazwisko21','SPRZEDAWCA',5,STR_TO_DATE("1982-01-23","%Y-%m-%d"),1000,400,3);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (22, 'Nazwisko22','SPRZEDAWCA',6,STR_TO_DATE("1982-01-23","%Y-%m-%d"),1000,400,3);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (23, 'Nazwisko23','SPRZEDAWCA',4,STR_TO_DATE("1982-01-23","%Y-%m-%d"),1000,400,3);
--
INSERT INTO earnings_level (nr_przedzialu, dolna_granica, gorna_granica)
    VALUES (1,700,1200);
INSERT INTO earnings_level (nr_przedzialu, dolna_granica, gorna_granica)
    VALUES (2,1201,1400);
INSERT INTO earnings_level (nr_przedzialu, dolna_granica, gorna_granica)
    VALUES (3,1401,2000);
INSERT INTO earnings_level (nr_przedzialu, dolna_granica, gorna_granica)
    VALUES (4,2001,3000);
INSERT INTO earnings_level (nr_przedzialu, dolna_granica, gorna_granica)
    VALUES (5,3001,9999);
--
INSERT INTO project (nr_projektu, nazwa, budzet,data_rozpoczecia,data_zakonczenia)
    VALUES(1,'PROJEKT NR 1',2000,STR_TO_DATE("1981-02-02","%Y-%m-%d"),STR_TO_DATE("1981-03-02","%Y-%m-%d"));
INSERT INTO project (nr_projektu, nazwa,budzet,data_rozpoczecia,data_zakonczenia)
    VALUES(2,'PROJEKT NR 2',4000,STR_TO_DATE("1982-02-07","%Y-%m-%d"),STR_TO_DATE("1982-03-01","%Y-%m-%d"));
INSERT INTO project (nr_projektu, nazwa,budzet,data_rozpoczecia,data_zakonczenia)
    VALUES(3,'PROJEKT NR 3',2500,STR_TO_DATE("1983-04-05","%Y-%m-%d"),STR_TO_DATE("1983-05-23","%Y-%m-%d"));
INSERT INTO project (nr_projektu, nazwa,budzet,data_rozpoczecia,data_zakonczenia)
    VALUES(4,'PROJEKT NR 4',2000,STR_TO_DATE("1983-04-01","%Y-%m-%d"),STR_TO_DATE("1983-04-19","%Y-%m-%d"));
--
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (3,1,10,40,STR_TO_DATE("1981-02-02","%Y-%m-%d"),STR_TO_DATE("1981-02-12","%Y-%m-%d"));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (5,1,20,60,STR_TO_DATE("1981-02-20","%Y-%m-%d"),STR_TO_DATE("1981-03-02","%Y-%m-%d"));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (11,2,20,50,STR_TO_DATE("1982-02-07","%Y-%m-%d"),STR_TO_DATE("1982-03-16","%Y-%m-%d"));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (12,2,30,45,STR_TO_DATE("1982-02-17","%Y-%m-%d"),STR_TO_DATE("1982-02-20","%Y-%m-%d"));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (5,2,30,30,STR_TO_DATE("1982-02-21","%Y-%m-%d"),STR_TO_DATE("1982-03-01","%Y-%m-%d"));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (5,3,25,50,STR_TO_DATE("1983-04-07","%Y-%m-%d"),STR_TO_DATE("1983-04-16","%Y-%m-%d"));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (6,3,32,50,STR_TO_DATE("1983-04-15","%Y-%m-%d"),STR_TO_DATE("1983-04-20","%Y-%m-%d"));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (7,3,78,15,STR_TO_DATE("1983-04-22","%Y-%m-%d"),STR_TO_DATE("1983-05-23","%Y-%m-%d"));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (5,4,40,30,STR_TO_DATE("1983-04-10","%Y-%m-%d"),STR_TO_DATE("1983-04-18","%Y-%m-%d"));
