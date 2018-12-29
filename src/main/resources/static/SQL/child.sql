

CREATE TABLE `child` (
  `id` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `child_name` varchar(100) COLLATE utf8_polish_ci NOT NULL,
  `child_last_name` varchar(100) COLLATE utf8_polish_ci NOT NULL,
  `child_birth_date` DATE NOT NULL,
  `child_street` varchar(100) COLLATE utf8_polish_ci NOT NULL ,
  `child_city` varchar(100) COLLATE utf8_polish_ci NOT NULL,
  `child_mobile` varchar(100) COLLATE utf8_polish_ci NOT NULL,
  `child_help` varchar(2000) COLLATE utf8_polish_ci NOT NULL,
  `child_school` varchar(100) COLLATE utf8_polish_ci DEFAULT NULL,
  `child_hobbies` varchar(2000) COLLATE utf8_polish_ci DEFAULT NULL,
  `child_possibilities` varchar(2000) COLLATE utf8_polish_ci DEFAULT NULL,
  `child_add_note` varchar(2000) COLLATE utf8_polish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;

--
-- Dumping data for table `child`
--

INSERT INTO `child` (`id`, `child_name`, `child_last_name`, `child_birth_date`, `child_street`, `child_city`, `child_mobile`, `child_help`, `child_school`, `child_hobbies`, `child_possibilities`, `child_add_note`) VALUES
(1, 'Bartek', 'Wojkowski', '1999-10-01', 'Legnicka 10', 'Wrocław', '500400214', 'Matematyka i fizyka', '2 gimnazjum', 'piłka nożna', 'Dodatkowe zajęcia sportowe', 'dodatkowa notatka'),
(2, 'Adrian', 'Kosowski', '1996-12-11', 'Kolorowa 2', 'Wrocław', '484345864', 'Geografia', '1 podstawówki', 'gitara', 'Dodatkowe zajęcia sportowe', 'dodatkowa notatka'),
(3, 'Sylwia', 'Duda', '1992-11-07', 'Hallera 10', 'Wrocław', '789852159', 'WF', '1 LO', 'Perkusja', 'Zajęcia z kapelą', 'dodatkowa notatka');

