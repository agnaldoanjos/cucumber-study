package net.home;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"net.home"},
        features = "src/test/resources/features",
        monochrome = false,
        plugin = {"pretty", "html:target/report-html.html", "json:target/report-json.json"},
        tags = "@All"

)
@CucumberContextConfiguration
@SpringBootTest(classes = SpringDemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CucumberIntegrationTest {

}