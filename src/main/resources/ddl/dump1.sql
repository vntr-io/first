--
-- PostgreSQL database dump
--

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: friendships; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE friendships (
    user_id_1 integer NOT NULL,
    user_id_2 integer NOT NULL
);


ALTER TABLE friendships OWNER TO postgres;

--
-- Name: groups_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE groups_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE groups_id_seq OWNER TO postgres;

CREATE TABLE groups (
    id integer DEFAULT nextval('groups_id_seq'::regclass) NOT NULL,
    name character varying(63) NOT NULL,
    description character varying(255) NOT NULL,
    manager_id integer
);


ALTER TABLE groups OWNER TO postgres;

--
-- Name: memberships; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE memberships (
    user_id integer NOT NULL,
    group_id integer NOT NULL
);


ALTER TABLE memberships OWNER TO postgres;

--
-- Name: users_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE users_id_seq OWNER TO postgres;

--
-- Name: users; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE users (
    id integer DEFAULT nextval('users_id_seq'::regclass) NOT NULL,
    username character varying(63) NOT NULL,
    password character varying(31) NOT NULL,
    email character varying(255) NOT NULL
);


ALTER TABLE users OWNER TO postgres;

--
-- Name: vents_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE vents_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE vents_id_seq OWNER TO postgres;

--
-- Name: vents; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE vents (
    id integer DEFAULT nextval('vents_id_seq'::regclass) NOT NULL,
    user_id integer,
    text character varying(255) NOT NULL,
    zeit timestamp without time zone NOT NULL
);


ALTER TABLE vents OWNER TO postgres;

--
-- Data for Name: friendships; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY friendships (user_id_1, user_id_2) FROM stdin;
\.


--
-- Name: groups_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('groups_id_seq', 1, false);


--
-- Data for Name: groups; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY groups (id, name, description, manager_id) FROM stdin;
\.


--
-- Data for Name: memberships; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY memberships (user_id, group_id) FROM stdin;
\.


--
-- Name: users_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('users_id_seq', 1, false);


--
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY users (id, username, password, email) FROM stdin;
\.


--
-- Name: vents_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('vents_id_seq', 1, false);


--
-- Data for Name: vents; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY vents (id, user_id, text, zeit) FROM stdin;
\.


--
-- Name: friendships_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY friendships
    ADD CONSTRAINT friendships_pkey PRIMARY KEY (user_id_1, user_id_2);


--
-- Name: groups_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY groups
    ADD CONSTRAINT groups_pkey PRIMARY KEY (id);


--
-- Name: users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- Name: vents_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY vents
    ADD CONSTRAINT vents_pkey PRIMARY KEY (id);


--
-- Name: friendships_user_id_1_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY friendships
    ADD CONSTRAINT friendships_user_id_1_fkey FOREIGN KEY (user_id_1) REFERENCES users(id);


--
-- Name: friendships_user_id_2_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY friendships
    ADD CONSTRAINT friendships_user_id_2_fkey FOREIGN KEY (user_id_2) REFERENCES users(id);


--
-- Name: memberships_group_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY memberships
    ADD CONSTRAINT memberships_group_id_fkey FOREIGN KEY (group_id) REFERENCES groups(id);


--
-- Name: memberships_user_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY memberships
    ADD CONSTRAINT memberships_user_id_fkey FOREIGN KEY (user_id) REFERENCES users(id);


--
-- Name: vents_user_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY vents
    ADD CONSTRAINT vents_user_id_fkey FOREIGN KEY (user_id) REFERENCES users(id);


--
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- Name: friendships; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE friendships FROM PUBLIC;
REVOKE ALL ON TABLE friendships FROM postgres;
GRANT ALL ON TABLE friendships TO postgres;
GRANT ALL ON TABLE friendships TO vntr_admin;


--
-- Name: groups; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE groups FROM PUBLIC;
REVOKE ALL ON TABLE groups FROM postgres;
GRANT ALL ON TABLE groups TO postgres;
GRANT ALL ON TABLE groups TO vntr_admin;


--
-- Name: users; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE users FROM PUBLIC;
REVOKE ALL ON TABLE users FROM postgres;
GRANT ALL ON TABLE users TO postgres;
GRANT ALL ON TABLE users TO vntr_admin;


--
-- Name: vents; Type: ACL; Schema: public; Owner: postgres
--

REVOKE ALL ON TABLE vents FROM PUBLIC;
REVOKE ALL ON TABLE vents FROM postgres;
GRANT ALL ON TABLE vents TO postgres;
GRANT ALL ON TABLE vents TO vntr_admin;


--
-- PostgreSQL database dump complete
--

