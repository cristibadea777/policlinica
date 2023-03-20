/* INSERARE DATA IN TABELE*/

/* MEDIC */
INSERT INTO medic(nume, prenume, varsta, nrtelefon, cnp, email) VALUES ('Popescu', 'Ana', 32, '0720123456', '2780908123456', 'ana.popescu@example.com');
INSERT INTO medic(nume, prenume, varsta, nrtelefon, cnp, email) VALUES ('Ionescu', 'Mihai', 45, '0740567890', '1780312123456', 'mihai.ionescu@example.com');
INSERT INTO medic(nume, prenume, varsta, nrtelefon, cnp, email) VALUES ('Radulescu', 'Andrei', 28, '0750456789', '1920909123456', 'andrei.radulescu@example.com');
INSERT INTO medic(nume, prenume, varsta, nrtelefon, cnp, email) VALUES ('Dumitrescu', 'Laura', 36, '0760789456', '2860316123456', 'laura.dumitrescu@example.com');
INSERT INTO medic(nume, prenume, varsta, nrtelefon, cnp, email) VALUES ('Georgescu', 'Vlad', 41, '0730123456', '1921019123456', 'vlad.georgescu@example.com');

/* SPECIALIZARE */
INSERT INTO specializare (numespecializare) VALUES('Dermatologie');
INSERT INTO specializare (numespecializare) VALUES('Hematologie');
INSERT INTO specializare (numespecializare) VALUES('Oncologie');
INSERT INTO specializare (numespecializare) VALUES('Pediatrie');
INSERT INTO specializare (numespecializare) VALUES('Ortopedie');

/* MEDIC_SPECIALIZARI */
INSERT INTO medic_specializari(medicid, specializareid) VALUES (1, 1);
INSERT INTO medic_specializari(medicid, specializareid) VALUES (2, 2);
INSERT INTO medic_specializari(medicid, specializareid) VALUES (3, 3);
INSERT INTO medic_specializari(medicid, specializareid) VALUES (4, 1);
INSERT INTO medic_specializari(medicid, specializareid) VALUES (5, 2);
INSERT INTO medic_specializari(medicid, specializareid) VALUES (1, 2);
INSERT INTO medic_specializari(medicid, specializareid) VALUES (2, 3);
INSERT INTO medic_specializari(medicid, specializareid) VALUES (3, 1);
INSERT INTO medic_specializari(medicid, specializareid) VALUES (4, 3);
INSERT INTO medic_specializari(medicid, specializareid) VALUES (5, 1);

/* PACIENT */
INSERT INTO pacient(nume, prenume, varsta, nrtelefon, cnp, email) VALUES ('Popescu', 'Maria', 28, '0721123456', '2930405123456', 'maria.popescu@example.com');
INSERT INTO pacient(nume, prenume, varsta, nrtelefon, cnp, email) VALUES ('Ionescu', 'Alexandru', 35, '0740567890', '1811212123456', 'alexandru.ionescu@example.com');
INSERT INTO pacient(nume, prenume, varsta, nrtelefon, cnp, email) VALUES ('Radulescu', 'Andreea', 20, '0750456789', '2970909123456', 'andreea.radulescu@example.com');
INSERT INTO pacient(nume, prenume, varsta, nrtelefon, cnp, email) VALUES ('Dumitrescu', 'Ion', 45, '0760789456', '4850316123456', 'ion.dumitrescu@example.com');
INSERT INTO pacient(nume, prenume, varsta, nrtelefon, cnp, email) VALUES ('Georgescu', 'Laura', 50, '0730123456', '2971019123456', 'laura.georgescu@example.com');

/* ANALIZA */
INSERT INTO analiza(numeanaliza, pret) VALUES ('Hemograma completa', 120);
INSERT INTO analiza(numeanaliza, pret) VALUES ('Teste hepatice', 200);
INSERT INTO analiza(numeanaliza, pret) VALUES ('Test de sarcina', 50);
INSERT INTO analiza(numeanaliza, pret) VALUES ('Test de intoleranta la lactoza', 150);
INSERT INTO analiza(numeanaliza, pret) VALUES ('Profil lipidic', 180);

/* FISA CONSULTATIE */
INSERT INTO fisaconsultatie(pacientid, medicid, diagnostic) VALUES (1, 3, 'Hipertensiune arteriala');
INSERT INTO fisaconsultatie(pacientid, medicid, diagnostic) VALUES (2, 5, 'Gripa');
INSERT INTO fisaconsultatie(pacientid, medicid, diagnostic) VALUES (3, 2, 'Alergii sezoniere');
INSERT INTO fisaconsultatie(pacientid, medicid, diagnostic) VALUES (4, 1, 'Anxietate');
INSERT INTO fisaconsultatie(pacientid, medicid, diagnostic) VALUES (5, 4, 'Durere de spate');

/* REZULTAT_ANALIZA  */
INSERT INTO rezultatanaliza(pacientid, rezultat, cod) VALUES (1, 'Normal', 'A001');
INSERT INTO rezultatanaliza(pacientid, rezultat, cod) VALUES (2, 'Pozitiv', 'B002');
INSERT INTO rezultatanaliza(pacientid, rezultat, cod) VALUES (3, 'Negativ', 'C003');
INSERT INTO rezultatanaliza(pacientid, rezultat, cod) VALUES (4, 'Moderat crescut', 'D004');
INSERT INTO rezultatanaliza(pacientid, rezultat, cod) VALUES (5, 'Pozitiv', 'E005');

/* PROGRAMARE */
INSERT INTO programare(pacientid, specializareid, medicid, date, stare) VALUES (1, 3, 2, '20-04-2023 10:30', 'confirmata');
INSERT INTO programare(pacientid, specializareid, medicid, date, stare) VALUES (2, 1, 4, '18-04-2023 16:00', 'neconfirmata');
INSERT INTO programare(pacientid, specializareid, medicid, date, stare) VALUES (3, 2, 1, '22-04-2023 14:45', 'confirmata');
INSERT INTO programare(pacientid, specializareid, medicid, date, stare) VALUES (4, 4, 5, '27-04-2023 09:15', 'neconfirmata');
INSERT INTO programare(pacientid, specializareid, medicid, date, stare) VALUES (5, 5, 3, '19-04-2023 11:30', 'confirmata');

/* FISA_CONSULTATIE_ANALIZA */
INSERT INTO fisaconsultatie_analize(fisaconsultatieid, analizaid) VALUES (1, 3);
INSERT INTO fisaconsultatie_analize(fisaconsultatieid, analizaid) VALUES (1, 5);
INSERT INTO fisaconsultatie_analize(fisaconsultatieid, analizaid) VALUES (2, 1);
INSERT INTO fisaconsultatie_analize(fisaconsultatieid, analizaid) VALUES (2, 2);
INSERT INTO fisaconsultatie_analize(fisaconsultatieid, analizaid) VALUES (3, 4);
INSERT INTO fisaconsultatie_analize(fisaconsultatieid, analizaid) VALUES (3, 5);
INSERT INTO fisaconsultatie_analize(fisaconsultatieid, analizaid) VALUES (4, 2);
INSERT INTO fisaconsultatie_analize(fisaconsultatieid, analizaid) VALUES (4, 3);
INSERT INTO fisaconsultatie_analize(fisaconsultatieid, analizaid) VALUES (5, 1);
INSERT INTO fisaconsultatie_analize(fisaconsultatieid, analizaid) VALUES (5, 4);

/* PROGRAMARE_ANALIZE */
INSERT INTO programare_analize(programareid, analizaid) VALUES (1, 3);
INSERT INTO programare_analize(programareid, analizaid) VALUES (1, 5);
INSERT INTO programare_analize(programareid, analizaid) VALUES (2, 1);
INSERT INTO programare_analize(programareid, analizaid) VALUES (2, 2);
INSERT INTO programare_analize(programareid, analizaid) VALUES (3, 4);
INSERT INTO programare_analize(programareid, analizaid) VALUES (3, 5);
INSERT INTO programare_analize(programareid, analizaid) VALUES (4, 2);
INSERT INTO programare_analize(programareid, analizaid) VALUES (4, 3);
INSERT INTO programare_analize(programareid, analizaid) VALUES (5, 1);
INSERT INTO programare_analize(programareid, analizaid) VALUES (5, 4);

/*REZULTATANALIZA_ANALIZE*/
INSERT INTO rezultatanaliza_analize(rezultatanalizaid, analizaid) VALUES (1, 3);
INSERT INTO rezultatanaliza_analize(rezultatanalizaid, analizaid) VALUES (1, 5);
INSERT INTO rezultatanaliza_analize(rezultatanalizaid, analizaid) VALUES (2, 1);
INSERT INTO rezultatanaliza_analize(rezultatanalizaid, analizaid) VALUES (2, 2);
INSERT INTO rezultatanaliza_analize(rezultatanalizaid, analizaid) VALUES (3, 4);
INSERT INTO rezultatanaliza_analize(rezultatanalizaid, analizaid) VALUES (3, 5);
INSERT INTO rezultatanaliza_analize(rezultatanalizaid, analizaid) VALUES (4, 2);
INSERT INTO rezultatanaliza_analize(rezultatanalizaid, analizaid) VALUES (4, 3);
INSERT INTO rezultatanaliza_analize(rezultatanalizaid, analizaid) VALUES (5, 1);
INSERT INTO rezultatanaliza_analize(rezultatanalizaid, analizaid) VALUES (5, 4);


