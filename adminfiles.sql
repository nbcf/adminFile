/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     5/7/2011 11:14:33                            */
/*==============================================================*/


drop table if exists ACOES;

drop table if exists NIVELACESSO;

drop table if exists USUARIO;

/*==============================================================*/
/* Table: ACOES                                                 */
/*==============================================================*/
create table ACOES
(
   ID_ACAO              integer not null auto_increment,
   CAMINHO_ANALISE      varchar(255),
   NOME_ARQUIVO         varchar(255),
   TAMANHO_KB           varchar(255),
   DATA_CRIACAO         date,
   HASH_ARQUIVO         varchar(255),
   CAMINHO_SAIDA        varchar(255),
   ACAO                 varchar(255),
   DATA_ACAO            date,
   HORA_ACAO            varchar(255),
   HORA_CRIACAO         varchar(255),
   USUARIO_ACAO         varchar(255),
   primary key (ID_ACAO)
)
type = InnoDB;

/*==============================================================*/
/* Table: NIVELACESSO                                           */
/*==============================================================*/
create table NIVELACESSO
(
   ID_NIVELACESSO       integer not null auto_increment,
   ID_USUARIO           integer,
   COD_FUNCIONARIO      int(11),
   MODULO               varchar(255),
   primary key (ID_NIVELACESSO)
)
type = InnoDB;

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO
(
   ID_USUARIO           integer not null auto_increment,
   NOME                 varchar(255),
   LOGIN                varchar(255),
   SENHA                varchar(255),
   ACESSO_TOTAL         char(1),
   primary key (ID_USUARIO)
)
type = InnoDB;

alter table NIVELACESSO add constraint FK_REFERENCE_1 foreign key (ID_USUARIO)
      references USUARIO (ID_USUARIO) on delete restrict on update restrict;

