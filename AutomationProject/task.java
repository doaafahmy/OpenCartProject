public class task {
    from selenium import webdriver
    from selenium.webdriver.common.by import By
    from selenium.webdriver.support.ui import Select
import time

# Initialize the Chrome driver
    driver = webdriver.Chrome()

            # Step 1: Launch browser and navigate to the URL
driver.get('http://automationexercise.com')

        # Step 3: Verify home page is visible successfully by checking the presence of a specific element
assert "Automation Exercise" in driver.title

# Step 4: Click on 'Signup / Login' button
            signup_login_button = driver.find_element(By.XPATH, "//a[contains(text(),'Signup / Login')]")
signup_login_button.click()

        # Step 5: Verify 'New User Signup!' is visible
    new_user_signup_text = driver.find_element(By.XPATH, "//h2[contains(text(),'New User Signup!')]")
            assert new_user_signup_text.is_displayed()

            # Step 6: Enter name and email address
            name_input = driver.find_element(By.NAME, "name")
    email_input = driver.find_element(By.XPATH, "//input[@data-qa='signup-email']")
            name_input.send_keys("John Doe")
            email_input.send_keys("johndoe@example.com")

            # Step 7: Click 'Signup' button
            signup_button = driver.find_element(By.XPATH, "//button[@data-qa='signup-button']")
signup_button.click()

        # Step 8: Verify that 'ENTER ACCOUNT INFORMATION' is visible
    account_info_text = driver.find_element(By.XPATH, "//b[contains(text(),'Enter Account Information')]")
            assert account_info_text.is_displayed()

            # Step 9: Fill details: Title, Name, Email, Password, Date of birth
            title_mr = driver.find_element(By.ID, "id_gender1")
title_mr.click()
    password_input = driver.find_element(By.ID, "password")
            password_input.send_keys("Password123")

            # Select Date of Birth
    days_select = Select(driver.find_element(By.ID, "days"))
            days_select.select_by_value("10")
    months_select = Select(driver.find_element(By.ID, "months"))
            months_select.select_by_value("5")  # May
            years_select = Select(driver.find_element(By.ID, "years"))
years_select.select_by_value("1990")

        # Step 10: Select checkbox 'Sign up for our newsletter!'
    newsletter_checkbox = driver.find_element(By.ID, "newsletter")
            newsletter_checkbox.click()

            # Step 11: Select checkbox 'Receive special offers from our partners!'
    offers_checkbox = driver.find_element(By.ID, "optin")
            offers_checkbox.click()

            # Step 12: Fill details: First name, Last name, Company, Address, Country, etc.
            first_name_input = driver.find_element(By.ID, "first_name")
    last_name_input = driver.find_element(By.ID, "last_name")
    company_input = driver.find_element(By.ID, "company")
    address1_input = driver.find_element(By.ID, "address1")
    address2_input = driver.find_element(By.ID, "address2")
    country_select = Select(driver.find_element(By.ID, "country"))
    state_input = driver.find_element(By.ID, "state")
    city_input = driver.find_element(By.ID, "city")
    zipcode_input = driver.find_element(By.ID, "zipcode")
    mobile_number_input = driver.find_element(By.ID, "mobile_number")

            # Filling the fields
first_name_input.send_keys("John")
        last_name_input.send_keys("Doe")
        company_input.send_keys("Example Corp")
        address1_input.send_keys("123 Main St")
        address2_input.send_keys("Suite 4")
        country_select.select_by_visible_text("United States")
        state_input.send_keys("California")
        city_input.send_keys("Los Angeles")
        zipcode_input.send_keys("90001")
        mobile_number_input.send_keys("1234567890")

        # Step 13: Click 'Create Account' button
            create_account_button = driver.find_element(By.XPATH, "//button[@data-qa='create-account']")
create_account_button.click()

        # Step 14: Verify that 'ACCOUNT CREATED!' is visible
    account_created_text = driver.find_element(By.XPATH, "//b[contains(text(),'Account Created!')]")
            assert account_created_text.is_displayed()

            # Step 15: Click 'Continue' button
            continue_button = driver.find_element(By.XPATH, "//a[@data-qa='continue-button']")
continue_button.click()

        # Ste
}
