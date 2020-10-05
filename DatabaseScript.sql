CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `empresa` varchar(255) DEFAULT NULL,
  `empresa_id` bigint(20) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

INSERT INTO usuario (`id`, `empresa`, `empresa_id`, `nome`, `senha`) VALUES (1, 'SPTrans', 1, 'admin', '$2a$10$ophOvFxBTwhbHsJ51OANTuP2VZRsHrtjR3rbpvXxlYEk7/rNx2M2q');

