
/* Drop Tables */

DROP TABLE IF EXISTS order_details;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS shopping_carts;
DROP TABLE IF EXISTS accounts;
DROP TABLE IF EXISTS item_images;
DROP TABLE IF EXISTS item_price;
DROP TABLE IF EXISTS item_stocks;
DROP TABLE IF EXISTS items;
DROP TABLE IF EXISTS item_categories;
DROP TABLE IF EXISTS stockbases;




/* Create Tables */

CREATE TABLE accounts
(
	id bigserial NOT NULL,
	password text NOT NULL,
	name text NOT NULL,
	phone_number text NOT NULL,
	zip_code text NOT NULL,
	address text NOT NULL,
	mail text NOT NULL,
	created_at timestamp,
	updated_at timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE items
(
	id bigserial NOT NULL,
	category_id bigint NOT NULL,
	name text NOT NULL,
	description text,
	sale_start timestamp,
	sale_end timestamp,
	created_at timestamp,
	updated_at timestamp with time zone,
	id_deleted boolean NOT NULL,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE item_categories
(
	id bigserial NOT NULL,
	parent_category_id bigint,
	category_depth bigint NOT NULL,
	name text NOT NULL,
	created_at timestamp,
	updated_at timestamp,
	id_deleted boolean NOT NULL,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE item_images
(
	id bigint NOT NULL,
	image_order bigint NOT NULL,
	id_deleted boolean NOT NULL,
	created_at timestamp,
	updated_at timestamp with time zone,
	PRIMARY KEY (id, image_order)
) WITHOUT OIDS;


CREATE TABLE item_price
(
	id bigserial NOT NULL,
	item_id bigint NOT NULL,
	price bigint NOT NULL,
	include_tax bigint NOT NULL,
	created_at timestamp,
	updated_at timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE item_stocks
(
	item_id bigint NOT NULL,
	stockbase_id bigint NOT NULL,
	stock_count bigint NOT NULL,
	created_at timestamp,
	updated_at timestamp,
	PRIMARY KEY (item_id, stockbase_id)
) WITHOUT OIDS;


CREATE TABLE orders
(
	id bigserial NOT NULL,
	account_id bigint NOT NULL,
	total bigint NOT NULL,
	-- 送料とかを含めないやつ
	sub_total bigint NOT NULL,
	created_at timestamp,
	updated_at timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE order_details
(
	id bigserial NOT NULL,
	order_id bigint NOT NULL,
	item_id bigint NOT NULL,
	quantity bigint NOT NULL,
	created_at timestamp,
	updated_at timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE shopping_carts
(
	id bigint NOT NULL,
	account_id bigint NOT NULL,
	item_id bigint NOT NULL,
	quentity bigint NOT NULL,
	sub_total bigint NOT NULL,
	created_at timestamp,
	updated_at timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;


CREATE TABLE stockbases
(
	id bigserial NOT NULL,
	name text NOT NULL,
	created_at timestamp,
	updated_at timestamp,
	PRIMARY KEY (id)
) WITHOUT OIDS;



/* Create Foreign Keys */

ALTER TABLE orders
	ADD FOREIGN KEY (account_id)
	REFERENCES accounts (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE shopping_carts
	ADD FOREIGN KEY (account_id)
	REFERENCES accounts (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE item_images
	ADD FOREIGN KEY (id)
	REFERENCES items (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE item_price
	ADD FOREIGN KEY (item_id)
	REFERENCES items (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE item_stocks
	ADD FOREIGN KEY (item_id)
	REFERENCES items (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE order_details
	ADD FOREIGN KEY (item_id)
	REFERENCES items (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE shopping_carts
	ADD FOREIGN KEY (item_id)
	REFERENCES items (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE items
	ADD FOREIGN KEY (category_id)
	REFERENCES item_categories (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE order_details
	ADD FOREIGN KEY (order_id)
	REFERENCES orders (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE item_stocks
	ADD FOREIGN KEY (stockbase_id)
	REFERENCES stockbases (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



/* Comments */

COMMENT ON COLUMN orders.sub_total IS '送料とかを含めないやつ';

