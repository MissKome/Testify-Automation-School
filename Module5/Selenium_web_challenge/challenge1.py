import time
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager


# Using the chrome browser navigate tohttps://www.facebook.com/ fill  in  the  email/phone  andpassword text box then click the Login Button
def facebook(driver):
    # fill the email
    driver.find_element(By.XPATH, "//input[@id='email']").send_keys("marie@gmail.com")
    time.sleep(5)
    # fill the password
    driver.find_element(By.XPATH, "//input[@id='pass']").send_keys("Qwerty")
    time.sleep(5)
    # click login
    driver.find_element(By.XPATH,
                        "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]").click()


def main():
    driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
    driver.get("http://facebook.com")
    facebook(driver)


if __name__ == '__main__':
    main()
