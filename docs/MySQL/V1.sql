#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------
create database jakartaxreact;
use jakartaxreact;
#------------------------------------------------------------
# Table: User
#------------------------------------------------------------

CREATE TABLE User(
        id_user        Int  Auto_increment  NOT NULL ,
        mail_user      Varchar (50) NOT NULL ,
        password_user  Varchar (50) NOT NULL ,
        role_user      Varchar (50) NOT NULL ,
        formation_user Varchar (50)
	,CONSTRAINT User_PK PRIMARY KEY (id_user)
)ENGINE=InnoDB;

