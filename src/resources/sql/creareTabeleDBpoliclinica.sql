CREATE TABLE pacient(
	pacientid 	SERIAL 	  	 NOT NULL 	PRIMARY KEY,
	nume 		VARCHAR(255) NOT NULL,
	prenume 	VARCHAR(255) NOT NULL,
	varsta 		INT 		 NOT NULL,
	nrtelefon 	VARCHAR(255) NOT NULL,
	cnp 		VARCHAR(255) NOT NULL	UNIQUE,
	email 		VARCHAR(255) NOT NULL 	UNIQUE,
	img 		VARCHAR(255) 
);

CREATE TABLE medic(
	medicid 	SERIAL 		 NOT NULL 	PRIMARY KEY,
	nume 		VARCHAR(255) NOT NULL,
	prenume 	VARCHAR(255) NOT NULL,
	varsta 		INT 		 NOT NULL,
	nrtelefon 	VARCHAR(255) NOT NULL,
	cnp 		VARCHAR(255) NOT NULL	UNIQUE,
	email 		VARCHAR(255) NOT NULL	UNIQUE,
	img 		VARCHAR(255) 
);

CREATE TABLE fisaconsultatie(
	fisaconsultatieid	SERIAL			NOT NULL 	PRIMARY KEY,
	pacientId			INT				NOT NULL,
	medicId 			INT 			NOT NULL,
	diagnostic			VARCHAR(255)	NOT NULL
);

CREATE TABLE rezultatanaliza(
	rezultatanalizaid	SERIAL 			NOT NULL 	PRIMARY KEY,
	pacientId			INT				NOT NULL,
	rezultat			VARCHAR(255)	NOT NULL,
	cod 				VARCHAR(255)	NOT NULL	UNIQUE
);

CREATE TABLE programare_analize(
	programareid	INT 	NOT NULL,
	analizaId		INT 	NOT NULL,
	PRIMARY KEY (programareid, analizaId)
);

CREATE TABLE programare(
	programareid	SERIAL 			NOT NULL 	PRIMARY KEY,
	pacientid		INT 			NOT NULL,
	specializareid	INT 			NOT NULL,
	medicid			INT	 			NOT NULL,
	date 			TIMESTAMP 		NOT NULL,
	stare			VARCHAR(255)	NOT NULL	
);

CREATE TABLE specializare(
	specializareid		SERIAL 			NOT NULL 	PRIMARY KEY,
	numespecializare	VARCHAR(255) 	NOT NULL
);

CREATE TABLE medic_specializari(
	medicid			INT 	NOT NULL,
	specializareid	INT		NOT NULL,
	PRIMARY KEY (medicid, specializareid)
);

CREATE TABLE rezultatanaliza_analize(
	rezultatanalizaid	INT 	NOT NULL, 
	analizaid			INT 	NOT NULL,
	PRIMARY KEY (rezultatanalizaid, analizaid)
);

CREATE TABLE analiza(
	analizaid	SERIAL 			NOT NULL 	PRIMARY KEY,
	numeanaliza VARCHAR(255)	NOT NULL,
	pret 		INT				NOT NULL
);

CREATE TABLE fisaconsultatie_analize(
	fisaconsultatieid	INT		NOT NULL,
	analizaid			INT		NOT NULL,
	PRIMARY KEY (fisaconsultatieid, analizaid)
);
						 
ALTER TABLE fisaconsultatie_analize 
	ADD CONSTRAINT fk_fisaconsultatie
		FOREIGN KEY(fisaconsultatieid) 	REFERENCES fisaconsultatie(fisaconsultatieid),
	ADD CONSTRAINT fk_analiza
		FOREIGN KEY(analizaid) 		 	REFERENCES analiza(analizaid);
	
	
ALTER TABLE rezultatanaliza_analize 
	ADD CONSTRAINT fk_rezultatanaliza
		FOREIGN KEY(rezultatanalizaid) 	REFERENCES rezultatanaliza(rezultatanalizaid),
	ADD CONSTRAINT fk_analiza
		FOREIGN KEY(analizaid) 			REFERENCES analiza(analizaid);
	
ALTER TABLE medic_specializari 
	ADD CONSTRAINT fk_medic
		FOREIGN KEY(medicid) 	    REFERENCES medic(medicid),
	ADD CONSTRAINT fk_specializare
		FOREIGN KEY(specializareid) REFERENCES specializare(specializareid);

ALTER TABLE programare 
	ADD CONSTRAINT fk_pacient											
		FOREIGN KEY(pacientid) 		REFERENCES pacient(pacientid),
	ADD CONSTRAINT fk_specializare											
		FOREIGN KEY(specializareid) REFERENCES specializare(specializareid),
	ADD CONSTRAINT fk_medic											
		FOREIGN KEY(medicid) 		REFERENCES medic(medicid);

ALTER TABLE programare_analize 
	ADD CONSTRAINT fk_programare											
		FOREIGN KEY(programareid) REFERENCES programare(programareid),
	ADD CONSTRAINT fk_analiza											
		FOREIGN KEY(analizaid)    REFERENCES analiza(analizaid);
												
ALTER TABLE rezultatanaliza 
	ADD CONSTRAINT fk_pacient											
		FOREIGN KEY(pacientid) REFERENCES pacient(pacientid);
			
ALTER TABLE fisaconsultatie
		ADD CONSTRAINT fk_pacient	
			FOREIGN KEY(pacientid) REFERENCES pacient(pacientid),
		ADD CONSTRAINT fk_medic 	
			FOREIGN KEY(medicid)   REFERENCES medic(medicid);														

