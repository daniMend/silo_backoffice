CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `empresa` varchar(255) DEFAULT NULL,
  `empresa_id` bigint(20) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;


INSERT INTO empresa (`id`, `empresa_nome`) values (1, 'SPTrans');
INSERT INTO empresa (`id`, `empresa_nome`) values (2, 'ViaSul');
INSERT INTO empresa (`id`, `empresa_nome`) values (3, 'MoveBus');
INSERT INTO empresa (`id`, `empresa_nome`) values (4, 'TransUniao');

INSERT INTO usuario (`id`, `nome`, `senha`, `empresa_id`) VALUES (1, 'admin', '$2a$10$ophOvFxBTwhbHsJ51OANTuP2VZRsHrtjR3rbpvXxlYEk7/rNx2M2q', 1);
