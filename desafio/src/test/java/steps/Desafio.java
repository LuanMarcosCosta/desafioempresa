package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import static Runer.RunCucumberTest.driver;

public class Desafio {

    @Dado("^que estou no site desafio$")
    public void que_estou_no_site_desafio()  {
        driver.manage().window().maximize();
        driver.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");

    }

    @Quando("^altero o temaversion do bootstrap$")
    public void altero_o_temaversion_do_bootstrap()  {

        {
            WebElement dropdown = driver.findElement(By.id("switch-version-select"));
            dropdown.findElement(By.xpath("//option[. = 'Bootstrap V4 Theme']")).click();
        }
    }

    @Quando("^clico no botão Add Costumer$")
    public void clico_no_botão_Add_Costumer()  {

        driver.findElement(By.linkText("Add Customer")).click();
    }

    @Entao("^abre um formulario de cadastro$")
    public void abre_um_formulario_de_cadastro()  {
    }

    @Dado("^que estou no fornmulario$")
    public void que_estou_no_fornmulario() {

    }

    @Quando("^Preencho campo Name$")
    public void preencho_campo_Name()  {
        driver.findElement(By.id("field-customerName")).click();
        driver.findElement(By.id("field-customerName")).sendKeys("Teste empresa");
    }

    @Quando("^Preencho campo Last Name$")
    public void preencho_campo_Last_Name()  {
        driver.findElement(By.id("field-contactLastName")).click();
        driver.findElement(By.id("field-contactLastName")).sendKeys("Teste");
    }

    @Quando("^Preencho campo Phone$")
    public void preencho_campo_Phone() {
        driver.findElement(By.id("field-phone")).click();
        driver.findElement(By.id("field-phone")).sendKeys("51 9999-9999");
    }

    @Quando("^Preencho campo AdressLine(\\d+)$")
    public void preencho_campo_AdressLine(int arg1)  {
        driver.findElement(By.id("field-addressLine1")).click();
        driver.findElement(By.id("field-addressLine1")).sendKeys("Av Assis Brasil, 3970");
    }

    @Quando("^Preencho campo City$")
    public void preencho_campo_City()  {
        driver.findElement(By.id("field-city")).click();
        driver.findElement(By.id("field-city")).sendKeys(" Porto Alegre");
    }

    @Quando("^Preencho campo Sate$")
    public void preencho_campo_Sate() {
        driver.findElement(By.id("field-state")).click();
        driver.findElement(By.id("field-state")).sendKeys("RS");
    }

    @Quando("^Preencho campo Postal Code$")
    public void preencho_campo_Postal_Code()  {
        driver.findElement(By.id("field-postalCode")).click();
        driver.findElement(By.id("field-postalCode")).sendKeys("91000-000");
    }

    @Quando("^Preencho campo Country$")
    public void preencho_campo_Country(){
        driver.findElement(By.id("field-country")).click();
        driver.findElement(By.id("field-country")).sendKeys("Brasil");
    }

    @Quando("^Selciono uma opcao no select From Employeer$")
    public void selciono_uma_opcao_no_select_From_Employeer() {

        driver.findElement(By.cssSelector("span")).click();
        driver.findElement(By.cssSelector(".chosen-search > input")).sendKeys("fixter");
        driver.findElement(By.cssSelector(".chosen-search > input")).sendKeys(Keys.ENTER);

    }

    @Quando("^Preencho campo CredtLimit$")
    public void preencho_campo_CredtLimit() throws Throwable {
        driver.findElement(By.id("field-creditLimit")).click();
        driver.findElement(By.id("field-creditLimit")).sendKeys("200");
    }

    @Quando("^clico no botao Save$")
    public void clico_no_botao_Save()  {
        driver.findElement(By.id("form-button-save")).click();
    }

    @Entao("^valido a mensagem “Your data has been successfully stored into the database\\. Edit Customer or Go back to list$")
    public void valido_a_mensagem_Your_data_has_been_successfully_stored_into_the_database_Edit_Customer_or_Go_back_to_list() {
        Assert.assertEquals(
                "Validação da mensagem da salvo com sucesso",
                "Your data has been successfully stored into the database. Edit Customer or Go back to list",
                  "Your data has been successfully stored into the database. Edit Customer or Go back to list");
        driver.quit();
    }

}
