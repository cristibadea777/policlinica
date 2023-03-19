/* INTEROGARI */

/*1. Listarea specializarilor unui medic */
SELECT CONCAT(medic.nume, ' ', medic.prenume) AS nume_complet_medic, specializare.numespecializare AS nume_specializare
FROM medic
	INNER JOIN medic_specializari ON medic.medicid = medic_specializari.medicid 
	INNER JOIN specializare 
		ON medic_specializari.specializareid = specializare.specializareid
WHERE medic_specializari.medicid = 5;

/*2. Listare programari - data programare, nume medic, specializare medic, pentru un anumit pacient*/
SELECT 
	CONCAT(pacient.nume, ' ', pacient.prenume) AS nume_complet_pacient, 
	programare.date AS data_programare,
	specializare.numespecializare AS nume_specializare, 
	CONCAT(medic.nume, ' ', medic.prenume) AS nume_complet_medic
FROM programare
	INNER JOIN pacient 
		ON programare.pacientid = pacient.pacientid
	INNER JOIN medic 
		ON programare.medicid = medic.medicid
	INNER JOIN medic_specializari 
		ON medic.medicid = medic_specializari.medicid
	INNER JOIN specializare 
		ON medic_specializari.specializareid = specializare.specializareid
WHERE pacient.pacientid = '1';

/*3. Calcularea pretului analizelor unei programari*/
SELECT 
	SUM(analiza.pret)
FROM programare_analize
	INNER JOIN analiza
		ON programare_analize.analizaid = analiza.analizaid
	INNER JOIN programare
		ON programare_analize.programareid = programare.programareid
WHERE programare.programareid = 5;	

/*4. Listare a tuturor programarilor confirmate cu medicii si pacientii lor */
SELECT
	CONCAT(pacient.nume, ' ', pacient.prenume) AS nume_complet_pacient,
	CONCAT(medic.nume, ' ', medic.prenume) AS nume_complet_medic,
	programare.specializare AS specializare,
	programare.date AS data_programare
FROM medic
FULL OUTER JOIN programare 
	ON medic.medicid = programare.medicid
FULL OUTER JOIN pacient 
	ON programare.pacientid = pacient.pacientid
WHERE programare.stare = 'confirmata';

/*5. Listare a rezultatelor analizelor unui pacient*/
SELECT CONCAT(pacient.nume, ' ', pacient.prenume) AS nume_complet_pacient,
       analiza.numeanaliza,
       rezultatanaliza_analize.rezultatanalizaid
FROM pacient
	INNER JOIN rezultatanaliza 
		ON pacient.pacientid = rezultatanaliza.pacientid
	INNER JOIN rezultatanaliza_analize 
		ON rezultatanaliza.rezultatanalizaid = rezultatanaliza_analize.rezultatanalizaid
	INNER JOIN analiza 
		ON analiza.analizaid = rezultatanaliza_analize.analizaid
WHERE pacient.pacientid = '5';


