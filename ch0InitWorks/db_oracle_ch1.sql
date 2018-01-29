--------------------------------------------------------
--  DDL for Sequence USERINFO_ID
--------------------------------------------------------

   CREATE SEQUENCE  "JU"."USERINFO_ID"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 61 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;


--------------------------------------------------------
--  �ļ��Ѵ��� - ����һ-һ��-29-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table USERINFO
--------------------------------------------------------

  CREATE TABLE "JU"."USERINFO" 
   (	"ID" NUMBER(18,0), 
	"USERNAME" VARCHAR2(50 BYTE), 
	"PASSWORD" VARCHAR2(50 BYTE), 
	"AGE" NUMBER(18,0), 
	"INSERTDATE" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into JU.USERINFO
SET DEFINE OFF;
Insert into JU.USERINFO (ID,USERNAME,PASSWORD,AGE,INSERTDATE) values (21,'�й�','�й���',100,null);
Insert into JU.USERINFO (ID,USERNAME,PASSWORD,AGE,INSERTDATE) values (2,'����ֽ','�Ҳ���',18,null);
Insert into JU.USERINFO (ID,USERNAME,PASSWORD,AGE,INSERTDATE) values (1,'����ֽ','�Ҳ���',18,null);
Insert into JU.USERINFO (ID,USERNAME,PASSWORD,AGE,INSERTDATE) values (41,'�й�','�й���',100,null);
Insert into JU.USERINFO (ID,USERNAME,PASSWORD,AGE,INSERTDATE) values (42,'�й�','�й���',100,null);
--------------------------------------------------------
--  DDL for Index SYS_C0013752
--------------------------------------------------------

  CREATE UNIQUE INDEX "JU"."SYS_C0013752" ON "JU"."USERINFO" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table USERINFO
--------------------------------------------------------

  ALTER TABLE "JU"."USERINFO" MODIFY ("ID" NOT NULL ENABLE);
  ALTER TABLE "JU"."USERINFO" ADD PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;