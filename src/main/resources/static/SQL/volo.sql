
CREATE TABLE `volo` (
  `id` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `volo_name` varchar(100) COLLATE utf8_polish_ci NOT NULL,
  `volo_last_name` varchar(100) COLLATE utf8_polish_ci NOT NULL,
  `volo_role` varchar(100) COLLATE utf8_polish_ci NOT NULL,
  `volo_come_date` DATE  NOT NULL,
  `volo_birth_date` DATE NOT NULL,
  `volo_street` varchar(100) COLLATE utf8_polish_ci NOT NULL,
  `volo_city` varchar(100) COLLATE utf8_polish_ci NOT NULL,
  `volo_mobile` varchar(100) COLLATE utf8_polish_ci NOT NULL,
  `volo_email` varchar(100) COLLATE utf8_polish_ci ,
  `volo_can_help_with` varchar(100) COLLATE utf8_polish_ci ,
  `volo_add_note` varchar(100) COLLATE utf8_polish_ci ,
  `volo_status` varchar(100) COLLATE utf8_polish_ci NOT NULL,
  `volo_neighbourhood` varchar(100) COLLATE utf8_polish_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;

--
-- Insert into volo `volo`:
--

INSERT INTO `volo` (`id`, `volo_name`, `volo_last_name`, `volo_role`, `volo_come_date`, `volo_birth_date`, `volo_street`, `volo_city`, `volo_mobile`, `volo_email`, `volo_can_help_with`, `volo_add_note`, `volo_status`, `volo_neighbourhood`) VALUES
(1, 'Jakub', 'Urbanek', 'Wolontariusz', '2018-06-12', '1995-06-12', 'Legnicka 56', 'Wrocław', '500400300', 'urbanek@gmail.com', 'Matematyka - liceum', 'Ogarnięty chłopak', 'Koordynator', 'Magnolia'),
(2, 'Ivan', 'Chepurin', 'Koordynator', '2018-01-10', '1990-06-12', 'Śliczna 1', 'Wrocław', '300200100', 'chepurin@gmail.com', 'Geografia - podstawwka', 'Bardzo pomocny', 'Wolontariusz', 'Krzyki');


