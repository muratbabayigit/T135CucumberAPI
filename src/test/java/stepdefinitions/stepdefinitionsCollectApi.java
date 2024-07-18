package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class stepdefinitionsCollectApi {

    String endpoint;
    Response response;
    @Given("kullanici collectApi adresine gider")
    public void kullaniciCollectApiAdresineGider() {
        endpoint="https://api.collectapi.com/";
    }
    @Then("kullanici path parametresi icin {string} degerlerini girer")
    public void kullanici_path_parametresi_icin_degerlerini_girer(String pathparams) {
        endpoint=endpoint+"/"+pathparams;
    }
    @Then("kullanici query parametresi olarak key degerine {string} value degerine {string} girer")
    public void kullanici_query_parametresi_olarak_key_degerine_value_degerine_girer(String key, String value) {
        ;        endpoint=endpoint+"?"+key+"="+value;
    }
    @Then("kullanici donen respnse degerini kaydeder")
    public void kullanici_donen_respnse_degerini_kaydeder() {
        response=given().when().header("Authorization","apikey 5ce8BgifHKqNjeo1RV9n5D:3xqG2GwaHpvFx8KAhRTBvo").get(endpoint);
    }
    @Then("kullanici donden response deerini yazdiri")
    public void kullanici_donden_response_deerini_yazdiri() {
        response.prettyPrint();
    }

    @Then("kullanici query parametresi olarak key degerine {string} value degerine {int} girer {string} degerine {string} girer")
    public void kullaniciQueryParametresiOlarakKeyDegerineValueDegerineGirerDegerineGirer(String miktar, int miktarvalue, String doviz, String dovizValue) {
        endpoint=endpoint+"?"+miktar+"="+miktarvalue+"&"+doviz+"="+dovizValue;
    }
}
