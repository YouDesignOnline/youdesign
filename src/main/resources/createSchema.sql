
create table IF NOT EXISTS user (
	userid bigint(15) NOT NULL AUTO_INCREMENT,
	name varchar(100) NOT NULL,
	email varchar(100) NOT NULL,
	password varchar(20) NOT NULL,
	mobilenumber bigint(14) NOT NULL,
	dob Date,
	facebookid varchar(50),
	twitterid varchar(50),
	instagramid varchar(50),
	isauthorizedtopostonsocialmedia enum('N','Y') DEFAULT 'N',
	lastpaymentmode varchar(20),
	creationtime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (email, mobilenumber),
	Unique KEY userid (userid)
) ENGINE=InnoDB;


create table IF NOT EXISTS useraddress (
	id bigint(15) NOT NULL AUTO_INCREMENT,
	userid bigint(15) NOT NULL,
	address varchar(500),
	islastdeliveryaddress enum('N','Y') DEFAULT 'N',
	creationtime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (id, userid),
	CONSTRAINT fk_userid FOREIGN KEY (userid)
	REFERENCES user(userid)
	ON DELETE CASCADE 
	ON UPDATE CASCADE
)ENGINE=InnoDB;

create table IF NOT EXISTS iteminventory (
	itemcode int(10)  NOT NULL,
	name varchar(50)  NOT NULL,
	description text  NOT NULL,
	type varchar(20),
	imageurl1 varchar(100),
	imageurl2 varchar(100),
	imageurl3 varchar(100),
	imageurl4 varchar(100),
	quantity int(10),
	color varchar(20),
	supplier varchar(50),
	supplierlocation varchar(50),
	supplieraddress varchar(100),
	supplierrating tinyint(1),
	issleevecustomizable enum('N','Y') DEFAULT 'N',
	isneckcustomizable enum('N','Y') DEFAULT 'N',
	isbackcustomizable enum('N','Y') DEFAULT 'N',
	islengthcustomizable enum('N','Y') DEFAULT 'N',
	ispocketcustomizable enum('N','Y') DEFAULT 'N',
	rating tinyint(1),
	PRIMARY KEY (itemcode)
) ENGINE=InnoDB;

create table IF NOT EXISTS itemreviews(
	reviewid bigint(15) NOT NULL AUTO_INCREMENT,
	userid bigint(15) NOT NULL,
	itemcode int(10)  NOT NULL,
	review text,
	creationtime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (reviewid, userid, itemcode),
	CONSTRAINT fk_userid_itemreviews FOREIGN KEY (userid)
	REFERENCES user(userid)
	ON DELETE CASCADE 
	ON UPDATE CASCADE,
	CONSTRAINT fk_itemcode_itemreviews FOREIGN KEY (itemcode)
	REFERENCES iteminventory(itemcode)
	ON DELETE CASCADE 
	ON UPDATE CASCADE
) ENGINE=InnoDB;

create table IF NOT EXISTS orders(
	orderid bigint(15) NOT NULL AUTO_INCREMENT,
	userid bigint(15) NOT NULL,
	itemcode int(10)  NOT NULL,
	quantity int(10),
	price double(12,2),
	standardsize varchar(10),
	standardsubsize tinyint(2),
	chest smallint(3),
	bust smallint(3),
	hip smallint(3),
	shoulder tinyint(3),
	underbust smallint(3),
	underarm smallint(3),
	highpointshouldertobustpoint tinyint(2),
	highpointshouldertowaist tinyint(2),
	highpointshouldertoknee tinyint(2),
	customerheight smallint(3),
	neck varchar(50),
	sleeve varchar(50),
	length varchar(50),
	pocket enum('N','Y') DEFAULT 'N',
	expecteddeliverydate Date,
	orderdatetime timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP,
	status varchar(20),
	paymentmode varchar(20),
	specialrequest text,
	
	PRIMARY KEY (orderid, userid, itemcode),
	CONSTRAINT fk_userid_order FOREIGN KEY (userid)
	REFERENCES user(userid)
	ON DELETE CASCADE 
	ON UPDATE CASCADE,
	CONSTRAINT fk_itemcode_order FOREIGN KEY (itemcode)
	REFERENCES iteminventory(itemcode)
	ON DELETE CASCADE 
	ON UPDATE CASCADE
) ENGINE=InnoDB;

create table IF NOT EXISTS standardsize(
	size varchar(10),
	subsize varchar(10),
	bust smallint(3),
	hip smallint(3),
	waist smallint(3)
)

create table IF NOT EXISTS itemcategory(
	categoryid smallint(15) NOT NULL AUTO_INCREMENT,
	categoryname varchar(50),
	PRIMARY KEY (categoryid)
) ENGINE=InnoDB;

create table IF NOT EXISTS itemtocategorymap(
	itemcode int(10)  NOT NULL,
	categoryid smallint(15) NOT NULL,
	PRIMARY KEY (itemcode, categoryid),
	CONSTRAINT fk_itemcode_itemtocategorymap FOREIGN KEY (itemcode)
	REFERENCES iteminventory(itemcode)
	ON DELETE CASCADE 
	ON UPDATE CASCADE,
	CONSTRAINT fk_categoryid_itemtocategorymap FOREIGN KEY (categoryid)
	REFERENCES itemcategory(categoryid)
	ON DELETE CASCADE 
	ON UPDATE CASCADE	
) ENGINE=InnoDB;
