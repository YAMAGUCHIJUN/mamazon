-- Table: public.accounts

-- DROP TABLE public.accounts;

CREATE TABLE public.accounts
(
  id bigint NOT NULL DEFAULT nextval('accounts_id_seq'::regclass),
  password text,
  name text,
  phone_number text,
  zip_code text,
  address text,
  mail text,
  created_at text,
  updated_at text,
  CONSTRAINT accounts_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.accounts
  OWNER TO postgres;
