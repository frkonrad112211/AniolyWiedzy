
CREATE TABLE `guardian` (
  `id` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `guardian_name` varchar(100) COLLATE utf8_polish_ci NOT NULL ,
  `guardian_last_name` varchar(100) COLLATE utf8_polish_ci NOT NULL ,
  `guardian_street` varchar(100) COLLATE utf8_polish_ci DEFAULT NULL,
  `guardian_city` varchar(100) COLLATE utf8_polish_ci DEFAULT NULL,
  `guardian_mobile` varchar(100) COLLATE utf8_polish_ci NOT NULL ,
  `guardian_email` varchar(100) COLLATE utf8_polish_ci DEFAULT NULL,
  `guardian_add_note` varchar(100) COLLATE utf8_polish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;



INSERT INTO `guardian` (`id`, `guardian_name`, `guardian_last_name`, `guardian_street`, `guardian_city`, `guardian_mobile`, `guardian_email`, `guardian_add_note`) VALUES
(1, 'Nadia', 'Furman', 'Tęczowa 8', 'Wrocław', '753159852', 'fruman@gmail.com','Notatka'),
(2, 'Konrad ', 'Fryszkowski', 'Łączności 13/1', 'Wrocław', '+48506129841', 'frkonrad@gmail.com','Notatka2');

