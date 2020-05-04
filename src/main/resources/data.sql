
INSERT INTO departament (nazwa, lokalizacja) VALUES ('Departament 1', 'Bialystok');
INSERT INTO departament (nazwa, lokalizacja) VALUES ('Departament 2', 'Olsztyn');
INSERT INTO departament (nazwa, lokalizacja) VALUES ('Departament 3', 'Suwalki');
INSERT INTO departament (nazwa, lokalizacja) VALUES ('Departament 4', 'Warszawa');
INSERT INTO departament (nazwa, lokalizacja) VALUES ('Departament 5', 'Gdansk');

INSERT INTO pracownik (nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES ('Nazwisko1','SPRZEDAWCA',3,to_date('1980/12/17','YYYY/MM/DD'),1000,300,1);
INSERT INTO pracownik (nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES ('Nazwisko2','SPRZEDAWCA',1,to_date('1981/02/20','YYYY/MM/DD'),900,0,1);
INSERT INTO pracownik (nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES ('Nazwisko3','ANALITYK',4,to_date('1981/02/22','YYYY/MM/DD'),1500,NULL,2);
INSERT INTO pracownik (nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES ('Nazwisko4','ANALITYK',6,to_date('1981/04/02','YYYY/MM/DD'),2000,NULL,2);
INSERT INTO pracownik (nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES ('Nazwisko5','KSIEGOWY',6,to_date('1981/09/28','YYYY/MM/DD'),3000,NULL,3);
INSERT INTO pracownik (nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES ('Nazwisko6','KSIEGOWY',10,to_date('1981/05/01','YYYY/MM/DD'),4000,NULL,3);
INSERT INTO pracownik (nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES ('Nazwisko7','KSIEGOWY',6,to_date('1981/06/09','YYYY/MM/DD'),3500,NULL,3);
INSERT INTO pracownik (nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES ('Nazwisko8','PRZEDSTAWICIEL',9,to_date('1987/04/19','YYYY/MM/DD'),1200,400,1);
INSERT INTO pracownik (nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES ('Nazwisko9','PRZEDSTAWICIEL',10,to_date('1981/11/17','YYYY/MM/DD'),1400,500,1);
INSERT INTO pracownik (nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES ('Nazwisko10','PREZES',NULL,to_date('1981/09/08','YYYY/MM/DD'),5000,2000,4);
INSERT INTO pracownik (nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES ('Nazwisko11','INFORMATYK',12,to_date('1987/05/23','YYYY/MM/DD'),3500,NULL,2);
INSERT INTO pracownik (nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES ('Nazwisko12','INFORMATYK',10,to_date('1981/12/03','YYYY/MM/DD'),4000,NULL,2);
INSERT INTO pracownik (nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES ('Nazwisko13','ANALITYK',6,to_date('1981/12/03','YYYY/MM/DD'),2000,NULL,2);
INSERT INTO pracownik (nazwisko, stanowisko, id_kierownika, data_zatrudnienia, pensja, premia, nr_departamentu)
    VALUES ('Nazwisko14','SPRZEDAWCA',1,to_date('1982/01/23','YYYY/MM/DD'),1000,400,1);

INSERT INTO poziom_zarobkow (dolna_granica, gorna_granica)
    VALUES (700,1200);
INSERT INTO poziom_zarobkow (dolna_granica, gorna_granica)
    VALUES (1201,1400);
INSERT INTO poziom_zarobkow (dolna_granica, gorna_granica)
    VALUES (1401,2000);
INSERT INTO poziom_zarobkow (dolna_granica, gorna_granica)
    VALUES (2001,3000);
INSERT INTO poziom_zarobkow (dolna_granica, gorna_granica)
    VALUES (3001,9999);

INSERT INTO projekt (nazwa, budzet,data_rozpoczecia,data_zakonczenia)
    VALUES('PROJEKT NR 1',2000,to_date('1981/02/02','YYYY/MM/DD'),to_date('1981/03/02','YYYY/MM/DD'));
INSERT INTO projekt (nazwa,budzet,data_rozpoczecia,data_zakonczenia)
    VALUES('PROJEKT NR 2',4000,to_date('1982/02/07','YYYY/MM/DD'),to_date('1982/03/01','YYYY/MM/DD'));
INSERT INTO projekt (nazwa,budzet,data_rozpoczecia,data_zakonczenia)
    VALUES('PROJEKT NR 3',2500,to_date('1983/04/05','YYYY/MM/DD'),to_date('1983/05/23','YYYY/MM/DD'));
INSERT INTO projekt (nazwa,budzet,data_rozpoczecia,data_zakonczenia)
    VALUES('PROJEKT NR 4',2000,to_date('1983/04/01','YYYY/MM/DD'),to_date('1983/04/19','YYYY/MM/DD'));

INSERT INTO zlecenie VALUES (3,1,10,40,to_date('1981/02/02','YYYY/MM/DD'),to_date('1981/02/12','YYYY/MM/DD'));
INSERT INTO zlecenie VALUES (5,1,20,60,to_date('1981/02/20','YYYY/MM/DD'),to_date('1981/03/02','YYYY/MM/DD'));
INSERT INTO zlecenie VALUES (11,2,20,50,to_date('1982/02/07','YYYY/MM/DD'),to_date('1982/03/16','YYYY/MM/DD'));
INSERT INTO zlecenie VALUES (12,2,30,45,to_date('1982/02/17','YYYY/MM/DD'),to_date('1982/02/20','YYYY/MM/DD'));
INSERT INTO zlecenie VALUES (5,2,30,30,to_date('1982/02/21','YYYY/MM/DD'),to_date('1982/03/01','YYYY/MM/DD'));
INSERT INTO zlecenie VALUES (5,3,25,50,to_date('1983/04/07','YYYY/MM/DD'),to_date('1983/04/16','YYYY/MM/DD'));
INSERT INTO zlecenie VALUES (6,3,32,50,to_date('1983/04/15','YYYY/MM/DD'),to_date('1983/04/20','YYYY/MM/DD'));
INSERT INTO zlecenie VALUES (7,3,78,15,to_date('1983/04/22','YYYY/MM/DD'),to_date('1983/05/23','YYYY/MM/DD'));
INSERT INTO zlecenie VALUES (5,4,40,30,to_date('1983/04/10','YYYY/MM/DD'),to_date('1983/04/18','YYYY/MM/DD'));
