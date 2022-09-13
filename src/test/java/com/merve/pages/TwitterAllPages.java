package com.merve.pages;

import com.merve.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterAllPages {

    public TwitterAllPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@autocomplete='username']")
    public WebElement username;


    @FindBy(xpath = "//input[@autocomplete='current-password']")
    public WebElement password;

    @FindBy(xpath = "//input[@aria-label='Search query']")
    public WebElement searchBox;

    @FindBy(xpath ="//span[text()='poyri']")
    public WebElement clickableSearchResult;

    @FindBy(xpath = "//div[@data-testid='sendDMFromProfile']")
    public WebElement messageBox;

    @FindBy(xpath = "//div[@data-testid='dmComposerTextInput']")
    public WebElement startAMessage;






}
