package net.atos.lroux.jhipster.exemple1.cucumber.stepdefs;

import net.atos.lroux.jhipster.exemple1.JhipsterApplicationExemple1App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterApplicationExemple1App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
