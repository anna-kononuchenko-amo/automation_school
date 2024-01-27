package lesson10_testNG;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CheckGoogleTranslationTest {

    @Test(dataProvider = "language")
    public void translateResult(String language, String expectedTranslate) {
       Selenide.open("https://translate.google.com/?sl=uk&tl=" + language + "&op=translate");
        Selenide.$("a[aria-label='Turn off Input Method']").shouldBe(Condition.visible).click();
        Selenide.$("textarea").setValue("Я круто вивчу TestNG");
        Selenide.$("jsname='W297wb'").shouldBe();
        Assert.assertEquals(Selenide.$("span.ryNqvb").getText(), expectedTranslate);
    }

    @DataProvider(name = "language", parallel = true)
    public Object[][] language(){
        return new Object[][]{
                {"en", "I will study TESTNG cool"},
                {"es", "Estudiaré testng genial"},
                {"it", "Studierò Testng Cool"},
                {"de", "Ich werde testng cool studieren"},
                {"fr", "J'étudierai le test."},
                {"pl", "Badam testng fajny"},
                {"pt", "Vou estudar testng legal"},
                {"tr", "Testng serin çalışacağım"},
                {"id", "Saya akan belajar testng keren"},
                {"da", "Jeg vil studere testng cool"},
                {"ka", "ტესტს ვსწავლობ მაგარი"},
                {"et", "Uurin testi jahedat"},
                {"fi", "Opiskelen testiä viileänä"},
                {"ja", "テストをクールに勉強します"},
                {"zh-CN", "我将研究测试凉爽"},
                {"zh-TW", "我將研究測試涼爽"},
                {"ko", "나는 테스트를 시원하게 공부할 것이다"},
                {"th", "ฉันจะศึกษา testng เย็น"},
                {"vi", "Tôi sẽ học Testng Cool"},
                {"mk", "Ќе учам тест кул"}
        };
    }
}
