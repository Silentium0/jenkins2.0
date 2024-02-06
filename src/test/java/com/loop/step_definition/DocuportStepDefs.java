package com.loop.step_definition;

import com.loop.page.DocuportLogin;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.util.List;
import java.util.Map;


public class DocuportStepDefs {
    DocuportLogin docuportLogin = new DocuportLogin();


    @Given("validate left navigate items of docuport for 3 user")
    public void validate_left_navigate_items_of_docuport_for_user(Map<String, List<String>> mapList) {
        for (Map.Entry<String, List<String>> entry : mapList.entrySet()) {
            docuportLogin.login(entry.getKey());

            List<String> expectedValues = entry.getValue();
            List<String> actualValues = docuportLogin.listElements();

            if (expectedValues.get(actualValues.size() - 1) == null) {
                actualValues.add(null);
                Assert.assertEquals(expectedValues, actualValues);
            }
            docuportLogin.logOut();
        }
    }
}















