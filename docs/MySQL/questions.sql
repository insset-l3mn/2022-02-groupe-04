CREATE TABLE `questions` (
  `idQuestions` int NOT NULL,
  `Questions` varchar(45) NOT NULL,
  `Reponse1` varchar(45) NOT NULL,
  `Reponse2` varchar(45) NOT NULL,
  `Reponse3` varchar(45) NOT NULL,
  `Reponse4` varchar(45) NOT NULL,
  `Theme` varchar(45) NOT NULL,
  PRIMARY KEY (`idQuestions`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci