#language: pt

  Funcionalidade: Acessar o site para mudar o Tema
    Eu como usuario
    quero alterar o tema do site
    Para clicar em adicionar um novo cliente

  Cenario: Trocar tema Booststrap
    Dado que estou no site desafio
    Quando altero o temaversion do bootstrap
    E clico no botão Add Costumer
    Entao abre um formulario de cadastro

  Cenario: Cadastro de Cliente
    Dado que estou no fornmulario
    Quando Preencho campo Name
    E Preencho campo Last Name
    E Preencho campo Phone
    E Preencho campo AdressLine1
    E Preencho campo AdressLine2
    E Preencho campo City
    E Preencho campo Sate
    E Preencho campo Postal Code
    E Preencho campo Country
    E Selciono uma opcao no select From Employeer
    E Preencho campo CredtLimit
    E clico no botao Save
    Entao valido a mensagem “Your data has been successfully stored into the database. Edit Customer or Go back to list


