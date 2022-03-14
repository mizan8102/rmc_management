/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.0.45-community-nt : Database - rmc_chemical_ltd
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`rmc_chemical_ltd` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `rmc_chemical_ltd`;

/*Table structure for table `bank_data` */

DROP TABLE IF EXISTS `bank_data`;

CREATE TABLE `bank_data` (
  `date` date default NULL,
  `bank_name` varchar(500) default NULL,
  `bank_account` varchar(500) default NULL,
  `status` varchar(100) default NULL,
  `details` varchar(500) default NULL,
  `amount` varchar(500) default NULL,
  `catagory` varchar(500) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bank_data` */

/*Table structure for table `bank_name` */

DROP TABLE IF EXISTS `bank_name`;

CREATE TABLE `bank_name` (
  `bank_name` varchar(500) default NULL,
  `account_number` varchar(500) default NULL,
  `date` date default NULL,
  `catagory` varchar(500) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bank_name` */

insert  into `bank_name`(`bank_name`,`account_number`,`date`,`catagory`) values ('Sonali Bank','202369858656489789789','2021-02-17','Supplier Bank'),('Sonali Bank','999999999999999999','2021-02-17','My Bank'),('AB Bank','201032659897575757','2021-02-17','Supplier Bank');

/*Table structure for table `bkash` */

DROP TABLE IF EXISTS `bkash`;

CREATE TABLE `bkash` (
  `name` varchar(500) default NULL,
  `mobile` varchar(500) default NULL,
  `details` varchar(500) default NULL,
  `status` varchar(500) default NULL,
  `amount` varchar(500) default NULL,
  `date` date default NULL,
  `catagory` varchar(500) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bkash` */

/*Table structure for table `cash` */

DROP TABLE IF EXISTS `cash`;

CREATE TABLE `cash` (
  `date` date default NULL,
  `amount` varchar(500) default NULL,
  `status` varchar(100) default NULL,
  `details` varchar(500) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cash` */

insert  into `cash`(`date`,`amount`,`status`,`details`) values ('2021-03-10','500','Debit','Purchase - 001 - RMC 3'),('2021-03-10','2','Credit','Sales - 001 - Faruk'),('2021-03-10','2','Credit','Sales - 001 - Faruk'),('2021-03-10','28','Credit','Sales - 002 - Faruk'),('2021-03-10','500','Debit','Expenditure - adfa - asdf - Buying Cost = 454 - Ammount =56454656'),('2021-03-10','7500','Debit','Purchase - 200 - Purchase Due Collection - RMC 3'),('2021-03-10','211','Credit','Sales - 1 - Faruk'),('2021-03-14','500','Debit','Comission - Engineer - Jasmin - Commission - ..........'),('2021-04-01','99','Credit','Sales - 0089 - Sales Due Collection - Faruk'),('2021-04-01','70','Credit','Sales - 8 - Sales Due Collection - Faruk'),('2021-05-22','2','Credit','Sales - cghf - Faruk'),('2021-05-22','2','Credit','Sales - 45645 - Faruk'),('2021-05-22','35','Debit','Purchase - 456 - RMC 3'),('2021-05-22','500','Debit','Purchase - 200 - Purchase Due Collection - RMC 3'),('2021-05-22','66','Credit','Sales - 1200 - Faruk'),('2021-05-22','600','Credit','Sales - 123 - Sales Due Collection - Faruk'),('2021-05-22','200','Credit','Sales - 50 - Sales Due Collection - Faruk'),('2021-05-23','45','Credit','Sales - 400 - Faruk'),('2021-05-23','5000','Debit','Employe - Emon - Salary - January'),('2021-05-24','500','Debit','Employe - jasmin - Bonus - January'),('2021-01-01','100','Debit','Employe - Emon - Sales Commission - January'),('2021-02-03','200','Debit','Employe - Emon - Sales Commission - February'),('2021-05-24','2000','Debit','Employe - Emon - Bonus - january'),('2021-06-02','500','Credit','Sales - 5589 - Sales Due Collection - Faruk'),('2021-06-02','100','Credit','Sales - 645 - Sales Due Collection - Faruk'),('2021-06-02','900','Credit','Sales - 45 - Sales Due Collection - Faruk'),('2021-06-02','10','Credit','Sales - 6756 - Sharif'),('2021-06-02','10','Credit','Sales - 465 - Sales Due Collection - Sharif'),('2021-06-02','90','Credit','Sales - 5675 - Sales Due Collection - Sharif'),('2021-06-02','10','Credit','Sales - r75 - Sales Due Collection - Sharif'),('2021-06-02','90','Credit','Sales - 575 - Sales Due Collection - Sharif'),('2021-06-02','10','Credit','Sales - 5757 - Sharif'),('2021-06-03','2','Credit','Sales - 45345 - Faruk'),('2021-06-09','290','Debit','Purchase - 778898 - RMC 1'),('2021-06-09','875','Debit','Purchase - 700 - RMC 3'),('2021-06-09','100','Debit','Purchase - 8000 - Purchase Due Collection - RMC 1'),('2021-06-09','600','Credit','Sales - 5098 - Nadiya'),('2021-06-09','45','Credit','Sales - 1000 - Sales Due Collection - Sharif'),('2021-06-19','2','Credit','Sales - 46 - Sharif'),('2021-06-19','8','Credit','Sales - 445 - Sharif'),('2021-06-23','68','Credit','Sales - CUM01-1601 - Faruk'),('2021-06-23','4','Credit','Sales - CUM01-1627 - Faruk'),('2021-06-23','20','Credit','Sales - CUM01-1628 - Sharif'),('2021-06-23','96','Credit','Sales - CUM01-1629 - Faruk'),('2021-06-23','40','Credit','Sales - CUM01-1630 - Faruk'),('2021-06-23','900','Credit','Sales - CUM01-1631 - Sales Due Collection - Faruk'),('2021-06-23','20','Credit','Sales - CUM01-1632 - Sales Due Collection - Faruk'),('2021-06-23','500','Debit','Comission - Engineer - Jahid - .......... - ...........'),('2021-06-23','45','Debit','Cost - Transport - rtyrt'),('2021-06-23','500','Debit','Employe - Emon - Sales Commission - JAnuary'),('2021-06-23','505.0','Debit','Expenditure - er - er - Buying Cost = 5 - Ammount =500'),('2021-06-24','5000','Credit','Cash try');

/*Table structure for table `comisin_incentive_con_eng` */

DROP TABLE IF EXISTS `comisin_incentive_con_eng`;

CREATE TABLE `comisin_incentive_con_eng` (
  `designation` varchar(500) default NULL,
  `name` varchar(500) default NULL,
  `mobile` varchar(500) default NULL,
  `professon` varchar(500) default NULL,
  `catagory` varchar(500) default NULL,
  `details` varchar(500) default NULL,
  `amount` varchar(500) default NULL,
  `date` date default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `comisin_incentive_con_eng` */

insert  into `comisin_incentive_con_eng`(`designation`,`name`,`mobile`,`professon`,`catagory`,`details`,`amount`,`date`) values ('Engineer','Jasmin','01889970097',',,,,,','Commission','..........','500','2021-03-14'),('Engineer','Jahid','01555895566','Janina','..........','...........','500','2021-06-23');

/*Table structure for table `contructor_engineeer` */

DROP TABLE IF EXISTS `contructor_engineeer`;

CREATE TABLE `contructor_engineeer` (
  `id` varchar(500) default NULL,
  `name` varchar(500) default NULL,
  `address` varchar(500) default NULL,
  `phone` varchar(100) default NULL,
  `email` varchar(100) default NULL,
  `designation` varchar(200) default NULL,
  `date` date default NULL,
  `profession` varchar(200) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contructor_engineeer` */

insert  into `contructor_engineeer`(`id`,`name`,`address`,`phone`,`email`,`designation`,`date`,`profession`) values ('1','Jasmin','Feni','01889970097','jasmin.akter@gmail.com','Engineer','2021-03-10',',,,,,'),('2','Jahid','Feni','01555895566','jasmin.akter28999@gmail.com','Engineer','2021-03-10','Janina'),('3','Belal','Cumilla','01889956885','belal12@gmail.com','Others','2021-03-10','Janina'),('4','TArek','Feni','0188996325','Jasmin@gmail.com','Contructor','2021-03-21','......');

/*Table structure for table `cost_add` */

DROP TABLE IF EXISTS `cost_add`;

CREATE TABLE `cost_add` (
  `id` varchar(5000) default NULL,
  `date` date default NULL,
  `type` varchar(500) default NULL,
  `details` varchar(500) default NULL,
  `amount` varchar(500) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cost_add` */

insert  into `cost_add`(`id`,`date`,`type`,`details`,`amount`) values ('1','2021-06-23','Transport','rtyrt','45');

/*Table structure for table `customer_info` */

DROP TABLE IF EXISTS `customer_info`;

CREATE TABLE `customer_info` (
  `id` varchar(500) default NULL,
  `name` varchar(500) default NULL,
  `address` varchar(500) default NULL,
  `phone` varchar(100) default NULL,
  `details` varchar(500) default NULL,
  `reference_name_number` varchar(500) default NULL,
  `date` date default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customer_info` */

insert  into `customer_info`(`id`,`name`,`address`,`phone`,`details`,`reference_name_number`,`date`) values ('1','Faruk','Feni','018877655352','FEni','Engineer|Jasmin|01889970097','2021-03-10'),('2','Sharif','Feni','013456456456','Bolbona','Engineer|Jasmin|01889970097','2021-03-10'),('3','Nadiya','Fulgazi','0182235989','...........','Others|Belal|01889956885','2021-03-10');

/*Table structure for table `employe` */

DROP TABLE IF EXISTS `employe`;

CREATE TABLE `employe` (
  `id` varchar(500) default NULL,
  `name` varchar(200) default NULL,
  `phone` varchar(100) default NULL,
  `address` varchar(500) default NULL,
  `position` varchar(300) default NULL,
  `joining_date` date default NULL,
  `zone` varchar(500) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employe` */

insert  into `employe`(`id`,`name`,`phone`,`address`,`position`,`joining_date`,`zone`) values ('1','jasmin','01818738123','dha','sr','2020-12-09','Feni'),('2','nadiya','0182347232','Feni','HR','2020-12-09','Comilla'),('3','Emon','0185569978','Comilla','SR','2021-01-14','Comilla');

/*Table structure for table `employe_salary` */

DROP TABLE IF EXISTS `employe_salary`;

CREATE TABLE `employe_salary` (
  `name` varchar(500) default NULL,
  `number` varchar(500) default NULL,
  `position` varchar(500) default NULL,
  `type` varchar(500) default NULL,
  `details` varchar(500) default NULL,
  `ammount` varchar(500) default NULL,
  `datee` date default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employe_salary` */

insert  into `employe_salary`(`name`,`number`,`position`,`type`,`details`,`ammount`,`datee`) values ('Emon','0185569978','SR','Salary','January','5000','2021-05-23'),('jasmin','01818738123','sr','Bonus','January','500','2021-05-24'),('Emon','0185569978','SR','Sales Commission','January','100','2021-01-01'),('Emon','0185569978','SR','Sales Commission','February','200','2021-02-03'),('Emon','0185569978','SR','Bonus','january','2000','2021-05-24'),('Emon','0185569978','SR','Sales Commission','JAnuary','500','2021-06-23');

/*Table structure for table `employe_sales_target` */

DROP TABLE IF EXISTS `employe_sales_target`;

CREATE TABLE `employe_sales_target` (
  `id` varchar(500) default NULL,
  `name` varchar(500) default NULL,
  `phone` varchar(500) default NULL,
  `targate_quanty` varchar(500) default NULL,
  `month` date default NULL,
  `p_name` varchar(500) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employe_sales_target` */

insert  into `employe_sales_target`(`id`,`name`,`phone`,`targate_quanty`,`month`,`p_name`) values ('1','jasmin','01818738123','3','2021-06-23','Addicon Plus');

/*Table structure for table `expenditure` */

DROP TABLE IF EXISTS `expenditure`;

CREATE TABLE `expenditure` (
  `id` varchar(500) default NULL,
  `asset` varchar(500) default NULL,
  `detailse` varchar(500) default NULL,
  `buying_cost` varchar(500) default NULL,
  `amount` varchar(500) default NULL,
  `date` date default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `expenditure` */

insert  into `expenditure`(`id`,`asset`,`detailse`,`buying_cost`,`amount`,`date`) values ('1','adfa','asdf','454','500','2021-03-10'),('2','er','er','5','500','2021-06-23');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `User_NAme` varchar(200) default NULL,
  `Password` varchar(200) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`User_NAme`,`Password`) values ('Jasmin','12345'),('RMC','1234');

/*Table structure for table `pro_information` */

DROP TABLE IF EXISTS `pro_information`;

CREATE TABLE `pro_information` (
  `id` varchar(500) default NULL,
  `p_name` varchar(500) default NULL,
  `p_price` varchar(500) default NULL,
  `s_price` varchar(500) default NULL,
  `date` date default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pro_information` */

insert  into `pro_information`(`id`,`p_name`,`p_price`,`s_price`,`date`) values (NULL,'Addicon Plus','250','255','2021-01-03'),(NULL,'Mortar Bonder','250','255','2021-02-11'),(NULL,'Fungicol','100','120','2021-02-11');

/*Table structure for table `purchase` */

DROP TABLE IF EXISTS `purchase`;

CREATE TABLE `purchase` (
  `bill` varchar(500) default NULL,
  `id` varchar(500) default NULL,
  `Company_Name` varchar(500) default NULL,
  `product_name` varchar(500) default NULL,
  `pur_price` varchar(500) default NULL,
  `sal_price` varchar(500) default NULL,
  `quantity` varchar(500) default NULL,
  `total` varchar(500) default NULL,
  `date` date default NULL,
  `delivery_place` varchar(500) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `purchase` */

insert  into `purchase`(`bill`,`id`,`Company_Name`,`product_name`,`pur_price`,`sal_price`,`quantity`,`total`,`date`,`delivery_place`) values ('001','1','RMC 3','Addicon Plus','250','255','2','500.0','2021-03-10','Feni'),('001','2','RMC 3','Mortar Bonder','250','255','30','7500.0','2021-03-10','Feni'),('12','3','RMC 1','Addicon Plus','250','255','2','500.0','2021-03-10','feni'),('456','4','RMC 3','Addicon Plus','250','255','9.0','2295.0','2021-05-22','feni'),('456','5','RMC 3','Mortar Bonder','250','255','5','1250.0','2021-05-22','feni'),('778898','6','RMC 1','Addicon Plus','290','260','20','5800.0','2021-06-09','Feni'),('700','7','RMC 3','Addicon Plus','250','255','10','2500.0','2021-06-09','Feni'),('700','8','RMC 3','Mortar Bonder','250','255','25.0','6375.0','2021-06-09','Feni');

/*Table structure for table `purchase_account` */

DROP TABLE IF EXISTS `purchase_account`;

CREATE TABLE `purchase_account` (
  `sl` varchar(500) default NULL,
  `bill` varchar(500) default NULL,
  `date` date default NULL,
  `amount` varchar(500) default NULL,
  `dis` varchar(500) default NULL,
  `total_amount` varchar(500) default NULL,
  `final_amount` varchar(500) default NULL,
  `paid` varchar(500) default NULL,
  `event` varchar(500) default NULL,
  `delivery_place` varchar(500) default 'No',
  `total_ltr` varchar(500) default '0',
  `Company_Name` varchar(500) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `purchase_account` */

insert  into `purchase_account`(`sl`,`bill`,`date`,`amount`,`dis`,`total_amount`,`final_amount`,`paid`,`event`,`delivery_place`,`total_ltr`,`Company_Name`) values (NULL,'001','2021-03-10','8000.0','0','8000.0','8000.0','500','Cash','Feni','32.0','RMC 3'),(NULL,'12','2021-03-10','500.0','0','500.0','500.0','0','No','feni','34.0','RMC 1'),(NULL,'200','2021-03-10','0','0','0','7500.0','7500','Cash','No','0','RMC 3'),(NULL,'456','2021-05-22','3545.0','10','3535.0','3535.0','35','Cash','feni','14.0','RMC 3'),(NULL,'200','2021-05-22','0','0','0','3500.0','500','Cash','No','0','RMC 3'),(NULL,'778898','2021-06-09','5800.0','10','5790.0','6290.0','290','Cash','Feni','20.0','RMC 1'),(NULL,'700','2021-06-09','8875.0','0','8875.0','11875.0','875','Cash','Feni','55.0','RMC 3'),(NULL,'8000','2021-06-09','0','0','0','6000.0','100','Cash','No','0','RMC 1');

/*Table structure for table `sales` */

DROP TABLE IF EXISTS `sales`;

CREATE TABLE `sales` (
  `id` varchar(500) default NULL,
  `bill` varchar(500) default NULL,
  `customerName` varchar(500) default NULL,
  `p_name` varchar(500) default NULL,
  `p_id` varchar(500) default NULL,
  `p_price` varchar(500) default NULL,
  `s_price` varchar(500) default NULL,
  `quantity` varchar(500) default NULL,
  `total` varchar(500) default NULL,
  `employe_name` varchar(500) default NULL,
  `ref_des` varchar(500) default NULL,
  `reference_person` varchar(500) default NULL,
  `date` date default NULL,
  `delivery_place` varchar(500) default NULL,
  `chalan ltr` varchar(500) default NULL,
  `chalan quantity` varchar(500) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sales` */

insert  into `sales`(`id`,`bill`,`customerName`,`p_name`,`p_id`,`p_price`,`s_price`,`quantity`,`total`,`employe_name`,`ref_des`,`reference_person`,`date`,`delivery_place`,`chalan ltr`,`chalan quantity`) values (NULL,'001','Faruk','Mortar Bonder','2','250','255','2','510.0','Emon','Engineer','Jasmin','2021-03-10','Feni',NULL,NULL),(NULL,'002','Faruk','Mortar Bonder','2','250','255','4','1020.0','Emon','Engineer','Jasmin','2021-03-10','Feni','2','2'),(NULL,'1','Faruk','Mortar Bonder','2','250','255','2','510.0','Emon','Engineer','Jasmin','2021-03-10','feni','5','2'),(NULL,'cghf','Faruk','Addicon Plus','3','250','255','1','255.0','Emon','Engineer','Jasmin','2021-05-22','hfhfg','2','1'),(NULL,'45645','Faruk','Addicon Plus','3','250','255','1','255.0','Emon','Engineer','Jasmin','2021-05-22','hgh','5','1'),(NULL,'1200','Faruk','Addicon Plus','4','250','255','4','1020.0','Emon','Engineer','Jasmin','2021-05-22','cumilla','1','4'),(NULL,'1200','Faruk','Mortar Bonder','5','250','255','2','510.0','Emon','','','2021-05-22','cumilla','2','1'),(NULL,'400','Faruk','Addicon Plus','4','250','255','2','510.0','Emon','Engineer','Jasmin','2021-05-23','feni','2','1'),(NULL,'400','Faruk','Mortar Bonder','5','250','255','1','255.0','Emon','','','2021-05-23','feni','1','1'),(NULL,'6756','Sharif','Addicon Plus','1','250','255','2','510.0','Emon','Engineer','Jasmin','2021-06-02','fgh','1','1'),(NULL,'5757','Sharif','Addicon Plus','4','250','255','1','255.0','Emon','Engineer','Jasmin','2021-06-02','htyu','1','1'),(NULL,'45345','Faruk','Addicon Plus','4','250','255','2','510.0','Emon','Engineer','Jasmin','2021-06-03','bgfh','2','2'),(NULL,'5098','Nadiya','Addicon Plus','7','250','255','10','2550.0','Emon','Others','Belal','2021-06-09','feni','2','5'),(NULL,'5098','Nadiya','Mortar Bonder','8','250','255','20','5100.0','Emon','','','2021-06-09','feni','10','2'),(NULL,'46','Sharif','Mortar Bonder','5','250','255','1','255.0','Emon','Engineer','Jasmin','2021-06-19','feni','1','1'),(NULL,'445','Sharif','Mortar Bonder','8','250','255','1','255.0','Emon','Engineer','Jasmin','2021-06-19','fg','1','1'),(NULL,'CUM01-1601','Faruk','Addicon Plus','6','290','260','1','260.0','Emon','Engineer','Jasmin','2021-06-23','556','1','1'),(NULL,'CUM01-1627','Faruk','Addicon Plus','6','290','260','4','1040.0','jasmin','Engineer','Jasmin','2021-06-23','jjy','4','4'),(NULL,'CUM01-1628','Sharif','Addicon Plus','6','290','260','2','520.0','jasmin','Engineer','Jasmin','2021-06-23','jhghj','2','2'),(NULL,'CUM01-1629','Faruk','Addicon Plus','6','290','260','1','260.0','Emon','Engineer','Jasmin','2021-06-23','dh','1','1'),(NULL,'CUM01-1630','Faruk','Addicon Plus','6','290','260','4','1040.0','Emon','Engineer','Jasmin','2021-06-23','gfgh','4','4');

/*Table structure for table `sales_account` */

DROP TABLE IF EXISTS `sales_account`;

CREATE TABLE `sales_account` (
  `sl` varchar(500) default NULL,
  `bill` varchar(500) default NULL,
  `customer` varchar(500) default NULL,
  `date` date default NULL,
  `amount` varchar(500) default NULL,
  `dis` varchar(500) default NULL,
  `total_amount` varchar(500) default NULL,
  `final_amount` varchar(500) default NULL,
  `paid` varchar(500) default NULL,
  `event` varchar(500) default NULL,
  `delivery_place` varchar(500) default NULL,
  `total_ltr` varchar(500) default NULL,
  `ref_designation` varchar(500) default NULL,
  `con_eng_name` varchar(500) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sales_account` */

insert  into `sales_account`(`sl`,`bill`,`customer`,`date`,`amount`,`dis`,`total_amount`,`final_amount`,`paid`,`event`,`delivery_place`,`total_ltr`,`ref_designation`,`con_eng_name`) values (NULL,'001','Faruk','2021-03-10','510.0','0','510.0','510.0','2','Cash','Feni','2.0','Engineer','Jasmin'),(NULL,'002','Faruk','2021-03-10','1020.0','0','1020.0','1528.0','28','Cash','Feni','4.0','Engineer','Jasmin'),(NULL,'1','Faruk','2021-03-10','510.0','0','510.0','2010.0','211','Cash','feni','2.0','Engineer','Jasmin'),(NULL,'0089','Faruk','2021-04-01','0','0','0','1799.0','99','Cash','No','0',NULL,NULL),(NULL,'8','Faruk','2021-04-01','0','0','0','1700.0','70','Cash','No','0',NULL,NULL),(NULL,'cghf','Faruk','2021-05-22','255.0','0','255.0','1885.0','2','Cash','hfhfg','1.0','Engineer','Jasmin'),(NULL,'45645','Faruk','2021-05-22','255.0','0','255.0','2138.0','2','Cash','hgh','1.0','Engineer','Jasmin'),(NULL,'1200','Faruk','2021-05-22','1530.0','0','1530.0','3666.0','66','Cash','cumilla','6.0','Engineer','Jasmin'),(NULL,'123','Faruk','2021-05-22','0','0','0','3600.0','600','Cash','No','0',NULL,NULL),(NULL,'50','Faruk','2021-05-22','0','0','0','3000.0','200','Cash','No','0',NULL,NULL),(NULL,'400','Faruk','2021-05-23','765.0','20','745.0','3545.0','45','Cash','feni','3.0','Engineer','Jasmin'),(NULL,'5589','Faruk','2021-06-02','0','0','0','3500.0','500','Cash','No','0',NULL,NULL),(NULL,'645','Faruk','2021-06-02','0','0','0','3000.0','100','Cash','No','0',NULL,NULL),(NULL,'45','Faruk','2021-06-02','0','0','0','2900.0','900','Cash','No','0',NULL,NULL),(NULL,'6756','Sharif','2021-06-02','510.0','0','510.0','510.0','10','Cash','fgh','2.0','Engineer','Jasmin'),(NULL,'465','Sharif','2021-06-02','0','0','0','500.0','10','Cash','No','0',NULL,NULL),(NULL,'5675','Sharif','2021-06-02','0','0','0','490.0','90','Cash','No','0',NULL,NULL),(NULL,'r75','Sharif','2021-06-02','0','0','0','400.0','10','Cash','No','0',NULL,NULL),(NULL,'575','Sharif','2021-06-02','0','0','0','390.0','90','Cash','No','0',NULL,NULL),(NULL,'5757','Sharif','2021-06-02','255.0','0','255.0','555.0','10','Cash','htyu','1.0','Engineer','Jasmin'),(NULL,'45345','Faruk','2021-06-03','510.0','0','510.0','2510.0','2','Cash','bgfh','2.0','Engineer','Jasmin'),(NULL,'5098','Nadiya','2021-06-09','7650.0','50','7600.0','7600.0','600','Cash','feni','30.0','Others','Belal'),(NULL,'1000','Sharif','2021-06-09','0','0','0','545.0','45','Cash','No','0',NULL,NULL),(NULL,'46','Sharif','2021-06-19','255.0','0','255.0','755.0','2','Cash','feni','1.0','Engineer','Jasmin'),(NULL,'445','Sharif','2021-06-19','255.0','0','255.0','1008.0','8','Cash','fg','1.0','Engineer','Jasmin'),(NULL,'CUM01-1601','Faruk','2021-06-23','260.0','0','260.0','2768.0','68','Cash','556','1.0','Engineer','Jasmin'),(NULL,'CUM01-1627','Faruk','2021-06-23','1040.0','0','1040.0','3740.0','4','Cash','jjy','4.0','Engineer','Jasmin'),(NULL,'CUM01-1628','Sharif','2021-06-23','520.0','0','520.0','1520.0','20','Cash','jhghj','2.0','Engineer','Jasmin'),(NULL,'CUM01-1629','Faruk','2021-06-23','260.0','0','260.0','3996.0','96','Cash','dh','1.0','Engineer','Jasmin'),(NULL,'CUM01-1630','Faruk','2021-06-23','1040.0','0','1040.0','4940.0','40','Cash','gfgh','5.0','Engineer','Jasmin'),(NULL,'CUM01-1631','Faruk','2021-06-23','0','0','0','4900.0','900','Cash','No','0',NULL,NULL),(NULL,'CUM01-1632','Faruk','2021-06-23','0','0','0','4000.0','20','Cash','No','0',NULL,NULL);

/*Table structure for table `suplier_information` */

DROP TABLE IF EXISTS `suplier_information`;

CREATE TABLE `suplier_information` (
  `id` varchar(500) default NULL,
  `name` varchar(500) default NULL,
  `address` varchar(500) default NULL,
  `phone` varchar(100) default NULL,
  `details` varchar(500) default NULL,
  `date` date default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `suplier_information` */

insert  into `suplier_information`(`id`,`name`,`address`,`phone`,`details`,`date`) values ('1','RMC 1','Comilla','0188327634','Notthing','2020-12-09'),('3','RMC 3','dd','01823748333','jjj','2021-03-10'),('4','Jasmin','Feni','018238973875','.............................','2021-03-10');

/*Table structure for table `user_accounts` */

DROP TABLE IF EXISTS `user_accounts`;

CREATE TABLE `user_accounts` (
  `id` varchar(300) default NULL,
  `username` varchar(300) default NULL,
  `password` varchar(300) default NULL,
  `status` varchar(300) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_accounts` */

insert  into `user_accounts`(`id`,`username`,`password`,`status`) values ('2','Jasmin','123','User'),('3','Admin','12345','Admin');

/*Table structure for table `user_id` */

DROP TABLE IF EXISTS `user_id`;

CREATE TABLE `user_id` (
  `id` varchar(300) default NULL,
  `status` varchar(300) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_id` */

insert  into `user_id`(`id`,`status`) values ('1','User'),('2','User'),('3','Admin');

/*Table structure for table `bs_cash` */

DROP TABLE IF EXISTS `bs_cash`;

/*!50001 DROP VIEW IF EXISTS `bs_cash` */;
/*!50001 DROP TABLE IF EXISTS `bs_cash` */;

/*!50001 CREATE TABLE  `bs_cash`(
 `details` varchar(500) ,
 `amount` varchar(500) 
)*/;

/*Table structure for table `bs_cash_de` */

DROP TABLE IF EXISTS `bs_cash_de`;

/*!50001 DROP VIEW IF EXISTS `bs_cash_de` */;
/*!50001 DROP TABLE IF EXISTS `bs_cash_de` */;

/*!50001 CREATE TABLE  `bs_cash_de`(
 `details` varchar(500) ,
 `amount` varchar(500) 
)*/;

/*Table structure for table `bs_employe` */

DROP TABLE IF EXISTS `bs_employe`;

/*!50001 DROP VIEW IF EXISTS `bs_employe` */;
/*!50001 DROP TABLE IF EXISTS `bs_employe` */;

/*!50001 CREATE TABLE  `bs_employe`(
 `details` varchar(500) ,
 `amount` varchar(500) 
)*/;

/*Table structure for table `bs_eng_con_commmission` */

DROP TABLE IF EXISTS `bs_eng_con_commmission`;

/*!50001 DROP VIEW IF EXISTS `bs_eng_con_commmission` */;
/*!50001 DROP TABLE IF EXISTS `bs_eng_con_commmission` */;

/*!50001 CREATE TABLE  `bs_eng_con_commmission`(
 `details` varchar(500) ,
 `amount` varchar(500) 
)*/;

/*Table structure for table `bs_expenditure` */

DROP TABLE IF EXISTS `bs_expenditure`;

/*!50001 DROP VIEW IF EXISTS `bs_expenditure` */;
/*!50001 DROP TABLE IF EXISTS `bs_expenditure` */;

/*!50001 CREATE TABLE  `bs_expenditure`(
 `details` varchar(500) ,
 `amount` varchar(500) 
)*/;

/*Table structure for table `bs_putotal` */

DROP TABLE IF EXISTS `bs_putotal`;

/*!50001 DROP VIEW IF EXISTS `bs_putotal` */;
/*!50001 DROP TABLE IF EXISTS `bs_putotal` */;

/*!50001 CREATE TABLE  `bs_putotal`(
 `details` varchar(500) ,
 `amount` varchar(500) 
)*/;

/*Table structure for table `bs_sales` */

DROP TABLE IF EXISTS `bs_sales`;

/*!50001 DROP VIEW IF EXISTS `bs_sales` */;
/*!50001 DROP TABLE IF EXISTS `bs_sales` */;

/*!50001 CREATE TABLE  `bs_sales`(
 `details` varchar(500) ,
 `amount` varchar(500) 
)*/;

/*Table structure for table `bs_utility_cost` */

DROP TABLE IF EXISTS `bs_utility_cost`;

/*!50001 DROP VIEW IF EXISTS `bs_utility_cost` */;
/*!50001 DROP TABLE IF EXISTS `bs_utility_cost` */;

/*!50001 CREATE TABLE  `bs_utility_cost`(
 `details` varchar(500) ,
 `amount` varchar(500) 
)*/;

/*Table structure for table `emp_salary` */

DROP TABLE IF EXISTS `emp_salary`;

/*!50001 DROP VIEW IF EXISTS `emp_salary` */;
/*!50001 DROP TABLE IF EXISTS `emp_salary` */;

/*!50001 CREATE TABLE  `emp_salary`(
 `name` varchar(500) ,
 `type` varchar(500) ,
 `amount` double ,
 `datee` date 
)*/;

/*Table structure for table `employe_reference` */

DROP TABLE IF EXISTS `employe_reference`;

/*!50001 DROP VIEW IF EXISTS `employe_reference` */;
/*!50001 DROP TABLE IF EXISTS `employe_reference` */;

/*!50001 CREATE TABLE  `employe_reference`(
 `customerName` varchar(500) ,
 `p_name` varchar(500) ,
 `p_id` varchar(500) ,
 `p_price` varchar(500) ,
 `s_price` varchar(500) ,
 `quantity` double ,
 `total` double ,
 `employe_name` varchar(500) ,
 `reference_person` varchar(500) ,
 `date` date 
)*/;

/*Table structure for table `pur_qantity_date` */

DROP TABLE IF EXISTS `pur_qantity_date`;

/*!50001 DROP VIEW IF EXISTS `pur_qantity_date` */;
/*!50001 DROP TABLE IF EXISTS `pur_qantity_date` */;

/*!50001 CREATE TABLE  `pur_qantity_date`(
 `datee` date ,
 `product_name` varchar(500) ,
 `pur_price` double ,
 `sal_price` double ,
 `pur_quantity` double 
)*/;

/*Table structure for table `pur_quantity` */

DROP TABLE IF EXISTS `pur_quantity`;

/*!50001 DROP VIEW IF EXISTS `pur_quantity` */;
/*!50001 DROP TABLE IF EXISTS `pur_quantity` */;

/*!50001 CREATE TABLE  `pur_quantity`(
 `product_name` varchar(500) ,
 `pur_quantity` double 
)*/;

/*Table structure for table `pur_quantity_id` */

DROP TABLE IF EXISTS `pur_quantity_id`;

/*!50001 DROP VIEW IF EXISTS `pur_quantity_id` */;
/*!50001 DROP TABLE IF EXISTS `pur_quantity_id` */;

/*!50001 CREATE TABLE  `pur_quantity_id`(
 `id` varchar(500) ,
 `product_name` varchar(500) ,
 `pur_price` varchar(500) ,
 `sal_price` varchar(500) ,
 `pur_quantity` double 
)*/;

/*Table structure for table `rmc_transection` */

DROP TABLE IF EXISTS `rmc_transection`;

/*!50001 DROP VIEW IF EXISTS `rmc_transection` */;
/*!50001 DROP TABLE IF EXISTS `rmc_transection` */;

/*!50001 CREATE TABLE  `rmc_transection`(
 `date` date ,
 `bill` varchar(500) ,
 `total_ltr` varchar(500) ,
 `delivery_place` varchar(500) ,
 `total_amount` varchar(500) ,
 `final_amount` varchar(500) ,
 `paid` varchar(500) ,
 `event` varchar(500) 
)*/;

/*Table structure for table `s_quantity` */

DROP TABLE IF EXISTS `s_quantity`;

/*!50001 DROP VIEW IF EXISTS `s_quantity` */;
/*!50001 DROP TABLE IF EXISTS `s_quantity` */;

/*!50001 CREATE TABLE  `s_quantity`(
 `product_name` varchar(500) ,
 `s_quantity` double 
)*/;

/*Table structure for table `s_quantity_date` */

DROP TABLE IF EXISTS `s_quantity_date`;

/*!50001 DROP VIEW IF EXISTS `s_quantity_date` */;
/*!50001 DROP TABLE IF EXISTS `s_quantity_date` */;

/*!50001 CREATE TABLE  `s_quantity_date`(
 `date` date ,
 `product_name` varchar(500) ,
 `p_price` double ,
 `s_price` double ,
 `s_quantity` double 
)*/;

/*Table structure for table `s_quantity_id` */

DROP TABLE IF EXISTS `s_quantity_id`;

/*!50001 DROP VIEW IF EXISTS `s_quantity_id` */;
/*!50001 DROP TABLE IF EXISTS `s_quantity_id` */;

/*!50001 CREATE TABLE  `s_quantity_id`(
 `id` varchar(500) ,
 `product_name` varchar(500) ,
 `p_price` varchar(500) ,
 `s_price` varchar(500) ,
 `s_quantity` double 
)*/;

/*Table structure for table `sal_achive` */

DROP TABLE IF EXISTS `sal_achive`;

/*!50001 DROP VIEW IF EXISTS `sal_achive` */;
/*!50001 DROP TABLE IF EXISTS `sal_achive` */;

/*!50001 CREATE TABLE  `sal_achive`(
 `employe_name` varchar(500) ,
 `date` date ,
 `p_name` varchar(500) ,
 `s_price` double ,
 `quantity` double ,
 `total` double 
)*/;

/*Table structure for table `sales_profit_final` */

DROP TABLE IF EXISTS `sales_profit_final`;

/*!50001 DROP VIEW IF EXISTS `sales_profit_final` */;
/*!50001 DROP TABLE IF EXISTS `sales_profit_final` */;

/*!50001 CREATE TABLE  `sales_profit_final`(
 `date` date ,
 `p_price` double ,
 `s_price` double ,
 `profit` double 
)*/;

/*Table structure for table `sales_target` */

DROP TABLE IF EXISTS `sales_target`;

/*!50001 DROP VIEW IF EXISTS `sales_target` */;
/*!50001 DROP TABLE IF EXISTS `sales_target` */;

/*!50001 CREATE TABLE  `sales_target`(
 `name` varchar(500) ,
 `p_name` varchar(500) ,
 `quantity` double ,
 `month` date 
)*/;

/*Table structure for table `salse_profite` */

DROP TABLE IF EXISTS `salse_profite`;

/*!50001 DROP VIEW IF EXISTS `salse_profite` */;
/*!50001 DROP TABLE IF EXISTS `salse_profite` */;

/*!50001 CREATE TABLE  `salse_profite`(
 `date` date ,
 `p_price` double ,
 `s_price` double 
)*/;

/*Table structure for table `stock` */

DROP TABLE IF EXISTS `stock`;

/*!50001 DROP VIEW IF EXISTS `stock` */;
/*!50001 DROP TABLE IF EXISTS `stock` */;

/*!50001 CREATE TABLE  `stock`(
 `product_name` varchar(500) ,
 `pur` double ,
 `sales` double 
)*/;

/*Table structure for table `stock_id` */

DROP TABLE IF EXISTS `stock_id`;

/*!50001 DROP VIEW IF EXISTS `stock_id` */;
/*!50001 DROP TABLE IF EXISTS `stock_id` */;

/*!50001 CREATE TABLE  `stock_id`(
 `id` varchar(500) ,
 `product_name` varchar(500) ,
 `pur_price` varchar(500) ,
 `sal_price` varchar(500) ,
 `pur` double ,
 `sales` double 
)*/;

/*Table structure for table `total_pur_amount` */

DROP TABLE IF EXISTS `total_pur_amount`;

/*!50001 DROP VIEW IF EXISTS `total_pur_amount` */;
/*!50001 DROP TABLE IF EXISTS `total_pur_amount` */;

/*!50001 CREATE TABLE  `total_pur_amount`(
 `date` date ,
 `amount` double ,
 `dis` double 
)*/;

/*View structure for view bs_cash */

/*!50001 DROP TABLE IF EXISTS `bs_cash` */;
/*!50001 DROP VIEW IF EXISTS `bs_cash` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `bs_cash` AS (select `cash`.`details` AS `details`,`cash`.`amount` AS `amount` from `cash` where ((`cash`.`status` = _latin1'Credit') and (`cash`.`details` like _latin1'Cash%'))) */;

/*View structure for view bs_cash_de */

/*!50001 DROP TABLE IF EXISTS `bs_cash_de` */;
/*!50001 DROP VIEW IF EXISTS `bs_cash_de` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `bs_cash_de` AS (select `cash`.`details` AS `details`,`cash`.`amount` AS `amount` from `cash` where ((`cash`.`status` = _latin1'Debit') and (`cash`.`details` like _latin1'Cash%'))) */;

/*View structure for view bs_employe */

/*!50001 DROP TABLE IF EXISTS `bs_employe` */;
/*!50001 DROP VIEW IF EXISTS `bs_employe` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `bs_employe` AS (select `cash`.`details` AS `details`,`cash`.`amount` AS `amount` from `cash` where ((`cash`.`status` = _latin1'Debit') and (`cash`.`details` like _latin1'Employe%'))) */;

/*View structure for view bs_eng_con_commmission */

/*!50001 DROP TABLE IF EXISTS `bs_eng_con_commmission` */;
/*!50001 DROP VIEW IF EXISTS `bs_eng_con_commmission` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `bs_eng_con_commmission` AS (select `cash`.`details` AS `details`,`cash`.`amount` AS `amount` from `cash` where ((`cash`.`status` = _latin1'Debit') and (`cash`.`details` like _latin1'Comission%'))) */;

/*View structure for view bs_expenditure */

/*!50001 DROP TABLE IF EXISTS `bs_expenditure` */;
/*!50001 DROP VIEW IF EXISTS `bs_expenditure` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `bs_expenditure` AS (select `cash`.`details` AS `details`,`cash`.`amount` AS `amount` from `cash` where ((`cash`.`status` = _latin1'Debit') and (`cash`.`details` like _latin1'Expenditure%'))) */;

/*View structure for view bs_putotal */

/*!50001 DROP TABLE IF EXISTS `bs_putotal` */;
/*!50001 DROP VIEW IF EXISTS `bs_putotal` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `bs_putotal` AS (select `cash`.`details` AS `details`,`cash`.`amount` AS `amount` from `cash` where ((`cash`.`status` = _latin1'Debit') and (`cash`.`details` like _latin1'Purchase%'))) */;

/*View structure for view bs_sales */

/*!50001 DROP TABLE IF EXISTS `bs_sales` */;
/*!50001 DROP VIEW IF EXISTS `bs_sales` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `bs_sales` AS (select `cash`.`details` AS `details`,`cash`.`amount` AS `amount` from `cash` where ((`cash`.`status` = _latin1'Credit') and (`cash`.`details` like _latin1'Sales%'))) */;

/*View structure for view bs_utility_cost */

/*!50001 DROP TABLE IF EXISTS `bs_utility_cost` */;
/*!50001 DROP VIEW IF EXISTS `bs_utility_cost` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `bs_utility_cost` AS (select `cash`.`details` AS `details`,`cash`.`amount` AS `amount` from `cash` where ((`cash`.`status` = _latin1'Debit') and (`cash`.`details` like _latin1'Cost%'))) */;

/*View structure for view emp_salary */

/*!50001 DROP TABLE IF EXISTS `emp_salary` */;
/*!50001 DROP VIEW IF EXISTS `emp_salary` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `emp_salary` AS (select `employe_salary`.`name` AS `name`,`employe_salary`.`type` AS `type`,sum(`employe_salary`.`ammount`) AS `amount`,`employe_salary`.`datee` AS `datee` from `employe_salary` group by `employe_salary`.`name`,`employe_salary`.`type`,`employe_salary`.`datee`) */;

/*View structure for view employe_reference */

/*!50001 DROP TABLE IF EXISTS `employe_reference` */;
/*!50001 DROP VIEW IF EXISTS `employe_reference` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `employe_reference` AS (select `sales`.`customerName` AS `customerName`,`sales`.`p_name` AS `p_name`,`sales`.`p_id` AS `p_id`,`sales`.`p_price` AS `p_price`,`sales`.`s_price` AS `s_price`,sum(`sales`.`quantity`) AS `quantity`,sum(`sales`.`total`) AS `total`,`sales`.`employe_name` AS `employe_name`,`sales`.`reference_person` AS `reference_person`,`sales`.`date` AS `date` from `sales` group by `sales`.`employe_name`,`sales`.`p_name`) */;

/*View structure for view pur_qantity_date */

/*!50001 DROP TABLE IF EXISTS `pur_qantity_date` */;
/*!50001 DROP VIEW IF EXISTS `pur_qantity_date` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `pur_qantity_date` AS (select `purchase`.`date` AS `datee`,`purchase`.`product_name` AS `product_name`,sum(`purchase`.`pur_price`) AS `pur_price`,sum(`purchase`.`sal_price`) AS `sal_price`,sum(`purchase`.`quantity`) AS `pur_quantity` from `purchase` group by `purchase`.`product_name`,`purchase`.`date`) */;

/*View structure for view pur_quantity */

/*!50001 DROP TABLE IF EXISTS `pur_quantity` */;
/*!50001 DROP VIEW IF EXISTS `pur_quantity` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `pur_quantity` AS (select `purchase`.`product_name` AS `product_name`,sum(`purchase`.`quantity`) AS `pur_quantity` from `purchase` group by `purchase`.`product_name`) */;

/*View structure for view pur_quantity_id */

/*!50001 DROP TABLE IF EXISTS `pur_quantity_id` */;
/*!50001 DROP VIEW IF EXISTS `pur_quantity_id` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `pur_quantity_id` AS (select `purchase`.`id` AS `id`,`purchase`.`product_name` AS `product_name`,`purchase`.`pur_price` AS `pur_price`,`purchase`.`sal_price` AS `sal_price`,sum(`purchase`.`quantity`) AS `pur_quantity` from `purchase` group by `purchase`.`id`,`purchase`.`product_name`) */;

/*View structure for view rmc_transection */

/*!50001 DROP TABLE IF EXISTS `rmc_transection` */;
/*!50001 DROP VIEW IF EXISTS `rmc_transection` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `rmc_transection` AS (select `purchase_account`.`date` AS `date`,`purchase_account`.`bill` AS `bill`,`purchase_account`.`total_ltr` AS `total_ltr`,`purchase_account`.`delivery_place` AS `delivery_place`,`purchase_account`.`total_amount` AS `total_amount`,`purchase_account`.`final_amount` AS `final_amount`,`purchase_account`.`paid` AS `paid`,`purchase_account`.`event` AS `event` from `purchase_account`) */;

/*View structure for view s_quantity */

/*!50001 DROP TABLE IF EXISTS `s_quantity` */;
/*!50001 DROP VIEW IF EXISTS `s_quantity` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `s_quantity` AS (select `sales`.`p_name` AS `product_name`,sum(`sales`.`quantity`) AS `s_quantity` from `sales` group by `sales`.`p_name`) */;

/*View structure for view s_quantity_date */

/*!50001 DROP TABLE IF EXISTS `s_quantity_date` */;
/*!50001 DROP VIEW IF EXISTS `s_quantity_date` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `s_quantity_date` AS (select `sales`.`date` AS `date`,`sales`.`p_name` AS `product_name`,sum(`sales`.`p_price`) AS `p_price`,sum(`sales`.`s_price`) AS `s_price`,sum(`sales`.`quantity`) AS `s_quantity` from `sales` group by `sales`.`p_name`,`sales`.`date`) */;

/*View structure for view s_quantity_id */

/*!50001 DROP TABLE IF EXISTS `s_quantity_id` */;
/*!50001 DROP VIEW IF EXISTS `s_quantity_id` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `s_quantity_id` AS (select `sales`.`p_id` AS `id`,`sales`.`p_name` AS `product_name`,`sales`.`p_price` AS `p_price`,`sales`.`s_price` AS `s_price`,sum(`sales`.`quantity`) AS `s_quantity` from `sales` group by `sales`.`p_id`) */;

/*View structure for view sal_achive */

/*!50001 DROP TABLE IF EXISTS `sal_achive` */;
/*!50001 DROP VIEW IF EXISTS `sal_achive` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `sal_achive` AS (select `sales`.`employe_name` AS `employe_name`,`sales`.`date` AS `date`,`sales`.`p_name` AS `p_name`,sum(`sales`.`s_price`) AS `s_price`,sum(`sales`.`quantity`) AS `quantity`,sum(`sales`.`total`) AS `total` from `sales` group by `sales`.`employe_name`,`sales`.`date`) */;

/*View structure for view sales_profit_final */

/*!50001 DROP TABLE IF EXISTS `sales_profit_final` */;
/*!50001 DROP VIEW IF EXISTS `sales_profit_final` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `sales_profit_final` AS (select `salse_profite`.`date` AS `date`,`salse_profite`.`p_price` AS `p_price`,`salse_profite`.`s_price` AS `s_price`,(`salse_profite`.`s_price` - `salse_profite`.`p_price`) AS `profit` from `salse_profite`) */;

/*View structure for view sales_target */

/*!50001 DROP TABLE IF EXISTS `sales_target` */;
/*!50001 DROP VIEW IF EXISTS `sales_target` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `sales_target` AS (select `employe_sales_target`.`name` AS `name`,`employe_sales_target`.`p_name` AS `p_name`,sum(`employe_sales_target`.`targate_quanty`) AS `quantity`,`employe_sales_target`.`month` AS `month` from `employe_sales_target` group by `employe_sales_target`.`name`,`employe_sales_target`.`p_name`,`employe_sales_target`.`month`) */;

/*View structure for view salse_profite */

/*!50001 DROP TABLE IF EXISTS `salse_profite` */;
/*!50001 DROP VIEW IF EXISTS `salse_profite` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `salse_profite` AS (select `sales`.`date` AS `date`,sum(`sales`.`p_price`) AS `p_price`,sum(`sales`.`s_price`) AS `s_price` from `sales` group by `sales`.`date`) */;

/*View structure for view stock */

/*!50001 DROP TABLE IF EXISTS `stock` */;
/*!50001 DROP VIEW IF EXISTS `stock` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `stock` AS (select `pur_quantity`.`product_name` AS `product_name`,`pur_quantity`.`pur_quantity` AS `pur`,`s_quantity`.`s_quantity` AS `sales` from (`pur_quantity` left join `s_quantity` on((`pur_quantity`.`product_name` = `s_quantity`.`product_name`)))) */;

/*View structure for view stock_id */

/*!50001 DROP TABLE IF EXISTS `stock_id` */;
/*!50001 DROP VIEW IF EXISTS `stock_id` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `stock_id` AS (select `pur_quantity_id`.`id` AS `id`,`pur_quantity_id`.`product_name` AS `product_name`,`pur_quantity_id`.`pur_price` AS `pur_price`,`pur_quantity_id`.`sal_price` AS `sal_price`,`pur_quantity_id`.`pur_quantity` AS `pur`,`s_quantity_id`.`s_quantity` AS `sales` from (`pur_quantity_id` left join `s_quantity_id` on((`pur_quantity_id`.`id` = `s_quantity_id`.`id`)))) */;

/*View structure for view total_pur_amount */

/*!50001 DROP TABLE IF EXISTS `total_pur_amount` */;
/*!50001 DROP VIEW IF EXISTS `total_pur_amount` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `total_pur_amount` AS (select `purchase_account`.`date` AS `date`,sum(`purchase_account`.`amount`) AS `amount`,sum(`purchase_account`.`dis`) AS `dis` from `purchase_account` where (`purchase_account`.`date` like _utf8'2021-02%') group by `purchase_account`.`date`) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
