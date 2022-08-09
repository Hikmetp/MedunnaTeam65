package stepdefinitions.uisteps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US001 {
    pages.US001 hp=new pages.US001();

    @When("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String medunna) {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }

    @Then("Kullanici Anasayfada  kullanici ikonu altinda yer alan register butonuna tiklar")
    public void sayfada_kullanici_ikonu_altinda_yer_alan_register_butonuna_tiklar() {
        hp.accountButton.click();
        hp.registerButton.click();
    }

    @When("Kullanici SSN kutucuğuna tıklar")
    public void kullaniciSSNKutucuğunaTıklar() {
        hp.ssnTextBox.click();


    }

    @Then("SSN kutucuğunu  boş bırakır")
    public void ssnKutucuğunuBoşBırakır() {
        hp.firstNameTextBox.click();


    }

    @And("{string} uyarı mesajını görüntüler")
    public void yourSSNIsRequiredUyarıMesajınıGörüntüler() {
        Assert.assertTrue(hp.ssnRequiredMessage.isDisplayed());

    }
}
