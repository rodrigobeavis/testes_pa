Funcionalidade: cadastro usuário

Narrativa:
Para obter a tela inicial apareceça para mim
Como um visitante
Desejo acessar o UNAIDEAS

Cenário: Acesso ao UNAIDEAS

Dado que vou para a tela "cadastro de usuario"
Então será exibido "unaideas"

Cenário: Cadastro de usuario

Dado que vou para a tela "cadastro de usuario"
Quando informo "Rodrigo Pedroza Barcelos" no campo "nome usuario"
Quando informo "MG233311" no campo "RG"
Quando informo "21223111" no campo "RA"
Quando informo "rodrigo@yahoo.com.br" no campo "E-mail"
Quando informo "319999888" no campo "Telefone"
Quando informo "ADS3AN" no campo "Turma"
Quando informo "rodrigo.pedroza" no campo "Login"
Quando informo "rodrigo" no campo "Senha"
Quando informo "rodrigo" no campo "Confirme a senha"

Então será exibido "https://github.com/demoiselle/behave"