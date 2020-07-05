INSERT INTO USER (login) VALUES
  ('Aliko'),
  ('Bill'),
  ('Folrunsho'),
  ('Fabien'),
  ('Adrien'),
  ('Sara'),
  ('Christophe'),
  ('Gregory'),
  ('Paul'),
  ('Gaetan'),
  ('Antoine'),
  ('Stephane'),
  ('David'),
  ('Mathieu'),
  ('Olivier'),
  ('Yoan'),
  ('Stanislas'),
  ('Mohammed'),
  ('Donald'),
  ('Nicolas');

INSERT INTO POST (author_id, message, origin, created_at) VALUES
  (1, 'Hey c est mon premier tweet !', 0, '2020-12-12 21:30:00'),
  (2, 'A moi aussi !', 1, '2020-12-12 21:31:23'),
  (3, 'Pareil pour moi !', 1, '2020-12-12 21:35:03'),
  (4, 'Je n aime pas les pommes', 0, '2020-12-12 21:40:50'),
  (5, 'Je ne suis pas d accord, les fruits c est bon, au moins pour la santé', 4, '2020-12-12 21:42:37'),
  (6, 'Oui mais les kebabs c est mieux', 4, '2020-12-12 21:43:50'),
  (7, 'Qui fais quoi pendant ses vacances', 0, '2020-12-12 21:44:02'),
  (8, 'Moi je pars a Marseille', 7, '2020-12-12 21:46:12'),
  (9, 'Moi, je reste chez moi', 7, '2020-12-12 21:50:58'),
  (10, 'Moi je pars aux Etats Unis', 7, '2020-12-12 21:51:23'),
  (11, 'Moi je vais faire un road trip en Afrique du Sud !', 7, '2020-12-12 21:52:50'),
  (12, 'Et moi je n ai pas d argent', 7, '2020-12-12 21:55:11'),
  (13, '@Nicolas tu penses quoi du parachute', 0, '2020-12-12 21:56:45'),
  (19, 'Je trouve ca dangereux, et j ai le vertige', 13, '2020-12-12 21:57:34'),
  (15, 'Amis du soir bonsoir ! qui est réveillé ?', 0, '2020-12-12 21:59:44'),
  (16, 'Moi!', 15, '2020-12-12 22:01:50'),
  (17, 'Moi!', 15, '2020-12-12 23:40:59'),
  (18, 'Moi!', 15, '2020-12-12 23:45:48'),
  (19, 'Moi!', 15, '2020-12-12 23:50:51'),
  (20, 'Moi!', 15, '2020-12-12 23:54:10'),
  (1, 'Moi!', 15, '2020-12-12 23:55:50'),
  (2, 'Moi!', 15, '2020-12-12 23:57:02'),
  (3, 'Moi!', 15, '2020-12-12 23:56:40'),
  (4, 'Moi!', 15, '2020-12-12 23:58:17'),
  (5, 'Moi!', 15, '2020-12-12 23:59:43'),
  (12, 'Hello World, qui pour m aider en java', 0, '2020-12-13 01:01:01'),
  (11, 'Désolé, faut que je bosse le projet annuel, pas le temps', 26, '2020-12-13 02:02:02'),
  (15, 'Moi je suis trop nul lol', 26, '2020-12-13 04:04:04'),
  (17, 'Tu sais que ya encore le projet de BDD a faire ?', 26, '2020-12-13 04:21:16'),
  (1, 'Bonjour je m appelle Aliko', 0, '2020-12-13 05:34:21'),
  (2, 'Bonjour je m appelle Bill', 0, '2020-12-13 06:06:06'),
  (3, 'Bonjour je m appelle Folrunsho', 0, '2020-12-13 07:07:07'),
  (4, 'Bonjour je m appelle Fabien', 0, '2020-12-13 08:15:15'),
  (5, 'Bonjour je m appelle Adrien', 0, '2020-12-13 08:44:57'),
  (6, 'Bonjour je m appelle Sara', 0, '2020-12-13 08:53:030'),
  (7, 'Bonjour je m appelle Christophe', 0, '2020-12-13 09:07:15'),
  (8, 'Bonjour je m appelle Gregory', 0, '2020-12-13 09:09:09'),
  (9, 'Bonjour je m appelle Paul', 0, '2020-12-13 09:16:17'),
  (10, 'Bonjour je m appelle Gaetan', 0, '2020-12-13 10:45:06'),
  (11, 'Bonjour je m appelle Antoine', 0, '2020-12-14 10:15:17'),
  (12, 'Bonjour je m appelle Stephane', 0, '2020-12-14 11:23:23'),
  (13, 'Bonjour je m appelle David', 0, '2020-12-14 12:12:12'),
  (14, 'Bonjour je m appelle Mathieu', 0, '2020-12-14 13:45:59'),
  (15, 'Bonjour je m appelle Olivier', 0, '2020-12-14 13:50:50'),
  (16, 'Bonjour je m appelle Yoan', 0, '2020-12-14 14:01:01'),
  (17, 'Bonjour je m appelle Stanislas', 0, '2020-12-14 14:12:12'),
  (18, 'Bonjour je m appelle Mohammed', 0, '2020-12-14 15:15:15'),
  (19, 'Bonjour je m appelle Donald', 0, '2020-12-14 16:16:16'),
  (20, 'Bonjour je m appelle Nicolas', 0, '2020-12-14 17:23:54'),
  (16, 'Hello la team ! qui joue a quoi en ce moment', 0, '2020-12-15 09:10:00'),
  (1, 'En ce moment je spam Valorant !', 50, '2020-12-15 09:15:50'),
  (3, 'Moi je rejoue a Overwatch atm', 50, '2020-12-15 09:20:20'),
  (7, 'Skyrim pour moi !', 50, '2020-12-15 09:30:40'),
  (15, 'League of Legends, je suis tombé silver en plus', 50, '2020-12-15 10:05:05'),
  (20, 'Borderlands, un de mes jeux préféré', 50, '2020-12-15 11:11:11'),
  (19, 'Call of duty', 50, '2020-12-15 12:12:12'),
  (18, 'Rayman', 50, '2020-12-15 12:23:23'),
  (9, 'Overcooked', 50, '2020-12-15 12:45:56'),
  (14, 'Burnout', 50, '2020-12-15 14:14:14'),
  (2, 'Plus les jeux de combats pour moi', 50, '2020-12-15 14:30:30'),
  (4, 'Oh moi aussi , Street fighter même !', 60, '2020-12-15 14:45:10'),
  (6, 'Ah plus Tekken moi', 60, '2020-12-15 14:50:50'),
  (13, 'Oh moi aussi Street fighter ! chaud pour du 1v1 ?', 60, '2020-12-15 15:00:00'),
  (12, 'Vazy go !', 63, '2020-12-15 15:10:11'),
  (1, 'Liste de fruits', 0, '2020-12-15 15:15:15'),
  (2, 'Pomme', 65, '2020-12-15 15:19:20'),
  (3, 'Poire', 65, '2020-12-15 15:20:20'),
  (4, 'Banane', 65, '2020-12-15 15:30:37'),
  (5, 'Prune', 65, '2020-12-15 15:35:35'),
  (6, 'Peche', 65, '2020-12-15 15:38:50'),
  (7, 'Framboise', 65, '2020-12-15 15:40:40'),
  (8, 'Fraise', 65, '2020-12-15 15:41:41'),
  (9, 'Pasteque', 65, '2020-12-15 15:42:42'),
  (10, 'Mangue', 65, '2020-12-15 15:50:50'),
  (11, 'Raisin', 65, '2020-12-15 15:51:43'),
  (12, 'Orange', 65, '2020-12-15 15:52:52'),
  (13, 'Kiwi', 65, '2020-12-15 15:55:55'),
  (14, 'Melon', 65, '2020-12-15 15:56:56'),
  (15, 'Grenade', 65, '2020-12-15 15:57:13'),
  (16, 'Papaye', 65, '2020-12-15 16:01:23'),
  (17, 'Abricot', 65, '2020-12-15 16:12:05'),
  (18, 'Citron', 65, '2020-12-15 16:13:13'),
  (19, 'Mandarine', 65,'2020-12-15 16:14:56'),
  (20, 'Figue', 65, '2020-12-15 17:00:45'),
  (20, 'Liste de Legumes', 0, '2020-12-16 03:03:03'),
  (19, 'Tomate', 85, '2020-12-16 04:04:04'),
  (18, 'Oignon', 85, '2020-12-16 05:05:05'),
  (17, 'Radis', 85, '2020-12-16 06:06:06'),
  (16, 'Betterave', 85, '2020-12-16 07:07:07'),
  (15, 'Aubergine', 85, '2020-12-16 08:08:08'),
  (14, 'Artichaut', 85, '2020-12-16 09:09:09'),
  (13, 'Laitue', 85, '2020-12-16 10:10:10'),
  (12, 'Patate', 85, '2020-12-16 11:11:11'),
  (11, 'Carotte', 85, '2020-12-16 12:12:12'),
  (10, 'Maïs', 85, '2020-12-16 13:13:13'),
  (9, 'Poivron', 85, '2020-12-16 14:14:14'),
  (8, 'Brocolis', 85, '2020-12-16 15:15:15'),
  (7, 'Epinard', 85, '2020-12-16 16:16:16'),
  (6, 'Chou Fleur', 85, '2020-12-16 17:17:17'),
  (5, 'Courgette', 85, '2020-12-16 18:18:018');


INSERT INTO FOLLOW (who_am_i, follow_id) VALUES
  (1,2),
  (3,4),
  (4,5),
  (5,6),
  (6,7),
  (7,8),
  (8,9),
  (9,10),
  (10,20),
  (19,11),
  (18,12),
  (16,14),
  (15,1),
  (18,2),
  (17,1);

