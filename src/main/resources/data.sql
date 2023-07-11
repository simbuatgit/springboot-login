CREATE TABLE IF NOT EXISTS login_user (
  id INT AUTO_INCREMENT,
  name VARCHAR(100),
  password VARCHAR(100),
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS login_user1 (
  id INT AUTO_INCREMENT,
  name VARCHAR(100),
  password VARCHAR(100),
  PRIMARY KEY (id)
);


INSERT INTO login_user (name, password) VALUES ('simbu', 'sethu');
COMMIT;