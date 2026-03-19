# Sistema de Gerenciamento de Estoque e Patrimônio - SENAI-SP

## Levantamento de Requisitos

#### Requisitos Funcionais (RF)
- RF01: O sistema deve permitir o login apenas de funcionários com NIF cadastrado e ativo.
- RF02: O sistema deve permitir o cadastro, edição e exclusão de materiais (estoque).
- RF03: O sistema deve registrar entradas e saídas de materiais, atualizando a quantidade em estoque automaticamente.

- RF04: O sistema deve permitir o controle de ativos patrimoniais (itens com número de série/etiqueta).

### Requisitos Não-Funcionais (RNF)
- RNF01: A interface deve seguir a identidade visual do SENAI.
- RNF02: As senhas dos funcionários devem ser armazenadas de forma segura.
- RNF03: O sistema deve ser responsivo (compatível com diferentes tamanhos de tela).

## Lista de Materiais e Ativos
- O sistema está preparado para gerenciar os seguintes itens baseados nas necessidades das oficinas e laboratórios:

### Materiais de Consumo (Estoque)
- Componentes Eletrônicos: Resistores, capacitores, protoboards, fios e solda.
- Mecânica/Manutenção: Parafusos, porcas, graxa, fluidos de corte e estopas.
- Informática: Cabos de rede (patch cords), conectores RJ45, toners de impressora e mouses.
- Escritório: Papel A4, canetas, pastas suspensas e grampos.

### Ativos Patrimoniais (Ativos Fixos)
- Maquinário: Tornos mecânicos, fresadoras, impressoras 3D e braços robóticos.
- Equipamentos de TI: Computadores (Desktops), Laptops, Monitores, Roteadores e Servidores.
- Mobiliário: Bancadas de laboratório, cadeiras ergonômicas e armários de aço.
- Ferramentas de Precisão: Multímetros digitais, osciloscópios e paquímetros.

### Dados Registrados por Item
- Para cada ativo patrimonial, o sistema registra:
    - Nome e Descrição: Identificação do item.
    - Categoria: Classificação do material.
    - Número de Patrimônio: Identificação física exclusiva da unidade
    - Localização: Sala ou laboratório onde o bem se encontra
    - Quantidade: Saldo atual disponível.