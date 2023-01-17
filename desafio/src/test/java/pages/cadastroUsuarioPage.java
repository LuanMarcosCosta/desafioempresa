package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static runner.RunBase.getdriver;
import static support.Utils.clickElement;

public class cadastroUsuarioPage {

    private By vSelecionaVersao = By.id("switch-version-select");
    private By vSelecionaVersao4 = By.xpath("//option[. = 'Bootstrap V4 Theme']");

    private By vAdicionaUsuario = By.linkText("Add Customer");
    private By vCampoNome = By.id("field-customerName");
    private By vCampoSobrenome = By.id("field-contactLastName");
    private By vTelefone = By.id("field-phone");
    private By vEndereco = By.id("field-addressLine1");
    private By vCidade = By.id("field-city");
    private By vEstado = By.id("field-state");
    private By caixaPostal = By.id("field-postalCode");
    private By Pais = By.id("field-country");
    private By employer = By.cssSelector("span");
    private By vLimiteCredito = By.id("field-creditLimit");
    private By vBotaoSalvar = By.id("form-button-save");


    public void abrirSite(){
        getdriver().manage().window().maximize();
        getdriver().get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");
    }

    public void trocaVersaoBootstrap(){
        WebElement dropdown = (WebElement) vSelecionaVersao;
        clickElement(vSelecionaVersao4);
    }

    public void cadastroUsuario(){

    }
}
