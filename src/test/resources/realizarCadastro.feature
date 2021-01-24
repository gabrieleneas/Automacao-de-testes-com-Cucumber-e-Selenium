# language: pt

  Funcionalidade: Validar flixo de cadastro no site

      @web @ct001
      Cenario: Realizar Cadastro
      Dado que estou na pagina inicial do site
      E clico no botão "SignIn"
      E insiro no campo "Email Adress" o valor "gabreuzinho@2334.com"
      E clico no botão "Create an Account"
      E insiro no campo "First name" o valor "gabreuzinho"
      E insiro no campo "Last name" o valor "aaaaa"
      E insiro no campo "Password" o valor "12345"
      E insiro no campo "Adress" o valor "Algum lugar"
      E insiro no campo "City" o valor "Alguma Cidade"
      E seleciono a opção "Kansas" no campo "State"
      E insiro no campo "Zip/Postal Code" o valor "00000"
      E seleciona a opção "United States" no campo "Country"
      E insiro no campo "Mobile phone" o valor "11111111"
      E insiro no campo "Assign an address alias for future reference" o valor "gabriel"
      Quando clico no botão "Register"
      Então vizualizo a pagina "My Account"
