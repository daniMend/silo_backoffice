SELECT * FROM silo.empresa;
SELECT * FROM silo.usuario;
SELECT * FROM silo.veiculo;
SELECT * FROM silo.equipamento;

SELECT * FROM silo.equipamento where empresa_id = 2;

INSERT INTO empresa (`id`, `empresa_nome`) values (1, 'SPTrans');
INSERT INTO empresa (`id`, `empresa_nome`) values (2, 'ViaSul');
INSERT INTO empresa (`id`, `empresa_nome`) values (3, 'MoveBus');
INSERT INTO empresa (`id`, `empresa_nome`) values (4, 'TransUniao');

INSERT INTO usuario (`id`, `nome`, `senha`, `empresa_id`) VALUES (1, 'admin', '$2a$10$ophOvFxBTwhbHsJ51OANTuP2VZRsHrtjR3rbpvXxlYEk7/rNx2M2q', 1);
INSERT INTO usuario (`id`, `nome`, `senha`, `empresa_id`) VALUES (2, 'Daniel', '$2a$10$ihnFzCw5ogB8hnK4BswLSe2xwgxvL1V4vgPQGXT1huUu0U3UbB/ry', 2);
INSERT INTO usuario (`id`, `nome`, `senha`, `empresa_id`) VALUES (3, 'Danielle', '$2a$10$z3bQCCf5fQsAs3bvGBMhw.WHMdUJb/ozCGuG5UmsYKrVIJS.FpV.m', 3);
INSERT INTO usuario (`id`, `nome`, `senha`, `empresa_id`) VALUES (4, 'Edgar', '$2a$10$upJGbCK6520NJYLjoHlln.qOB/u/Xx3nJxo3lworf1H8k7s1/9JTm', 4);

INSERT INTO equipamento (`id`,`cod_equipamento`,`descricao_equipamento`,`status_equipamento`,`empresa_id`) VALUES (1,'SN11111111','Contador 01', 'INATIVO', 2);
INSERT INTO equipamento (`id`,`cod_equipamento`,`descricao_equipamento`,`status_equipamento`,`empresa_id`) VALUES (2,'SN22222222','Contador 02', 'INATIVO', 2);
INSERT INTO equipamento (`id`,`cod_equipamento`,`descricao_equipamento`,`status_equipamento`,`empresa_id`) VALUES (3,'SN33333333','Contador 02', 'INATIVO', 2);
INSERT INTO equipamento (`id`,`cod_equipamento`,`descricao_equipamento`,`status_equipamento`,`empresa_id`) VALUES (4,'SN44444444','Contador 04', 'INATIVO', 3);
INSERT INTO equipamento (`id`,`cod_equipamento`,`descricao_equipamento`,`status_equipamento`,`empresa_id`) VALUES (5,'SN55555555','Contador 05', 'INATIVO', 3);

INSERT INTO historico (`id`, `datahora`, `veiculo_id`, `qtd_passageiros`, `status`) VALUES(1, '20/10/2020 - 18:42', 1, 34, 'Lotação Média');
INSERT INTO historico (`id`, `datahora`, `veiculo_id`, `qtd_passageiros`, `status`) VALUES(2, '20/10/2020 - 18:55', 1, 23, 'Lotação Baixa');
INSERT INTO historico (`id`, `datahora`, `veiculo_id`, `qtd_passageiros`, `status`) VALUES(3, '26/10/2020 - 14:25', 1, 12, 'Lotação Baixa');
INSERT INTO historico (`id`, `datahora`, `veiculo_id`, `qtd_passageiros`, `status`) VALUES(4, '20/10/2020 - 12:42', 2, 34, 'Lotação Média');
INSERT INTO historico (`id`, `datahora`, `veiculo_id`, `qtd_passageiros`, `status`) VALUES(5, '20/10/2020 - 13:55', 2, 23, 'Lotação Baixa');
INSERT INTO historico (`id`, `datahora`, `veiculo_id`, `qtd_passageiros`, `status`) VALUES(6, '26/10/2020 - 14:25', 2, 12, 'Lotação Baixa');