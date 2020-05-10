--
INSERT INTO department (nr_departamentu, nazwa, lokalizacja) VALUES (1, 'Departament 1', 'Bialystok');
INSERT INTO department (nr_departamentu, nazwa, lokalizacja) VALUES (2, 'Departament 2', 'Olsztyn');
INSERT INTO department (nr_departamentu, nazwa, lokalizacja) VALUES (3, 'Departament 3', 'Suwalki');
INSERT INTO department (nr_departamentu, nazwa, lokalizacja) VALUES (4, 'Departament 4', 'Warszawa');
INSERT INTO department (nr_departamentu, nazwa, lokalizacja) VALUES (5, 'Departament 5', 'Gdansk');
--
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (1, 'Nazwisko1','SPRZEDAWCA',3,to_date('1980/12/17','YYYY/MM/DD'),1000,300,1);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (2, 'Nazwisko2','SPRZEDAWCA',1,to_date('1981/02/20','YYYY/MM/DD'),900,0,1);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (3, 'Nazwisko3','ANALITYK',4,to_date('1981/02/22','YYYY/MM/DD'),1500,NULL,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (4, 'Nazwisko4','ANALITYK',6,to_date('1981/04/02','YYYY/MM/DD'),2000,NULL,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (5, 'Nazwisko5','KSIEGOWY',6,to_date('1981/09/28','YYYY/MM/DD'),3000,NULL,3);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (6, 'Nazwisko6','KSIEGOWY',10,to_date('1981/05/01','YYYY/MM/DD'),4000,NULL,3);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (7, 'Nazwisko7','KSIEGOWY',6,to_date('1981/06/09','YYYY/MM/DD'),3500,NULL,3);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (8, 'Nazwisko8','PRZEDSTAWICIEL',9,to_date('1987/04/19','YYYY/MM/DD'),1200,400,1);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (9, 'Nazwisko9','PRZEDSTAWICIEL',10,to_date('1981/11/17','YYYY/MM/DD'),1400,500,1);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (10, 'Nazwisko10','PREZES',NULL,to_date('1981/09/08','YYYY/MM/DD'),5000,2000,4);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (11, 'Nazwisko11','INFORMATYK',12,to_date('1987/05/23','YYYY/MM/DD'),3500,NULL,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (12, 'Nazwisko12','INFORMATYK',10,to_date('1981/12/03','YYYY/MM/DD'),4000,NULL,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (13, 'Nazwisko13','ANALITYK',6,to_date('1981/12/03','YYYY/MM/DD'),2000,NULL,2);
INSERT INTO employee (id_pracownika, nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES (14, 'Nazwisko14','SPRZEDAWCA',1,to_date('1982/01/23','YYYY/MM/DD'),1000,400,1);
--
INSERT INTO Earnings_level (nr_przedzialu, dolna_granica, gorna_granica)
    VALUES (1,700,1200);
INSERT INTO Earnings_level (nr_przedzialu, dolna_granica, gorna_granica)
    VALUES (2,1201,1400);
INSERT INTO Earnings_level (nr_przedzialu, dolna_granica, gorna_granica)
    VALUES (3,1401,2000);
INSERT INTO Earnings_level (nr_przedzialu, dolna_granica, gorna_granica)
    VALUES (4,2001,3000);
INSERT INTO Earnings_level (nr_przedzialu, dolna_granica, gorna_granica)
    VALUES (5,3001,9999);
--
INSERT INTO project (nr_projektu, nazwa, budzet,data_rozpoczecia,data_zakonczenia)
    VALUES(1,'PROJEKT NR 1',2000,to_date('1981/02/02','YYYY/MM/DD'),to_date('1981/03/02','YYYY/MM/DD'));
INSERT INTO project (nr_projektu, nazwa,budzet,data_rozpoczecia,data_zakonczenia)
    VALUES(2,'PROJEKT NR 2',4000,to_date('1982/02/07','YYYY/MM/DD'),to_date('1982/03/01','YYYY/MM/DD'));
INSERT INTO project (nr_projektu, nazwa,budzet,data_rozpoczecia,data_zakonczenia)
    VALUES(3,'PROJEKT NR 3',2500,to_date('1983/04/05','YYYY/MM/DD'),to_date('1983/05/23','YYYY/MM/DD'));
INSERT INTO project (nr_projektu, nazwa,budzet,data_rozpoczecia,data_zakonczenia)
    VALUES(4,'PROJEKT NR 4',2000,to_date('1983/04/01','YYYY/MM/DD'),to_date('1983/04/19','YYYY/MM/DD'));
--
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (3,1,10,40,to_date('1981/02/02','YYYY/MM/DD'),to_date('1981/02/12','YYYY/MM/DD'));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (5,1,20,60,to_date('1981/02/20','YYYY/MM/DD'),to_date('1981/03/02','YYYY/MM/DD'));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (11,2,20,50,to_date('1982/02/07','YYYY/MM/DD'),to_date('1982/03/16','YYYY/MM/DD'));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (12,2,30,45,to_date('1982/02/17','YYYY/MM/DD'),to_date('1982/02/20','YYYY/MM/DD'));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (5,2,30,30,to_date('1982/02/21','YYYY/MM/DD'),to_date('1982/03/01','YYYY/MM/DD'));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (5,3,25,50,to_date('1983/04/07','YYYY/MM/DD'),to_date('1983/04/16','YYYY/MM/DD'));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (6,3,32,50,to_date('1983/04/15','YYYY/MM/DD'),to_date('1983/04/20','YYYY/MM/DD'));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (7,3,78,15,to_date('1983/04/22','YYYY/MM/DD'),to_date('1983/05/23','YYYY/MM/DD'));
INSERT INTO task (id_pracownika,nr_projektu,ilosc_godzin,stawka_za_godzine,data_rozpoczecia,data_zakonczenia)
    VALUES (5,4,40,30,to_date('1983/04/10','YYYY/MM/DD'),to_date('1983/04/18','YYYY/MM/DD'));
