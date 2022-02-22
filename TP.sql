-- CREATE USER ic WITH PASSWORD 'int&grati0n_c0ntinue';

CREATE TABLE contrat_cadre (
    cc_id serial not null,
	cc_marge INT not null,
	CONSTRAINT PK_Contrat_cadre primary key (cc_id)
); ALTER TABLE contrat_cadre OWNER TO ic;

CREATE TABLE client (
    cli_id serial not null,
	cli_nom CHARACTER VARYING not null,
	cli_prenom CHARACTER VARYING not null,
    cli_username CHARACTER VARYING not null,
	cli_password CHARACTER VARYING not null,
    cli_cc_id INT not null,
	CONSTRAINT PK_Client primary key (cli_id),
    CONSTRAINT FK_Client_Contrat_cadre foreign key (cli_cc_id) REFERENCES contrat_cadre(cc_id) ON UPDATE CASCADE ON DELETE CASCADE
); ALTER TABLE client OWNER TO ic;

CREATE TABLE piece_detache (
    pd_id serial not null,
    pd_libelle CHARACTER VARYING not null,
	pd_prix INT not null,
	CONSTRAINT PK_Piece_detache primary key (pd_id)
); ALTER TABLE piece_detache OWNER TO ic;

CREATE TABLE commande (
    cmde_numero INT not null,
    cmde_cli_id INT not null,
    cmde_pd_id INT not null,
    cmde_qtte_pd INT not null,
	CONSTRAINT PK_Commande primary key (cmde_numero, cmde_cli_id, cmde_pd_id),
    CONSTRAINT FK_Commande_Client foreign key (cmde_cli_id) REFERENCES client(cli_id) ON UPDATE CASCADE ON DELETE CASCADE,
    CONSTRAINT FK_Commande_Piece_detache foreign key (cmde_pd_id) REFERENCES piece_detache(pd_id) ON UPDATE CASCADE ON DELETE CASCADE
); ALTER TABLE commande OWNER TO ic;

INSERT INTO contrat_cadre (cc_marge) VALUES
(5),
(10),
(15),
(20),
(25);

INSERT INTO client (cli_nom, cli_prenom, cli_username, cli_password, cli_cc_id) VALUES
('Jhon', 'Doe', 'jdoe', 'init123', 1),
('Charle', 'Poverty', 'jdoe', 'init123', 1),
('Seth', 'Gecko', 'jdoe', 'init123', 1),
('Marvin', 'Smith', 'jdoe', 'init123', 2),
('Jhon', 'Cina', 'jdoe', 'init123', 2),
('Jhon', 'Minesota', 'jdoe', 'init123', 2),
('Jack', 'Doe', 'jdoe', 'init123', 3),
('Jhon', 'Travolta', 'jdoe', 'init123', 3),
('Jeff', 'Doe', 'jdoe', 'init123', 4),
('Richard', 'Richson', 'jdoe', 'init123', 5);

INSERT INTO piece_detache (pd_libelle, pd_prix) VALUES
('écrou', 2),
('pommeau', 5),
('levier', 10),
('pneu model 1', 50),
('pneu model 2', 50),
('pneu model 3', 50),
('gente 33mm', 80),
('gente 50mm', 80),
('gente 55mm', 80),
('gente 57mm', 80),
('vitre', 80),
('vitre teinté clair', 80),
('vitre teinté moyen', 80),
('vitre teinté foncé', 80),
('aile avant droit', 100),
('aile avant gauche ', 100),
('aile arrière droit', 100),
('aile arrière gauche', 100),
('capeau', 200),
('toit', 200);

INSERT INTO commande (cmde_numero, cmde_cli_id, cmde_pd_id, cmde_qtte_pd) VALUES
(1, 2, 1, 5),
(1, 2, 2, 1),
(1, 2, 5, 4),
(1, 2, 10, 4);
