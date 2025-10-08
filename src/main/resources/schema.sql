DROP TABLE IF EXISTS movie;

CREATE TABLE movie (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       title VARCHAR(255),
                       original_title VARCHAR(255),
                       overview CLOB,
                       release_date DATE,
                       budget BIGINT,
                       revenue BIGINT,
                       runtime DOUBLE,
                       status VARCHAR(100),
                       tagline VARCHAR(500),
                       popularity DOUBLE,
                       vote_average DOUBLE,
                       vote_count DOUBLE,
                       genres VARCHAR(500),
                       production_companies VARCHAR(500),
                       production_countries VARCHAR(500),
                       spoken_languages VARCHAR(500),
                       homepage VARCHAR(500),
                       movie_id BIGINT,
                       original_language VARCHAR(50),
                       keywords VARCHAR(500),
                       movie_cast VARCHAR(1000),
                       crew VARCHAR(1000),
                       director VARCHAR(255)
);
