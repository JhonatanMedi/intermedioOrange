package Orange.Pages;

import Orange.Steps.ButtonPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

    @FindBy(how = How.ID, using = "systemUser_employeeName_empName")
    private WebElement txtEmployeeName;

    @FindBy(how = How.ID, using = "systemUser_userName")
    private WebElement txtUserName;

    @FindBy(how = How.ID, using = "systemUser_password")
    private WebElement txtPassword;

    @FindBy(how = How.ID, using = "systemUser_confirmPassword")
    private WebElement txtConfirmPassword;

    private ButtonPages buttonPages;

    public AdminPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
    }

    public void llegarAddUser() {
        buttonPages.btnAdmin();
        buttonPages.btnAdd();
    }

    public void dilligenciarAddUser(String useRole,String employeeName, String userName, String password, String confirmPassword) {
        buttonPages.btnlistUse(useRole);
        txtEmployeeName.sendKeys(employeeName);
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
        txtConfirmPassword.sendKeys(confirmPassword);
    }
}